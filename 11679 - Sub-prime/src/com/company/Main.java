package com.company;

/*
18080526 	11679 	Sub-prime 	Accepted 	JAVA 	0.100 	2016-09-28 15:00:40
accepted in first try
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long reserve[],deb;
        int b,n,b1,b2;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder op = new StringBuilder();
            String str, temp[];
            while (true) {
                str = reader.readLine();
                temp=str.split(" ");
                b=Integer.parseInt(temp[0]);
                n=Integer.parseInt(temp[1]);
                if(n==0 && b==0)return;
                temp=reader.readLine().split(" ");
                reserve=new long[b+1];
                for(int i=1;i<=b;i++)
                    reserve[i]=Long.parseLong(temp[i-1]);
                while(n-- >0){
                    temp=reader.readLine().split(" ");
                    b1=Integer.parseInt(temp[0]);
                    b2=Integer.parseInt(temp[1]);
                    deb=Long.parseLong(temp[2]);
                    reserve[b1]-=deb;
                    reserve[b2]+=deb;
                }
                boolean bailout=false;
                for(int i=1;i<=b;i++)
                    if(reserve[i]<0)
                        bailout=true;
                System.out.println((bailout)?"N":"S");
            }
        }catch(Exception e){
            return;
        }
    }
}

/*
3 3
1 1 1
1 2 1
2 3 2
3 1 3
3 3
1 1 1
1 2 1
2 3 2
3 1 4
3 3
1 1 1
1 2 2
2 3 2
3 1 2
0 0
 */