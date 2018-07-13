package queues;

public class ThreadClass extends Thread {

    public ThreadClass(String name){

        super(name);
        //setName(name);
        //the thread class/object calls your run() after you call start()

        //start();

    }

    //whatever is in the run method is what will execute on the thread


    @Override
    public void run() {
        //just loop a few time- sleeping on each loop to mimic a process taking some time
        for (int i = 0; i < 5; i++) {
            try {
                //put this thread to sleep for 2 seconds
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " is on count " + i);
        }
        example(getName());
    }



    //this is just to demonstrate that not all of the code has to be inside the run method. you can do what ever you
    // want as long as it just starts the run()
    public void example (String name){
        System.out.println("example " + getName());

    }
}
