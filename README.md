# java-week1 · 第一周学习练习

> 周期：2026-11-16 ~ 2026-11-20
> 位置：`C:\Users\zengy\Desktop\快诊580\后端学习记录\java-week1`
> 独立仓库，与 `demo-api` 无关。`demo-api` 是 Spring Boot 学习工程，这里是第一周考核练习。

---

## 一、考核项对照

| # | 考核项 | 本仓库对应位置 | 状态 |
|---|---|---|---|
| 1 | 10 道基础语法练习题 | `practice/P01~P10` | ⬜ |
| 2 | 建表 + 20 条基础 SQL | `sql/week1.sql` | ⬜ |
| 3 | 代码提交 Git 仓库，记录完整 | 本仓库提交历史（≥8 次，每天有） | ⬜ |
| 4 | 口头讲解请求全过程 | 自己练，讲稿见学习计划文档 | ⬜ |

---

## 二、目录结构

```
java-week1/
├── practice/           # 10 道语法题，每道一个独立可运行文件
│   ├── P01_DataType.java
│   ├── P02_LeapYear.java
│   ├── ...
│   └── P10_StringBuilder.java
├── sql/
│   └── week1.sql       # 建库建表 + 20 条 SQL
├── deploy/
│   └── deploy.md       # 第 4 天：打包部署笔记
└── README.md
```

---

## 三、怎么跑 Java 练习

### 方式 A：命令行（最直接）

```bash
cd practice
javac -encoding UTF-8 P01_DataType.java    # 编译，生成 P01_DataType.class
java -Dfile.encoding=UTF-8 P01_DataType    # 运行
```

> ⚠️ **两个参数不能省**：Windows 下 Java 8 默认用 GBK 编码，不加这两个参数中文会输出成 `P01 �����` 这种乱码（代码没错，是编码问题）。
> `.class` 已经在 `.gitignore` 里忽略，不用管。

### 方式 B：IDEA

1. `File` → `Open` → 选中 `java-week1` 整个目录
2. 打开任意 `P0X_xxx.java`
3. 点 `main` 方法左边的绿色三角 → Run

> IDEA 默认就是 UTF-8，不会有上面的乱码问题。
> 文件都在默认包（没有 `package` 声明），IDEA 可能提示警告，忽略即可，能正常跑。

---

## 四、10 道语法题进度

| # | 文件 | 考什么 | 完成 |
|---|---|---|---|
| P01 | `P01_DataType.java` | 数据类型、类型转换、精度丢失 | ⬜ |
| P02 | `P02_LeapYear.java` | `if-else`、逻辑运算 | ⬜ |
| P03 | `P03_GradeSwitch.java` | `switch`、`case` | ⬜ |
| P04 | `P04_Loops.java` | `for` / `while` / `do-while` | ⬜ |
| P05 | `P05_BreakContinue.java` | `break` / `continue` | ⬜ |
| P06 | `P06_ArrayStats.java` | 数组遍历、最值、平均值 | ⬜ |
| P07 | `P07_BubbleSort.java` | 冒泡排序、`Arrays.sort` | ⬜ |
| P08 | `P08_ArrayReverse.java` | 原地反转、下标查找 | ⬜ |
| P09 | `P09_CharCount.java` | `String`、`charAt`、`Map`、回文 | ⬜ |
| P10 | `P10_StringBuilder.java` | `StringBuilder`、`String` API | ⬜ |

> 每题控制在 40 行以内。做完一个就把 ⬜ 改成 ✅ 并提交一次。

---

## 五、20 条 SQL 进度

全部写在 `sql/week1.sql`，每条上方已标注题目要求，把 `-- TODO` 下面补成完整 SQL。

| # | 类型 | 完成 |
|---|---|---|
| 01-04 | 插入（单条 / 指定列 / 批量） | ⬜ |
| 05-11 | 查询（条件 / 模糊 / 区间 / IN / 排序 / 分页） | ⬜ |
| 12-14 | 聚合（COUNT / GROUP BY / 最高最低平均） | ⬜ |
| 15-17 | 更新（单字段 / 批量 / 条件） | ⬜ |
| 18-19 | 删除（按 id / 按条件） | ⬜ |
| 20 | 关联查询（INNER JOIN vs LEFT JOIN 对比） | ⬜ |

---

## 六、提交规范

**目标：5 天内 ≥ 8 次提交，每天都有。**

格式：`<类型>: <做了什么>`

| 类型 | 用途 |
|---|---|
| `feat` | 新增功能 / 新做的题目 |
| `fix` | 修正错误 |
| `docs` | 文档 |
| `chore` | 杂项（初始化、配置） |
| `refactor` | 重写优化 |

合格示例：
```
feat: Day1 完成数据类型与流程控制练习 P01-P05
feat: Day2 建库建表 student/score，插入初始数据
feat: Day3 完成 20 条 SQL 练习，覆盖查询/聚合/关联
docs: 补充部署步骤说明
```

不合格（会被点名）：`update`、`提交`、`1`、`修改`、`fix bug`

---

## 七、每日环境提示

- JDK：本机已有 Java 8（`java -version` 确认）
- MySQL：本机 MySQL 8.0.46，用 Navicat 连接执行 `sql/week1.sql`
- Git 身份：**已配置为个人身份**，不要改成公司邮箱
