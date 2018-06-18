package part_07;

public class SuperClass implements Interface {
    private int a;
    private String b;
    private double c;


    public SuperClass(int a, String b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void main(String[] args) {

    }

    public void method2(int a) {

    }

    public void method3(int b) {

    }


    void setMethod(int a) {
        this.a = a;
    }

    void addVar(String b) {
        this.b = b;

    }



    @Override
    public void someMethod(long someParam) {

    }
}
