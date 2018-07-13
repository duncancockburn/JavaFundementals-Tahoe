package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {
    public static void main(String[] args) {
        //set filename variable to be equal to the path
        String FILENAME = "C:\\Users\\Administrator\\Desktop\\Coding\\IO_Example\\duncan.txt";
        args = new String[1];
        args[0] = FILENAME;

        try (FileReader fr = new FileReader(args[0]); BufferedReader br = new BufferedReader(fr)){

            int sCurrentLine = br.read();

            while (sCurrentLine != -1) {
                System.out.println(sCurrentLine);
                sCurrentLine = br.read();
            }

        } catch (IOException e) {

            e.printStackTrace();

            }

        }

    }

