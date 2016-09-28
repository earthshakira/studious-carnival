/*
18077760	11559	Event Planning	Accepted	JAVA	0.050	2016-09-28 06:30:10
18077696	11559	Event Planning	Runtime error	JAVA	0.000	2016-09-28 06:14:27
18077691	11559	Event Planning	Runtime error	JAVA	0.000	2016-09-28 06:13:02
18077679	11559	Event Planning	Accepted	JAVA	0.060	2016-09-28 06:10:23
18077664	11559	Event Planning	Runtime error	JAVA	0.000	2016-09-28 06:05:43
18077656	11559	Event Planning	Compilation error	JAVA	0.000	2016-09-28 06:04:35
18077650	11559	Event Planning	Compilation error	JAVA	0.000	2016-09-28 06:03:21
18077628	11559	Event Planning	Runtime error	JAVA	0.000	2016-09-28 05:59:02
18077619	11559	Event Planning	Runtime error	JAVA	0.000	2016-09-28 05:57:49
 */
package com.iridium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n,b,h,w,minBudget,cost,p,avail[];
        String inp,temp[];
        while(true){
            try {
                inp = reader.readLine();
                if(inp == null || inp.isEmpty())break;
                temp=inp.split(" ");
                n=Integer.parseInt(temp[0]);
                b=Integer.parseInt(temp[1]);
                h=Integer.parseInt(temp[2]);
                w=Integer.parseInt(temp[3]);
                minBudget=Integer.MAX_VALUE;
                while(h-->0){
                    p=Integer.parseInt(reader.readLine());
                    inp=reader.readLine();
                    temp=inp.split(" ");
                    for(int i=0;i<temp.length;i++){
                        if(n<=Integer.parseInt(temp[i])){
                            minBudget=Integer.min(minBudget,(p*n));
                        }
                    }
                }
                if(minBudget<=b) System.out.println(minBudget);
                else System.out.println("stay home");
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}

/*
3 1000 2 3
200
0 2 2
300
27 3 20
5 2000 2 4
300
4 3 0 4
450
7 8 0 13
 */