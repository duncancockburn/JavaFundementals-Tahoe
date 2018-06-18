package part_05;

/**
 * Write one class. This class must make use of an inner/nested class.
 *
 * Within the nested class, set the instance variables of the outer class.
 *
 * Also, within the inner class, call at least two methods that have a return type of int.
 *
 * Add these two ints together and set a final instance variable in the outer with this value.
 */

class RubgyTeams{
    public int a = 0;
    public int b = 0;


    static class ScottishRugby{

        public String c ="Edinburgh";

        public int method1(int a, int b){
            return a+b;
        }
        public int method2(int c, int d){
            return c+d;
        }

    }

    public static void main(String[] args) {
     ScottishRugby object = new ScottishRugby();
        System.out.println(object.method1(5,4));
        System.out.println(object.method2(30,98));



    }
}
