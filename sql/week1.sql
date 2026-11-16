-- ============================================================
-- 第一周 SQL 练习 week1.sql
-- 目标：建库建表 + 20 条基础 SQL
-- 执行方式：Navicat 里打开本文件，逐段执行（Ctrl+Shift+R 执行全部）
-- 注意：每条 SQL 上方已写明要求，把 -- TODO 下面补成完整 SQL
-- ============================================================


-- ============================================================
-- 第一部分：建库建表（考核项 2 的前半）
-- ============================================================

CREATE DATABASE IF NOT EXISTS demo_week1 DEFAULT CHARSET utf8mb4;
USE demo_week1;

-- TODO 1：创建 student 表
-- 字段要求：
--   id           BIGINT 主键自增
--   name         VARCHAR(50)  非空，注释「姓名」
--   age          INT          可空，注释「年龄」
--   gender       TINYINT      默认 0，注释「0未知 1男 2女」
--   class_name   VARCHAR(50)  可空，注释「班级」
--   create_time  DATETIME     默认当前时间
-- 要求 ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
DROP TABLE IF EXISTS student;
CREATE TABLE student (
    -- TODO: 在这里写字段
);


-- TODO 2：创建 score 表
-- 字段要求：
--   id          BIGINT 主键自增
--   student_id  BIGINT       非空，注释「学生id」
--   subject     VARCHAR(30)  非空，注释「科目」
--   score       DECIMAL(5,2) 可空，注释「分数」
--   exam_time   DATETIME     默认当前时间
-- 要求：给 student_id 建普通索引 idx_student_id
DROP TABLE IF EXISTS score;
CREATE TABLE score (
    -- TODO: 在这里写字段
);


-- ============================================================
-- 第二部分：20 条基础 SQL
-- 建议顺序执行，后面的查询依赖前面的插入数据
-- ============================================================


-- ---------- 插入类（1-4）----------

-- SQL 01：向 student 插入 1 条完整记录（所有字段都写）
-- TODO


-- SQL 02：只给 name、age 插入 1 条（其余字段走默认值）
-- TODO


-- SQL 03：一条 SQL 批量插入 3 条学生记录
-- 提示：INSERT INTO student (name, age, ...) VALUES (...), (...), (...);
-- TODO


-- SQL 04：向 score 插入 5 条成绩，对应不同学生、不同科目
-- TODO


-- ---------- 查询类（5-11）----------

-- SQL 05：查 student 全部记录
-- TODO


-- SQL 06：查 age > 18 的学生
-- TODO


-- SQL 07：按 name 模糊查，找名字里带「张」的学生
-- 提示：LIKE CONCAT('%', '张', '%')
-- TODO


-- SQL 08：查 age 在 18 到 22 之间的学生
-- 提示：BETWEEN ... AND ...
-- TODO


-- SQL 09：查班级是「一班」或「二班」的学生
-- 提示：IN (...)
-- TODO


-- SQL 10：按 age 降序、id 升序排序
-- TODO


-- SQL 11：分页，取第 2~4 条（从第 2 条开始取 3 条）
-- 提示：LIMIT offset, size
-- TODO


-- ---------- 聚合类（12-14）----------

-- SQL 12：统计学生总数
-- TODO


-- SQL 13：求每个学生的总分、平均分
-- 提示：GROUP BY student_id
-- TODO


-- SQL 14：求每门科目的最高分、最低分、平均分
-- 提示：GROUP BY subject，配合 MAX/MIN/AVG
-- TODO


-- ---------- 更新类（15-17）----------

-- SQL 15：把 id=1 的学生的年龄改成 20
-- TODO


-- SQL 16：把某个班级所有学生的年龄 +1
-- 提示：SET age = age + 1
-- TODO


-- SQL 17：把某条成绩改成分数（条件更新，比如 student_id=1 AND subject='数学'）
-- TODO


-- ---------- 删除类（18-19）----------

-- SQL 18：按 id 删除一条成绩记录
-- TODO


-- SQL 19：删除某个学生的所有成绩（按条件删除）
-- TODO


-- ---------- 关联查询（20，重点）----------

-- SQL 20：关联查询
-- 20-1：INNER JOIN 查「学生姓名 + 科目 + 分数」
-- TODO

-- 20-2：LEFT JOIN 同样查一遍，对比两者结果差异
-- TODO

-- 20-3：（思考题，写在注释里）为什么 LEFT JOIN 比 INNER JOIN 多出记录？
-- 答：


-- ============================================================
-- 自检清单（跑完自己在心里过一遍）
--   □ 两张表的字段类型、默认值、注释都写对了吗
--   □ DECIMAL(5,2) 是什么意思？能存 123.456 吗？为什么
--   □ LIMIT 2,3 取的是第几条到第几条
--   □ GROUP BY 之后，SELECT 里能出现哪些列
--   □ INNER JOIN 和 LEFT JOIN 的结果差在哪
-- ============================================================
