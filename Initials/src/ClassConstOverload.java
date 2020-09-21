import java.util.Scanner;

public class ClassConstOverload {
    public static void main(String[] args) {
        Student[] s = new Student[2];
        s[0] = new Student();
        s[1] = new Student("S2");
        s[0].putData(1);
        s[1].putData(2);
    }
}

class Student {
    public String stu_name;
    public int age;


    public Student(String stu_name) {
        this.stu_name = stu_name;
        this.age = getAge();
    }

    public Student() {
        this.stu_name = "Unknown";
        this.age = getAge();
    }

    public int getAge() {
        System.out.print("Enter student age: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    public void putData(int s) {
        System.out.println("Student "+s+"\nSname: "+this.stu_name+"\nStAge: "+this.age);
    }
}
