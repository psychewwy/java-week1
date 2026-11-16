/**
 * P02 判断闰年
 *
 * 规则：能被 4 整除但不能被 100 整除，或者能被 400 整除。
 * 即：(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
 *
 * 考：if-else、逻辑运算符 && || !、取模 %
 */
public class P02_LeapYear {

    /**
     * 判断是否闰年
     * @param year 年份
     * @return true 是闰年，false 不是
     */
    public static boolean isLeapYear(int year) {
        // TODO: 按上面的规则实现
        return false;
    }

    public static void main(String[] args) {
        // TODO：用下面几个年份验证，正确的输出应该是 闰年/平年 交替
        //   2024 -> 闰年
        //   2023 -> 平年
        //   1900 -> 平年（能被 100 整除但不能被 400 整除）
        //   2000 -> 闰年（能被 400 整除）
        int[] years = {2024, 2023, 1900, 2000};

        for (int year : years) {
            // TODO：调 isLeapYear 并打印结果
        }
    }
}
