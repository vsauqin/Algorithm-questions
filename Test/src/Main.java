/**
 * @Author:XQ
 * @Date:
 */
public class Main {
    public static void main(String[] args) {
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= 202320232023L; i++) {
            factorial *= i;
            sum += factorial;
        }
        String sumStr = String.valueOf(sum);
        System.out.println(sumStr.substring(sumStr.length() - 9));
    }
}