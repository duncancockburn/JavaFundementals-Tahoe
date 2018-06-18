package part_06;

class A {

    private int a;
    private int b;
    private int c;
    private int d;
    private String e;


    public A(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public A(String e){
        this.e = e;

    }

        void setA(int a){
        this.a = a;
        }

        void addVar ( int a, int b){
        this.a += a;
        this.b += b;



        }

}

