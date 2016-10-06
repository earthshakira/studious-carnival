package com.iridium;
/*
18130537 	11687 	Digits 	Accepted 	JAVA 	0.080 	2016-10-06 14:48:47
18130525 	11687 	Digits 	Wrong answer 	JAVA 	0.080 	2016-10-06 14:47:21
18130478 	11687 	Digits 	Accepted 	JAVA 	0.070 	2016-10-06 14:41:38
18130318 	11687 	Digits 	Wrong answer 	JAVA 	0.060 	2016-10-06 14:16:25
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder op = new StringBuilder();

        String inp,end= "END" ;

        while(!(inp = br.readLine()).equals(end)){
            long l=inp.length();
            int i=1;
            if(inp.equals("1"))op.append("1\n");
            else if(l < 2 ) op.append("2\n");
            else if(l < 10) op.append("3\n");
            else op.append("4\n");
        }

        System.out.print(op.toString());

    }
}
