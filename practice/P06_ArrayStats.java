import java.util.Arrays;

/**
 * P06 数组统计
 *
 * 给一个数组，求：最大值、最小值、总和、平均值。
 *
 * 考：数组遍历、初始值怎么设、整数除法转浮点。
 */
public class P06_ArrayStats {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};

        // TODO 1：打印数组内容
        //   提示：Arrays.toString(arr)

        // TODO 2：求最大值
        //   陷阱：max 的初始值不要写 0（数组全是负数就错了）
        //        写成 arr[0] 最稳
        int max = arr[0];

        // TODO 3：求最小值
        int min = arr[0];

        // TODO 4：求和
        int sum = 0;

        // TODO 5：求平均值
        //   陷阱：sum / arr.length 是整数除法，5.5 会变成 5
        //        要写成 (double) sum / arr.length
        double avg = 0;

        // TODO 6：打印结果

    }
}
