import java.util.Scanner;

public class Cau_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Input your name: ");
        String name=sc.nextLine();
        System.out.println("Input your point: ");
        double point=sc.nextDouble();

        System.out.printf("Your name is %s, and your point is %.2f",name,point);


    }
}