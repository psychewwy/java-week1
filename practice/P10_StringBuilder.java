/**
 * P10 StringBuilder 与 String API
 *
 * 三件事：
 *   1. 用 StringBuilder 把 1~100 拼成 "1,2,3,...,100"
 *   2. "Hello World" 转全大写
 *   3. "Hello World" 截取前 5 个字符
 *   4. "Hello World" 把空格替换成 -
 *
 * 考：String 不可变 vs StringBuilder 可变、常用 API。
 */
public class P10_StringBuilder {

    public static void main(String[] args) {
        // ---------- 1. StringBuilder 拼 1~100 ----------
        // TODO：
        //   StringBuilder sb = new StringBuilder();
        //   循环 1~100，每次 append(i)；
        //   不是最后一个就 append(",")
        // 思考：为什么不用 String s = s + i？（提示：每次 + 都会 new 一个新对象）
        StringBuilder sb = new StringBuilder();
        // TODO
        System.out.println("拼接结果: " + sb);

        // ---------- 2~4. String 常用 API ----------
        String str = "Hello World";

        // TODO 2：转全大写，打印
        //   提示：toUpperCase()

        // TODO 3：截取前 5 个字符，打印
        //   提示：substring(0, 5)  —— 注意是左闭右开

        // TODO 4：把空格替换成 -，打印
        //   提示：replace(" ", "-")

        // 附加思考（写在注释里）：
        //   str.toUpperCase() 之后，str 本身变了吗？为什么？
    }
}
