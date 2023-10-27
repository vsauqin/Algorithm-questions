package com.sias.Guo;

import java.util.Scanner;

/**
 * @Author:XQ
 * @Date:
 */
public class newtest {
    public static void main(String[] args) {
        int a ;
        int b;
        int sum = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        for (int i = a; i <= b; a++) {

            int temp = a;
            while (temp > 0) {
                c = temp % 10;
                sum = sum * 10 + c;
                temp = temp / 10;
            }
            i++;
        }
        System.out.println(sum);
        sum = sum % 9;
        System.out.println(sum);
    }
}
