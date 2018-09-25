import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);  //     pro15
      double v1 =scn.nextFloat();
        double v2 =scn.nextFloat();


           double z1 = v1 * 0.454;
         double  z2 = v2  * 2.54;
        System.out.println("磅為"+z1 );
        System.out.println("吋為"+z2 );

    }
}
