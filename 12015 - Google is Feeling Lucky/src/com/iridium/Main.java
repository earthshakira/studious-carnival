package com.iridium;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        ArrayList<String> search;

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(),i=0,m,v;
        String website;
        while (i<t){
            m=Integer.MIN_VALUE;
            search=new ArrayList<>();
            i++;
            for(int j=0;j<10;j++){
                website=scanner.next();
                v=scanner.nextInt();
                if(v>m){
                    m=v;
                    search=new ArrayList<>();
                    search.add(website);
                }else if(v==m){
                    search.add(website);
                }
            }
            System.out.println("Case #"+i+":");
            for(int j=0;j<search.size();j++)
                System.out.println(search.get(j));
        }

    }
}


/*
     2

www.youtube.com 1
www.google.com 2
www.google.com.hk 3
www.alibaba.com 10
www.taobao.com 5
www.bad.com 10
www.good.com 7
www.fudan.edu.cn 8
www.university.edu.cn 9
acm.university.edu.cn 10

www.youtube.com 1
www.google.com 2
www.google.com.hk 3
www.alibaba.com 11
www.taobao.com 5
www.bad.com 10
www.good.com 7
www.fudan.edu.cn 8
acm.university.edu.cn 9
acm.university.edu.cn 10
 */