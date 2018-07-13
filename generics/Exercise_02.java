package generics;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {


    public static void main(String[] args) {
        Integer[] intArray = new Integer[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 4;
        intArray = swap(intArray, 0,2);
        for (Integer i : intArray) {
            System.out.println(i);
        }
    }


    public static <T> T[] swap(T[] arrayList, int i, int j) {
        T temp = arrayList[i];
        arrayList[i] = arrayList[j];
        arrayList[j] = temp;
        return  arrayList;
    }
}

