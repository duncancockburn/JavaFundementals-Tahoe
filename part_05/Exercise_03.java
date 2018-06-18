package part_05;

/**
 * Write two classes.
 *
 * In Class_01 have a main method that creates an instance of Class_02. DONE
 *
 * In Class_02, demonstrate method overloading. DONE
 *
 * You must overload a method a least 3 times. DONE
 *
 * Each method should have a return type that is not void. DONE
 *
 * Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02. DONE
 *
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */


class Robots{

    public static void main(String[] args) {

        UrRobot alex = new UrRobot(1, 3, "West", 4);

        alex.method1(1,3);
        alex.method1(200);
        alex.method1(2.4,3.5);

    }
    }


class UrRobot {
    public UrRobot(int i, int i1, String east, int i2) {
        }

    public int method1 (int a, int b){
    return a+b;
    }

    public int method1 (double c, double d){
        return (int) (c + d);
    }

    public int method1 (long e){
        return (int) (e);
    }


}
