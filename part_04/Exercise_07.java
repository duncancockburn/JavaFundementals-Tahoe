package part_04;


/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

class Stack {
    public static void main(String[] args) {
        Stack1 myStack = new Stack1(100);


        for (int d = 0; d < 100; d++) {         //this is putting information into the stack
            myStack.put(d);
        }

        for (int d = 0; d < 100; d++) {
            int c = myStack.get();             // this is getting the information from the queue and stores the
            // values into c one by one. then the number if printed if the following
            if (d % 2 == 0) {
                System.out.println(c);
            }
        }
    }
}




class Stack1 {

    // these members are now private

    private int stackArray[];                                       // this array holds the queue
    private int location;                                     // the put and get indices


    Stack1(int size) {                                              // this is a contructor which is used to create an object
        stackArray = new int[size];                                 // allocate memory for queue
        location = 0;
    }                                       // index

    // Put a ints into the stack.
    void put(int i) {                                              //method to see whether the you can put anything else in
        if (location == stackArray.length) {
            System.out.println(" -- Stack is full.");
            return;
        }
        stackArray[location++] = i;
    }

    public int get() {
        if (location == 0) {
            System.out.println(" -- Stack is empty.");
            return 0;
        }

        return stackArray[location--];
    }
}