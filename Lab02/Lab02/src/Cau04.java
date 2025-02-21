import java.util.Scanner;


public class Cau04 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh to chuc menu");
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");


        int opt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao lua chon cua ban: ");
        opt = sc.nextInt();

        switch (opt) {
            case 1:
                Cau01.main(args);
                break;
                case 2:
                    Cau02.main(args);
                    break;
                    case 3:
                        Cau03.main(args);
                        break;
                        default:
                            System.out.println("Exit.");
                            break;
        }


    }
}