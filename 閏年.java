import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);     //pro27.
        int z1 = scn.nextInt();
        if (z1%4==0) {
            System.out.println("true");
        }else if(z1%100==0) {
            System.out.println("flase");
        }else if(z1%400==0) {
            System.out.println("true");
        }else if(z1%4!=0){
            System.out.println("flase");
        }

        int a1 = scn.nextInt();
        if (z1%4==0) {
            System.out.println("true");
        }else if(a1%100==0) {
            System.out.println("flase");
        }else if(a1%400==0) {
            System.out.println("true");
        }else if(a1%4!=0){
            System.out.println("flase");
        }

        int b1 = scn.nextInt();
        if (b1%4==0) {
            System.out.println("true");
        }else if(b1%100==0) {
            System.out.println("flase");
        }else if(b1%400==0) {
            System.out.println("true");
        }else if(b1%4!=0){
            System.out.println("flase");
        }


    }
}
