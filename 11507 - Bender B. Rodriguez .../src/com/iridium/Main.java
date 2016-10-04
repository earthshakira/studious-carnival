package com.iridium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static String complement(String dir){
        if(dir.charAt(0)=='+')
            return "-"+dir.charAt(1);
        else return "+"+dir.charAt(1);
    }
    public static void main(String[] args) throws Exception{
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
        Scanner scanner = new Scanner(System.in);
        StringBuilder op = new StringBuilder();

        long L;
        String dir;
        while((L = scanner.nextLong()) != 0 ){
            String head="+x";
            for(int i =1;i<L;i++){
                dir=scanner.next();
                if(dir.equals("No"))
                    continue;
                if(head.equals("+x"))
                    head=dir;
                else if(head.equals("-x"))
                    head=complement(dir);
                else if(head.equals(dir))
                    head="-x";
                else if(head.equals(complement(dir)))
                    head="+x";
                else continue;
            }
            System.out.println(head);
        }

    }
}

/*
3
+z -z
3
+z +y
2
+z
4
+z +y +z
5
No +z No No
0
 */