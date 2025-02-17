import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Age: ");
        int age = sc.nextInt();

        age++;
        System.out.println("My age is : " + age + " and my name : " + name);
        System.out.printf("My age is: %d + and my name: %s", age, name);
    }
}