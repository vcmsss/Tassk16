package com.company;

import java.io.*;


public class Main {

    public static void main(String args[]) throws IOException {


        String S;
        try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
            while ((S = br.readLine()) != null) {
                System.out.println(S);
            }

        } catch(IOException exc) {
            System.out.println("Ошибка:" + exc);
        }
    }
}
