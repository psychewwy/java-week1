import java.util.Arrays;

/**
 * P08 数组反转与查找
 *
 * 两件事：
 *   1. 原地反转数组（不新建数组，用交换）
 *   2. 查找某元素第一次出现的下标，找不到返回 -1
 *
 * 考：双指针交换、循环边界、返回值设计。
 */
public class P08_ArrayReverse {

    /**
     * 原地反转：首尾交换，中间往内收
     */
    public static void reverse(int[] arr) {
        // TODO：用两个指针 i=0、j=arr.length-1，交换后 i++、j--，直到 i >= j
    }

    /**
     * 查找第一次出现的下标
     * @return 下标，找不到返回 -1
     */
    public static int indexOf(int[] arr, int target) {
        // TODO：遍历比较，命中就 return i；循环结束还没命中就 return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // TODO 1：打印反转前后
        System.out.println("反转前: " + Arrays.toString(arr));
        // reverse(arr);
        System.out.println("反转后: " + Arrays.toString(arr));

        // TODO 2：查 3 和 99 的下标
        //   indexOf(arr, 3)  应该返回对应下标
        //   indexOf(arr, 99) 应该返回 -1
    }
}
