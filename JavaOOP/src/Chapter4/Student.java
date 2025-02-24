package Chapter4;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    //Contructor:
    //public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    //Atributes:
    public String name;
    public int age;
    private double pointTest;

    //Methods:
    public void learnJava()
    {
        System.out.printf("Student name: %s with age: %d is learning Javacore, point is %.3f\n",name,age,pointTest);
    }
    public void learnJava(String message)
    {
        System.out.printf("%s ,student name: %s with age: %d is learning Javacore, point is %.3f\n",message,name,age,pointTest);
    }
    public void updatePoint()
    {
        String password = "codejava";
        System.out.println("Update point of student " + this.name);
        System.out.println("Please input admin password: ");
        Scanner input = new Scanner(System.in);
        String inputPassword = input.nextLine();
        if(Objects.equals(inputPassword, password))
        {
            System.out.println("Correct password.");
            System.out.println("Please input new point: ");
            this.pointTest = input.nextDouble();
        }
        else{
            System.out.println("Wrong password.");
        }
        System.out.println("Update complete");
    }
}
