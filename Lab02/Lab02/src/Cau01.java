import java.util.Scanner;

public class Cau01 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh ax +b = 0");
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap gia tri a = ");
        a = sc.nextInt();
        System.out.println("Moi nhap gia tri b = ");
        b = sc.nextInt();

        if(a==0 && b==0)
        {
            System.out.println("Phuong trinh vo so nghiem.");
        }
        else if(a==0 && b!=0)
        {
            System.out.println("Phuong trinh vo nghiem.");
        }
        else{
            System.out.printf("Phuong trinh co nghiem x = -b/a = %.3f",-b/(double)a );
        }

    }
}