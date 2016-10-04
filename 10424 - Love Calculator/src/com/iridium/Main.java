package com.iridium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
18116557 	10424 	Love Calculator 	Accepted 	JAVA 	0.030 	2016-10-04 11:32:50
18116551 	10424 	Love Calculator 	Runtime error 	JAVA 	0.000 	2016-10-04 11:31:54
18116433 	10424 	Love Calculator 	Wrong answer 	JAVA 	0.040 	2016-10-04 11:03:17
18116428 	10424 	Love Calculator 	Wrong answer 	JAVA 	0.030 	2016-10-04 11:02:00
18116425 	10424 	Love Calculator 	Wrong answer 	JAVA 	0.040 	2016-10-04 11:01:04
18116424 	10424 	Love Calculator 	Wrong answer 	JAVA 	0.030 	2016-10-04 11:00:22
18116401 	10424 	Love Calculator 	Wrong answer 	JAVA 	0.030 	2016-10-04 10:53:31
 */

public class Main {

    static int getScore(String name){
        int score=0,temp;
        name=name.toUpperCase();
        for(int i=0;i<name.length();i++){
            if(Character.isAlphabetic(name.charAt(i))){
                score+=(name.charAt(i)-64);
            }
        }
        while(score>=10){
            temp=0;
            while(score>0){
                temp+=score%10;
                score/=10;
            }
            score=temp;
        }
        return score;
    }
    public static void main(String[] args) throws Exception {
	// write your code here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder op = new StringBuilder("");
        String name1,name2;
        while((name1 = br.readLine() ) != null ){
            name2 = br.readLine();
            int n1=getScore(name1);
            int n2=getScore(name2);
            if(n1>n2){
                n1 ^= n2;
                n2 ^= n1;
                n1 ^= n2;
            }
            String ans=String.format("%.2f",((float)n1*100)/n2);
            if(ans.equals("NaN")) {
                System.out.println();
                continue;
            }
            System.out.println(ans+" %");
        }
    }
}
