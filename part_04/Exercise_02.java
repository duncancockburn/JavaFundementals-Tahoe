package part_04;

/**

 Use a for loop to count to 2017.
 While looping, populate an array with the value of your iterator (ie, i).
 Once populated, print out the odd values (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class forlooparray {

    public static void main(String[] args) {

        int[] listofnumbers = new int[2018];

        for (int i = 0; i < 2018; i++) {
            listofnumbers[i] = i;}

for (int a = listofnumbers[0]; a<listofnumbers.length-1; a++ )
    if( a % 2 != 0) {
            System.out.println(listofnumbers[a]);

        } else {
            System.out.print("");

            }
        }
    }
