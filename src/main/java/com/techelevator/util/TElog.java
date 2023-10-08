package com.techelevator.util;
import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;


public class TElog {

    public static void  log(String message){
        try (BufferedWriter br = new BufferedWriter(new FileWriter("logs/search.log"))){

            br.write(message + "\n");


        }catch (IOException iE) {
            throw new TELogException("File not found.");
        }


    }
}
