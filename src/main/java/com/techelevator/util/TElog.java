package com.techelevator.util;
import javax.imageio.IIOException;
import java.io.*;


public class TElog {
    //TElog exception to find and append the file
    public static void  log(String message){
        try (FileWriter writing = new FileWriter("logs/search.log", true)){

            writing.write(message + "\n");


        }catch (IOException iE) {
            throw new TELogException("File not found.");
        }



    }
}
