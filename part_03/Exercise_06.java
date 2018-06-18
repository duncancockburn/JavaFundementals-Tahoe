package part_03;


import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds/1000;

        // Get the current second within the minute within the hour
        long secondsPerMinute = 60;
        long currentSecond = (totalSeconds % secondsPerMinute);

        // Get total minutes
        long totalMinutes = totalSeconds/secondsPerMinute;

        // Get the current minute in the hour
        long minutesPerHour = 60;
        long currentMinute = totalMinutes % minutesPerHour;

        // Get the total hours
        long secondsInHours = 3600;
        long totalHours = totalSeconds /secondsInHours;

        // Get the current hour
        long hoursPerDay = 24;
        long currentHour = totalHours % hoursPerDay;

        // the flag bellow is created to say if Am or Pm
        boolean flag = true;
        currentHour+= timeZoneChange;

        if (currentHour > 12){
            currentHour-=12;
            flag = false;
        }

        // Display results using a 12 hour clock, include AM or PM
        String amOrPm = "";
        if (flag){
            amOrPm = "AM";
        }
        else {
            amOrPm = "PM";
        }
        System.out.println("it's  " + currentHour +":"+currentMinute+ ":"+currentSecond+ " "+ amOrPm);
    }

}
