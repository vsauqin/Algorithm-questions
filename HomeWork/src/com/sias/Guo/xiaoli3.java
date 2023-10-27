package com.sias.Guo;

import java.util.Scanner;

public class xiaoli3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " 是完全数。");
        } else {
            System.out.println(number + " 不是完全数。");
        }
    }

}
