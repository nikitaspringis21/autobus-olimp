package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int autoHeight = 437;
        FileWriter fw = new FileWriter("a.out.txt");
        FileReader fr = new FileReader("a.in.txt");
        Scanner sc = new Scanner(fr);
        int n = sc.nextInt();
        int i = 1;
        boolean isCrash = false;
        while(i <= n){
            int height = sc.nextInt();
            if(height <= autoHeight) {
                fw.write("Crash " + i + " ");
                isCrash = true;
            }
            i++;
        }
        if(!isCrash) fw.write("No crash");
        fw.close();
    }
}
