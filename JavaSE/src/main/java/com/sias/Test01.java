package com.sias;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Author:XQ
 * @Date:
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        File f = new File("D:" + File.separator + "test.txt");
        // 实例化输出流
        OutputStream out = new FileOutputStream(f);
        // 指定ISO8859-1编码
        byte b[] = "C语言中文网，你好！".getBytes("utf-8");
        // 保存转码之后的数据
        out.write(b);
        // 关闭输出流
        out.close();
    }
}
