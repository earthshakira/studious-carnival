package com.iridium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        StringBuilder op = new StringBuilder();

        byte display[] = new byte[100];
        String line;
        int t=Integer.parseInt(br.readLine()),cs=1;
        while(cs<=t){
            Arrays.fill(display,(byte)-128);
            int ptr=0;
            line = br.readLine();
            for(int i=0;i<line.length();i++){
                switch (line.charAt(i)){
                    case '>' : ptr=(ptr + 1)% 100;
                        break;
                    case '<' : ptr=(ptr + 99 )% 100;
                        break;
                    case '+' : display[ptr]+=1;
                        break;
                    case '-' : display[ptr]-=1;
                }
            }

            op.append("Case ").append(cs).append(":");
            for(int i=0;i<100;i++)op.append(" ").append((String.format("%2H",display[i]+128)).replace(" ","0"));
            op.append("\n");
            cs++;
        }
        System.out.print(op.toString());

    }
}
/*
1
..++<><<+++>>++++++++++++++++++++++++++>>>+++<+...++<><<+++>>++++++++++++++++++++++++++>>>+++<+...++<><<+++>>++++++++++++++++++++++++++>>>+++<+.
 */