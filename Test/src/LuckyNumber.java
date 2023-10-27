/**
 * @Author:XQ
 * @Date:
 */
//【问题描述】
//        哈沙德数是指在某个固定的进位制当中，可以被各位数字之和整除的正整数。
//        例如 126 是十进制下的一个哈沙德数，因为(126)10 mod (1+2+6) = 0；
//        126也是八进制下的哈沙德数，因为(126)10 = (176)8，(126)10 mod (1 + 7 + 6) = 0；
//        同时 126 也是 16 进制下的哈沙德数，因为(126)10 = (7e)16，(126)10 mod (7 + e) = 0。
//        小蓝认为，如果一个整数在二进制、八进制、十进制、十六进制下均为哈沙德数，那么这个数字就是幸运数字。
//        第 1 至第 10 个幸运数字的十进制表示为：1, 2, 4, 6, 8, 40, 48, 72, 120, 126, ... 。
//        现在他想知道第 2023 个幸运数字是多少？
//        你只需要告诉小蓝这个整数的十进制表示
    //真的难
public class LuckyNumber {
    public static boolean isHarshad(int num, int base) {
        String numStr = Integer.toString(num, base);
        int sum = 0;
        for (char c : numStr.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return num % sum == 0;
    }

    public static int findLuckyNumber(int n) {
        int count = 0;
        int num = 1;
        while (count < n) {
            if (isHarshad(num, 2) && isHarshad(num, 8) && isHarshad(num, 10) && isHarshad(num, 16)) {
                count++;
            }
            num++;
        }
        return num - 1;
    }

    public static void main(String[] args) {
        int n = 2023;
        int luckyNumber = findLuckyNumber(n);
        System.out.println("第 " + n + " 个幸运数字是：" + luckyNumber);
    }
}
