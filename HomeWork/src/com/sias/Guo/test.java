package com.sias.Guo;

/**
 * @Author:XQ
 * @Date:
 */
public class test {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int n = 2;
        //System.out.println(b -= a*a);
        System.out.println(a += b -= a * a);
        System.out.println(n += n -= n*n);
    }
}
