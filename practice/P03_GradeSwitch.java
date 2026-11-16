/**
 * P03 成绩等级（switch）
 *
 * 规则：90 及以上「优」，80 及以上「良」，60 及以上「及格」，否则「不及格」。
 *
 * 考：switch 的写法。
 * 提示：switch 不能直接判断区间（case 只能匹配具体值），
 *       所以先把分数除以 10 变成 0~10 的整数，再 switch。
 *       例如 85 / 10 = 8 -> case 8、case 9 都是「良」以上。
 */
public class P03_GradeSwitch {

    public static String grade(int score) {
        if (score < 0 || score > 100) {
            return "分数非法";
        }
        // TODO: 用 switch 实现
        //   int level = score / 10;
        //   switch (level) {
        //       case 10:
        //       case 9:  return "优";
        //       ...
        //   }
        return "未实现";
    }

    public static void main(String[] args) {
        // TODO：验证这些分数
        //   95 -> 优    88 -> 良    60 -> 及格    59 -> 不及格    101 -> 分数非法
        int[] scores = {95, 88, 60, 59, 101};
        for (int s : scores) {
            // TODO：打印 "分数 95 的等级是 优"
        }
    }
}
