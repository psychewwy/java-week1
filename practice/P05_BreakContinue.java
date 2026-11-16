/**
 * P05 break 与 continue
 *
 * 要求：遍历 1~100，同时满足三条规则
 *   1. 跳过所有 7 的倍数      -> continue
 *   2. 只保留能被 3 或 5 整除的数 -> if 判断
 *   3. 一旦数值超过 80 就停止   -> break
 *
 * 正确结果应该是：3 5 6 9 10 12 15 18 20 24 25 27 30 ... 一直到 80 为止
 * （不含 7、14、21 这类 7 的倍数）
 *
 * 考：break（跳出整个循环）和 continue（跳过本次循环）的区别。
 */
public class P05_BreakContinue {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            // TODO 1：i > 80 时 break

            // TODO 2：i 是 7 的倍数时 continue

            // TODO 3：i 不能被 3 整除，也不能被 5 整除时 continue

            // TODO 4：把 i 追加到 result，后面加个空格
        }

        System.out.println("结果：" + result.toString().trim());
    }
}
