package part_03;

public class Student {

    private int ID;
    private int age;
    private String name;
    private static int studentCounter = 1;


    public Student(int age, String name) {          // this is a contructor
        this.ID = studentCounter;                   //this key work is used to make the
        this.age = age;
        this.name = name;
        studentCounter++;
    }

    public Student(String name) {
        this.ID = studentCounter;
        this.name = name;
        studentCounter++;
        }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getStudentCounter() {
        return studentCounter;
    }

    public static void setStudentCounter(int studentCounter) {
        Student.studentCounter = studentCounter;
    }
}


