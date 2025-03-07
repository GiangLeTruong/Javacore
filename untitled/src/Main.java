import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
//        String[] country=new String[n];
//        System.out.println(country[0]);

        ArrayList cars = new ArrayList();
        //ArrayList<String> cars2 = new ArrayList<String>();//Generic
        cars.add(2);
        cars.add("Audi");
        cars.add("Honda");
        cars.add(true);
        System.out.println(cars);
        System.out.println(cars.size());
    }
}