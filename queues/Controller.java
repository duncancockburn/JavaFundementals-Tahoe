package queues;
/*
public class Controller {
    public static void main(String[] args) {
        System.out.println("starting main treat...");

        ThreadClass t1 = new ThreadClass("thread-1");
        ThreadClass t2 = new ThreadClass("thread-2");
        ThreadClass t3 = new ThreadClass("thread-3");

        t1.start();
        t2.start();
        t3.start();

        RunInter r1 = new RunInter("runinter-1");
        RunInter r2 = new RunInter("runinter-2");
        RunInter r3 = new RunInter("runinter-3");

        Queue myQueue = new Queue(r1);


        for (int d = 0; d < 100; d++) {         //this is putting information into the queue
            myQueue.put((myQueue) d);
        }

        for (int d = 0; d < 100; d++) {
            String c = myQueue.get();             // this is getting the information from the queue and stores the
            // values into c one by one. then the number if printed if the following
            if (d % 2 == 0) {
                System.out.println(c);
            }
        }


        try {
            t1.join();
            r1.thread.join();
            //doesnt complete main thread until t1 is complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("main thread is complete");
    }
}
*/