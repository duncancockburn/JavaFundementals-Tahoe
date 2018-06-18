package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {



        int[] arrayName = new int[]{1,4,3,7,3};

        for (int element : arrayName) {
            System.out.println("Element is: " + element);
        }
    }
}