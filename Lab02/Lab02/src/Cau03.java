import java.util.Scanner;

public class Cau03 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tien dien");
        int sodien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so dien cua ban: ");
        sodien = sc.nextInt();

        if(sodien >= 0 && sodien <= 100)
        {
            System.out.println("Gia moi so dien la 1000 dong.");
            System.out.printf("Tong tien can thanh toan la: So dien * 1000 = %d", sodien*1000);
        }
        else if(sodien > 100){
            System.out.println("Gia moi so dien vuot muc 100, la 1500 dong.");
            System.out.printf("Tong tien can thanh toan la: (100 * 1000)+(So dien - 100)*1500 = %d", (100 * 1000)+(sodien - 100)*1500);
        }
        else{
            System.out.println("Vui long khong nhap gia tri am.");
        }


    }
}