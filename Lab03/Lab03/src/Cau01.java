import java.util.Scanner;

public class Cau01 {
    static boolean isPrime(int x){
        if(x<=0)
        {
            return false;
        }
        for (int i = 2; i <= x/2; i++) {
            if(x%i==0)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}