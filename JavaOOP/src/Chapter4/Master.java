package Chapter4;

public class Master {
    public static void main(String[] args) {
        System.out.println("Hello OOP");

        int n=3;
        Student[] sv_in_class = new Student[n];
        for(Student sv:sv_in_class)
        {
            sv=new Student("Haf",30);
            sv.name="Giang";
            sv.age=20+2;
            sv.learnJava();
        }

        Student sv2=new Student("Haf",30);
        sv2.learnJava("Chao em ");
    }
}
