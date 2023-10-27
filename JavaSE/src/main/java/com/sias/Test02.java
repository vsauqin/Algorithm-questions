package com.sias;

import java.io.File;

/**
 * @Author:XQ
 * @Date:
 */
public class Test02 {
    public static void main(String[] args) {
        File f = new File("C:/");
        String[] fileList = f.list();
        for (int  i= 0;i < fileList.length; i++){
            System.out.print(fileList[i] + "\t\t");
            System.out.print((new File("C:/", fileList[i])).isFile() ? "文件" + "\t\t" : "文件夹" + "\t\t");
            System.out.println((new File("C:/", fileList[i])).length() + "字节");
        }
    }
}
