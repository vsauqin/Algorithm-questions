package com.sias.Guo;

public class xiaoli05 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            int temp = num;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(temp + " ");
                temp += i + j;
            }
            num++;
            System.out.println();
        }
    }
}
