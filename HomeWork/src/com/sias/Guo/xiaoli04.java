package com.sias.Guo;

import java.util.Arrays;
import java.util.Random;
//产生0~100的8个随机整数，并利用冒泡排序法将其升序排序后输出

public class xiaoli04 {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(8);
        System.out.println("随机生成的整数数组：" + Arrays.toString(numbers));

        bubbleSort(numbers);
        System.out.println("排序后的整数数组：" + Arrays.toString(numbers));
    }

    public static int[] generateRandomNumbers(int count) {
        int[] numbers = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(101); // 生成0~100的随机整数
        }
        return numbers;
    }

    public static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 交换相邻两个元素
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
