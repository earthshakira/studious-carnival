package com.iridium;
/*
18117173 	11586 	Train Tracks 	Accepted 	JAVA 	0.030 	2016-10-04 14:08:10
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        StringBuilder op = new StringBuilder();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n=Integer.parseInt(br.readLine());
        while (n-- >0){
            int mf=0;
            int bal=0;
            String[] tmp = br.readLine().split("\\s+");
            for (String x:tmp
                 ) {
                switch(x){
                    case "MF":
                    case "FM":mf++;
                        break;
                    case "MM":bal--;
                        break;
                    case "FF":bal++;
                }
            }
            if(bal==0 && tmp.length > 1){
                op.append("LOOP\n");
            }else op.append("NO LOOP\n");
        }
        System.out.print(op.toString());
    }
}
