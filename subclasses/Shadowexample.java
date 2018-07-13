package subclasses;

public class Shadowexample {
    public int x = 0;

    class InnerClass {

        public int x = 1;

        void method1(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + Shadowexample.this.x);
        }
    }

    public static void main(String... args) {
        Shadowexample st = new Shadowexample();
        InnerClass object1 = st.new InnerClass();
        object1.method1(23);
    }

}
