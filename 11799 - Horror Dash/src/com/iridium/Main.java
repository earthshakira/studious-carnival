package com.iridium;

/*
18081079 	11799 	Horror Dash 	Accepted 	JAVA 	0.050 	2016-09-28 16:14:47
18081071 	11799 	Horror Dash 	Wrong answer 	JAVA 	0.040 	2016-09-28 16:13:22
for got to put case <i> in the output lol!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i=0,max;
        String temp[];
        try {
            int n=Integer.parseInt(reader.readLine().trim());
            while(i++<n){
                max=Integer.MIN_VALUE;
                temp=reader.readLine().split(" ");
                for(int j=0;j<temp.length;j++)
                    if(temp[j].length()>0)
                        max=Integer.max(max,Integer.parseInt(temp[j].trim()));
                System.out.println("Case "+i+": "+max);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/*
    2
5  9  3  5  2  6
1  2
 */
