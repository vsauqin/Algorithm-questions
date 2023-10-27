package com.sias.Guo;

public class xioali2 {
    public static void main(String[] args) {
        int ropeLength = 3000;
        int days = 0;

        do {
            ropeLength /= 2;
            days++;
        } while (ropeLength >= 5);

        System.out.println("需要 " + days + " 天时间绳子长度会短于5m");
    }
}
