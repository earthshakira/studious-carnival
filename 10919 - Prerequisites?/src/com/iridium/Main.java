package com.iridium;
/*
18116657 	10919 	Prerequisites? 	Accepted 	JAVA 	0.250 	2016-10-04 12:05:52
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder op = new StringBuilder("");
        HashSet<String> courses = new HashSet<>();
        String line,temp[];
        while(( line = br.readLine() ) != null){
            temp=line.split("\\s+");
            int k=Integer.parseInt(temp[0]);
            if(k==0){
                System.out.print(op.toString());
                return;
            }
            courses = new HashSet<>();
            int m=Integer.parseInt(temp[1]);
            temp=br.readLine().split("\\s+");
            for(int i=0;i<temp.length;i++)
                courses.add(temp[i]);

            boolean req=true;
            while(m-- > 0) {
                temp=br.readLine().split("\\s+");
                int c = Integer.parseInt(temp[0]);
                int r= Integer.parseInt(temp[1]);

                int st = 0;
                for (int i = 2; i < temp.length; i++)
                    if (courses.contains(temp[i])) st++;
                if(st<r)
                    req=false;
            }
            op.append((req)?"yes\n":"no\n");
        }
        System.out.println(op.toString());
    }
}

/*
3  2
0123  9876  2222
2  1  8888  2222
3  2  9876  2222  7654
3  2
0123  9876  2222
2  2  8888  2222
3  2  7654  9876  2222
0
 */