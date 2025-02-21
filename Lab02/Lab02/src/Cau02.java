import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Cau02 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh  ax^2 + bx + c = 0");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap gia tri a = ");
        a = sc.nextInt();
        System.out.println("Moi nhap gia tri b = ");
        b = sc.nextInt();
        System.out.println("Moi nhap gia tri c = ");
        c = sc.nextInt();

        if(a == 0)
        {
            System.out.println("Do a = 0, phuong trinh tro thanh dang  bx + c = 0");
            if(b==0 && c==0)
            {
                System.out.println("Phuong trinh vo so nghiem.");
            }
            else if(b==0 && c!=0)
            {
                System.out.println("Phuong trinh vo nghiem.");
            }
            else{
                System.out.printf("Phuong trinh co nghiem x = -c/b = %.3f",-c/(double)b );
            }
        }
        else{
            double delta = b*b-4*a*c;
            if(delta < 0)
            {
                System.out.println("Phuong trinh vo nghiem.");
            }
            else if(delta == 0)
            {
                System.out.printf("Phuong trinh co nghiem kep x = -b/2a = %.3f",-b/((double)a*2) );
            }
            else{
                System.out.println("Phuong trinh co 2 nghiem rieng biet");
                System.out.printf("- x1 = (-b + sqrt(delta))/2a = %.3f\n",(-b + sqrt(delta))/((double)a*2) );
                System.out.printf("- x2 = = (-b - sqrt(delta))/2a = %.3f",(-b - sqrt(delta))/((double)a*2) );
            }

        }


    }
}