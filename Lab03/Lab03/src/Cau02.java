import java.util.Scanner;

public class Cau02 {
    static void MultiplicationTable(int x){
        for(int i=0; i<=10;i++)
        {
            System.out.printf("%d x %d = %d\n",x,i,(x*i));
        }
    }
    public static void main(String[] args) {
        System.out.println("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("Multiplication Table of %d is:\n",num);
        MultiplicationTable(num);
    }
}