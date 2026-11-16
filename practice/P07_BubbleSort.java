import java.util.Arrays;

/**
 * P07 冒泡排序
 *
 * 要求：
 *   1. 自己实现冒泡排序对数组升序排列
 *   2. 再用 Arrays.sort() 实现一遍，对比写法
 *
 * 冒泡原理：相邻两个比较，大的往后换，一轮下来最大值就沉到末尾了。
 * 外层循环控制「轮数」，内层控制「每轮比较次数」。
 *
 * 考：双重循环、数组元素交换。
 */
public class P07_BubbleSort {

    /** 手写冒泡排序 */
    public static void bubbleSort(int[] arr) {
        // TODO：实现冒泡排序
        //   for (int i = 0; i < arr.length - 1; i++) {        // 轮数
        //       for (int j = 0; j < arr.length - 1 - i; j++) { // 每轮比较
        //           if (arr[j] > arr[j + 1]) { 交换 }
        //       }
        //   }
        //   思考：为什么内层要 -i？
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 7, 3};
        int[] b = {5, 2, 9, 1, 7, 3};

        // TODO 1：对 a 调 bubbleSort，打印排序前后
        System.out.println("冒泡前: " + Arrays.toString(a));
        // bubbleSort(a);
        System.out.println("冒泡后: " + Arrays.toString(a));

        // TODO 2：对 b 调 Arrays.sort，打印排序前后，对比结果
        System.out.println("sort前: " + Arrays.toString(b));
        // Arrays.sort(b);
        System.out.println("sort后: " + Arrays.toString(b));
    }
}
