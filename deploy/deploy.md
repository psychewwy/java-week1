# 第 4 天：打包部署笔记

> 边做边填。做完把每一步的实际输出记下来，口头被问到时直接翻这份。

---

## 一、Maven 打包

```bash
# 在 demo-api 目录下
mvn clean package -DskipTests
```

- `clean`：删掉 target 目录
- `package`：编译 + 打包成 jar
- `-DskipTests`：跳过测试（练习阶段够用，正式发布别跳）

产物位置：
```
target/demo-api-1.0.0.jar
```

记录实际产物名：___________

**面试常问**：`mvn clean package` 和 `mvn install` 的区别？
答：package 只打包到 target；install 除了打包还会装进本地仓库（`~/.m2`），供别的项目依赖。

---

## 二、Linux 上启动

```bash
# 上传 jar（用 scp 或堡垒机的文件传输）
scp target/demo-api-1.0.0.jar user@host:/data/app/

# 后台启动
cd /data/app
nohup java -jar demo-api-1.0.0.jar > app.log 2>&1 &

# 看日志
tail -f app.log

# 确认进程在
ps -ef | grep demo-api

# 确认端口在听
netstat -tlnp | grep 8080
```

**参数解释**（被问到要能说）：
- `nohup`：忽略挂断信号，退出 SSH 后进程不死
- `>`：标准输出重定向到 app.log
- `2>&1`：把错误输出也并到标准输出（这样报错也进日志）
- `&`：后台运行

停止：
```bash
kill -9 <pid>
```

---

## 三、Nginx 反向代理

配置文件位置（Linux）：`/etc/nginx/conf.d/demo.conf`

```nginx
server {
    listen 80;
    server_name localhost;

    location /api/ {
        proxy_pass http://127.0.0.1:8080/;
        proxy_set_header Host $host;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
    }
}
```

生效：
```bash
nginx -t          # 先测语法，别直接 reload
nginx -s reload
```

验证：
```bash
curl http://localhost/api/user/list
```

**两个最容易踩的坑**：
1. `proxy_pass` 末尾的 `/` —— 有斜杠会剥掉 `/api` 前缀，没斜杠会保留。写错就 404。
2. `nginx -t` 不通过千万别 reload，会把 Nginx 搞挂。

---

## 四、整条链路验证

```
浏览器 / curl  ->  Nginx(80)  ->  Tomcat(8080)  ->  Controller -> Service -> Mapper -> MySQL
```

| 环节 | 验证命令 | 结果 |
|---|---|---|
| 服务活着 | `ps -ef \| grep java` | ⬜ |
| 端口在听 | `netstat -tlnp \| grep 8080` | ⬜ |
| 直连后端 | `curl localhost:8080/user/list` | ⬜ |
| 过 Nginx | `curl localhost/api/user/list` | ⬜ |
| 看应用日志 | `tail -f app.log` | ⬜ |
| 看 Nginx 日志 | `tail -f /var/log/nginx/access.log` | ⬜ |

> 这张表就是口头讲解第 4 题的基础——你能按这个顺序排出问题，讲解时说出来就很有说服力。

---

## 五、实际执行记录

| 步骤 | 命令 / 操作 | 实际结果 |
|---|---|---|
| 1. 打包 | | |
| 2. 上传 | | |
| 3. 启动 | | |
| 4. 配 Nginx | | |
| 5. 验证 | | |
