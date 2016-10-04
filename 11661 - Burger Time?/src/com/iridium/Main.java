package com.iridium;
/*
18117773 	11661 	Burger Time? 	Accepted 	JAVA 	0.230 	2016-10-04 15:53:21
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder op = new StringBuilder();
        int n;
        while((n=Integer.parseInt(br.readLine())) >0){
            String path=br.readLine();
            char x=path.charAt(0);
                int distance=0;
                int minDistance=Integer.MAX_VALUE;
                int i=1;
                if(x=='.')
                    while(path.charAt(i++)=='.');
                x=path.charAt(i-1);
            if(x=='Z'){
                op.append("0\n");
                continue;
            }
                for(;i<n;i++){
                    distance++;
                    if(path.charAt(i)=='Z'){
                        minDistance=0;
                        break;
                    }
                    if(x=='R'){
                        if(path.charAt(i)=='D') {
                            minDistance = Integer.min(minDistance, distance);
                            distance = 0;
                            x = 'D';
                        }else if(path.charAt(i)=='R'){
                            distance = 0;
                        }
                    }else if(x=='D'){
                        if(path.charAt(i)=='R') {
                            minDistance = Integer.min(minDistance, distance);
                            distance = 0;
                            x = 'R';
                        }else if(path.charAt(i)=='D'){
                            distance = 0;
                        }
                    }
            }
            op.append(minDistance).append("\n");
        }
        System.out.print(op.toString());
    }
}

/*
2
RD
5
..Z..
10
.R......D.
10
.R..Z...D.
10
...D..R...
25
..D...R.RR...DD...D.R...R
0
 */