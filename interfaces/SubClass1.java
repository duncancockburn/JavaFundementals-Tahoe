package interfaces;

class SubClass1 extends SuperClass {

    public SubClass1(int a, String b, double c) {
        super(10, "Hello", 2.5);
    }

    public void method3() {

    }

    public void method4() {

    }

    public void method5() {

    }

    public void main(String[] args) {

        SuperClass object1 = new SuperClass(1, "Yeaaaaah", 3.4);
        object1.setMethod(22);


        object1.addVar("Yoooo");
    }
}

