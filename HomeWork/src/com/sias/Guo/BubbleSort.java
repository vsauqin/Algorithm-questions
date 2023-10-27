package com.sias.Guo;

/**
 * @Author:XQ
 * @Date:
 */
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(8, 0, 100);
        System.out.println("生成的随机数组：" + Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }

    // 生成指定长度的随机整数数组
    public static int[] generateRandomArray(int length, int min, int max) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }

    // 冒泡排序算法
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换arr[j]和arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

