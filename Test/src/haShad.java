import static java.lang.Long.toHexString;

/**
 * @Author:XQ
 * @Date:
 */
//哈沙德数是指在某个固定的进位制当中，可以被各位数字之和整除的正整数。
//        例如 126 是十进制下的一个哈沙德数，因为(126)10 mod (1+2+6) = 0；
//        126也是八进制下的哈沙德数，因为(126)10 = (176)8，(126)10 mod (1 + 7 + 6) = 0；
//        同时 126 也是 16 进制下的哈沙德数，因为(126)10 = (7e)16，(126)10 mod (7 + e) = 0。
//        小蓝认为，如果一个整数在二进制、八进制、十进制、十六进制下均为哈沙德数，那么这个数字就是幸运数字。
//        第 1 至第 10 个幸运数字的十进制表示为：1, 2, 4, 6, 8, 40, 48, 72, 120, 126, ... 。
//        现在他想知道第 2023 个幸运数字是多少？
//        你只需要告诉小蓝这个整数的十进制表示即可。
//        本题的结果为一个整数，在提交答案时只输出这个整数，输出多余的内容将无法得分。
public class haShad {
    public static void main(String[] args) {
        int add = 0;
        for (int i = 1;;i++){
            if (add != 2023){
                String s = Integer.toHexString(i);

            }
            Integer.toHexString(i);
            //八进制为
            Integer.toOctalString(i);
            //十六进制为
            Integer.toHexString(i);
            add = add + 1;
        }
    }

}
