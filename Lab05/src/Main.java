import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Please enter a double value: ");
            arr.add(sc.nextDouble());
            System.out.println("End?: ");
            String answer = sc.next();
            if(answer.equals("end"))
            {break;}
        }
        sc.close();
        System.out.println("Accounting of ArrayList ... ");
        double Sum=0;
        for(int i=0; i<arr.size(); i++)
        {
            Sum+=arr.get(i);
        }
        System.out.println("Sum is: "+Sum);

    }
}
