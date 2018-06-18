package part_05;

/**
 * Write two classes. Class_01 should have the main(). DONE
 * Class_02 must have 3 or more private variables.
 * Class_02 must also have at least 3 overloaded constructors.
 * In Class_01.main() create several instances of Class_02 using each overloaded constructor.
 * Each constructor should do something slightly differently.
 * Class_02 must have at least two private instance variables.
 *
 * Using the various instances of Class_02 that you now have in Class_01, call a method within each instance of
 * Class_02 to modify Class_02's private instance variables.
 *
 */

class Coffee{
    public static void main(String[] args) {
    Tea tea1 = new Tea();
    tea1.getI();
    tea1.setI(2);

    Tea tea2 = new Tea();
    tea2.getMilk();
    tea2.setMilk(true);

    Tea tea3 = new Tea();
    tea3.getType();
    tea3.setType("Spanish");

    Tea tea4 = new Tea();
    tea4.getS();
    tea4.setS("weak");
    }
}

class Tea {

    private int i;
    private String s;
    private Boolean milk;
    private String type;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Boolean getMilk() {
        return milk;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    Tea() {
        i = 5;
        s = "very strong";
        milk = true;
        type = "english";
    }

    Tea(int y) {
        i = y;
    }

    Tea (String type1){
        type = type1;

        System.out.println(type);
    }


}
