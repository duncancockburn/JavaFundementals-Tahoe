package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };



        // uncomment the lines below when your methods are ready
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }


    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array



    public static int getMaxVal(int[][] ashley) {

        int maxVal = ashley[0][0];

        for (int a = 0; a < ashley.length; a++) {
            for (int b = 0; b < ashley[a].length; b++) {
                if (ashley[a][b] > maxVal) {
                    maxVal = ashley[a][b];
                }
            }
        }
        return maxVal;
    }

    public static int getMinVal (int[][] duncan) {

        int minVal = duncan[0][0];
        for (int[] arr : duncan) {
            for (int i : arr) {
                if (i < minVal) {
                    minVal = i;
                }
            }
        }
        return minVal;
    }
}

