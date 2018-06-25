package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.text.SimpleDateFormat;

public class Exercise_04 {
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\Administrator\\Desktop\\Coding\\IO_Example\\duncan.txt");

        System.out.println("Before Format : " + file.lastModified());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        System.out.println("After Format : " + sdf.format(file.lastModified()));
    }
}







