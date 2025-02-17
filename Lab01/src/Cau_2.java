import java.util.Scanner;

public class Cau_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Input your rectangle long edge: ");
        double a=sc.nextDouble();
        System.out.println("Input your rectangle short edge: ");
        double b=sc.nextDouble();

        System.out.println("Result is: ");
        System.out.println("- P = " + (a+b)*2);
        System.out.println("- S = " + (a*b));
        System.out.println("- Min edge = " + Math.min(a, b));

    }
}