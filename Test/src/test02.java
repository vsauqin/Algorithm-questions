/**
 * @Author:XQ
 * @Date:
 */
public class test02 {
    public static void main(String[] args) {
//        System.out.println("nihaoshijei ");
        System.out.println("hello");
        long a = 0;
        long factoe = 1;
        for (int i = 1; i <= 202320232023L; i++){
            factoe = (factoe * i) % 1000000000 ;
            //System.out.println(factoe);
            a = (a + factoe) % 1000000000 ;
            //System.out.println(a + "l");
        }
        System.out.println(a);
    }
}
