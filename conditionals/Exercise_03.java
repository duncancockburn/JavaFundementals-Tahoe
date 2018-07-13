package conditionals;


/**
 * Implement the getMonthName() method
 */

class Exercise_03 {

    public static void main(String[] strings) {


        // use a for loop to iterate 1000 times
        for (int i = 0; i < 1000; i++) {

            // Generate a random int between >= 1 and <= 12
            int month = 1 + (int) (Math.random() * ((12 - 1) + 1));

            // call getMonthName(int month) and pass your random int
            String monthName = getMonthName(month);

            // print the name of the month and the random int generated to the console
            System.out.println(month + " " + monthName);

        }

    }

    // Get the name for the month using the random int you generated


    public static String getMonthName(int month) {

        String monthname;
        switch (month) {
            case (1):
                monthname= ("jan");
                break;
            case (2):
                monthname = ("feb");
                break;
            case (3):
                monthname = ("march");
                break;
            case (4):
                monthname = ("april");
                break;
            case (5):
                monthname = ("may");
                break;
            case (6):
                monthname = ("june");
                break;
            case (7):
                monthname = ("july");
                break;
            case (8):
                monthname = ("aug");
                break;
            case (9):
                monthname = ("sept");
                break;
            case (10):
                monthname = ("oct");
                break;
            case (11):
                monthname = ("nov");
                break;
            default:
                monthname = ("december");


        }
        return monthname;

    }
}

        // use a switch statement to determine the name of the month

        // for instance if the random int is 1 the name of month is January








