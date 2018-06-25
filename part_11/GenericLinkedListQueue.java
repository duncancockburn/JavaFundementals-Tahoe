package part_11;

import java.util.LinkedList;

/**
 * Modify your Queue Class so that it is completely generic
 */


class GenQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();           //this is a linked list which

    public void enqueue(E item) {
        list.addLast(item);
    }

    public E dequeue() {
        return list.poll();
    }

    public boolean hasItems() {
        return !list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q) {
        while (q.hasItems())
            list.addLast(q.dequeue());
    }
}



class GenQueueTest {
    public static void main(String[] args) {
        GenQueue<Employee> empList;
        empList = new GenQueue<Employee>();

        GenQueue<HourlyEmployee> hList;
        hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee("T", "D"));
        hList.enqueue(new HourlyEmployee("G", "B"));
        hList.enqueue(new HourlyEmployee("F", "S"));

        empList.addItems(hList);

        while (empList.hasItems()) {
            Employee emp = empList.dequeue();
            System.out.println(emp.firstName + " " + emp.lastName);
        }
    }
}


class Employee {
    public String lastName;

    public String firstName;


    public Employee() {
    }

    public Employee(String last, String first) {
        this.lastName = last;

        this.firstName = first;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}




class HourlyEmployee extends Employee {
    public double hourlyRate;

    public HourlyEmployee(String last, String first) {
        super(last, first);
    }
}
