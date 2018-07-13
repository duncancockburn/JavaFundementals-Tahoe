package subclasses;

/**
 * Write three classes. The Class_01 should contain the main method.
 * The main method should create an instance of Class_02. Class_02 must have several private instance variables.
 * Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables.
 * Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class BoozeController {

    public static void main(String[] args) {
    Lager lager1 = new Lager();
    lager1.method1(5,"Tennents");
    }
}



 class Lager {

     public String getB() {
         return b;
     }

     public void setB(String b) {
         this.b = b;
     }

     public int getA() {
         return a;
     }

     public void setA(int a) {
         this.a = a;
     }

     private String b;
     private int a;


     int method1(int a, String b) {
         return 0;
     }


     void method3() {
         Cider cider1 = new Cider();
         cider1.method2(6, "magners");

     }
 }



 class Cider {

     public int getA() {
         return 0;
     }

     public void setA(int a) {
         this.a = a;
     }

     public String getB() {
         return b;
     }

     public void setB(String b) {
         this.b = b;
     }

     private int a;
    private String b;

    void method2 (int a, String b){


    }

 }