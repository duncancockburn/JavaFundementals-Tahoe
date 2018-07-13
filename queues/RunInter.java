package queues;

public class RunInter implements Runnable{

    Thread thread;

    public RunInter(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("duncan");
        // do something
    }
}

