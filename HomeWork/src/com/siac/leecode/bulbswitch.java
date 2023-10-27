package com.siac.leecode;

/**
 * @Author:XQ
 * @Date:
 */
public class bulbswitch {
    public int find(int n){
        int s,i;
        if (n == 0){
            s = 0;
        }else{
            i = 2;
            s = 1;
            while(i * i <= n){
                s ++;
                i ++;
            }
        }
        return s;
    }
}
