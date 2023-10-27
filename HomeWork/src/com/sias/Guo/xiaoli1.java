package com.sias.Guo;

import java.util.Scanner;

public class xiaoli1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个5位数：");
        int num = input.nextInt();
        int temp = num;
        int reversedNum = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            reversedNum = reversedNum * 10 + remainder;
            temp /= 10;
        }
        if (num == reversedNum) {
            System.out.println(num + "是回文数。");
        } else {
            System.out.println(num + "不是回文数。");
        }
    }
}
