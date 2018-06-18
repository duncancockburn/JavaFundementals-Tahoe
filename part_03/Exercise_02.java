package part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method.

 The two other methods need to use the "return" keyword.

 Use the values returned from these two methods to accomplish a task.

 For instance, create a main() method, a multiply(int a, int b) method, and a divide(int a, int b) method.

 From the main method call the multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

class controller{
    public static void main(String[] args) {
        controller obj = new controller();
        int sum = obj.method1(10, 20);
        System.out.println(sum);
        controller obj1 = new controller();
        double div = obj1.method2(100.32, 200.2);
        System.out.println(div);



    }


    public int method1(int a, int b){
        return (a*b);

        }

    public double method2(double a, double b){
        return (a/b);
    }

}