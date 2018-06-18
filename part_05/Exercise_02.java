package part_05;


/**
 * Write two classes.
 *
 * In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance to a method_01 within
 * Class_01.
 *
 * Within method_01 you ust manipulate several private instance variables within Class_02.
 *
 * Then, from within method_01, pass the instance of Class_02 to a new method, method_02.
 * Within method_02 modify the instance variables of Class_02 once again.
 *
 * Use System.out.println at various points to demonstrate the flow of execution and the varying state of
 * each private variable. You can name these classes whatever you want.
 *
 */


class Duncan
{
    public static void main (String[] args)
    {
        Sister hannah1 = new Sister("Hannah", 1);
        System.out.println("Sister name :" + hannah1.name +
                " and Hannah age :" + hannah1.age);
        Andrew andrew1 = new Andrew("Andy", 2);
        System.out.println("Bros name :" + andrew1.name + "and andys age :" + andrew1.age);

        System.out.println("number of sister" + Sister.count);


    }
}


class Sister {
    String name;
    int age;
    static int count;

    Sister(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
}



class Andrew {
    String name;
    int age;

    Andrew(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
