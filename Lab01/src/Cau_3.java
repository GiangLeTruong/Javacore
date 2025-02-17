import java.util.Scanner;

public class Cau_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Input your square edge: ");
        double a=sc.nextDouble();

        System.out.println("Result is: ");
        System.out.println("- P = " + (a)*4);
        System.out.println("- S = " + (Math.pow(a,2)));
        System.out.println("- V = " + (Math.pow(a,3)));

    }
}