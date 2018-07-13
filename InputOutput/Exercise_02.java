package InputOutput;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.*;


public class Exercise_02 {
    public static void main(String[] args) {
        //Specify the path of the file here
        File file = new File("C:\\Users\\Administrator\\Desktop\\Coding\\IO_Example\\duncan.txt");

        try (FileInputStream fis = new FileInputStream(file); BufferedInputStream bis = new BufferedInputStream(fis)) {

            /*available() method of BufferedInputStream
             * returns 0 when there are no more bytes
             * present in the file to be read*/
            while( bis.available() > 0 ){
                System.out.print((char)bis.read());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

