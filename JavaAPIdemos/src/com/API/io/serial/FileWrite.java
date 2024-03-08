package com.API.io.serial;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        InputStreamReader iReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(iReader);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream=new FileOutputStream("demo.txt");
            char c = (char) bufferedReader.read();
            while (c != 'q'){
                System.out.print(c);
                fileOutputStream.write(c);
            c = (char) bufferedReader.read();
        }
        }catch (FileNotFoundException e){
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }
    }

