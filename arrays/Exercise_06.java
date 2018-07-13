package arrays;


/**

 Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the queue.

 expected output: 0,2,4,6,8.....100

 */
class Example {
    public static void main(String[] args) {
        Queue myQueue = new Queue(100);


        for (int d = 0; d < 100; d++) {         //this is putting information into the queue
            myQueue.put((char) d);
        }

        for (int d = 0; d < 100; d++) {
            int c = myQueue.get();             // this is getting the information from the queue and stores the
                                                // values into c one by one. then the number if printed if the following
            if (d % 2 == 0) {
                System.out.println(c);
            }
        }
    }
}




class Queue {

    // these members are now private

    private int q[];                                       // this array holds the queue
    private int putloc, getloc;                             // the put and get indices

    Queue(int size) {                                       // this is a contructor which is used to create an object
        q = new int[size];                                 // allocate memory for queue
        putloc = getloc = 0;}                               // index

        // Put a characer into the queue.
        void put(int ch) {                                 //method to see whether the you can put anything else in
        if(putloc==q.length) {
            System.out.println(" -- Queue is full.");
            return;}
            q[putloc++] = ch;
    }


        // Get a character from the queue.
        int get() {                                            //method to change
            if(getloc == putloc) {
                System.out.println(" -- Queue is empty.");
                return 0;
            }

            return q[getloc++];
        }
}