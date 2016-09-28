package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        String chant="";
        int i=1;
        while(!chant.equals("*")){
            chant=scanner.next();
            if(chant.equals("Hajj"))
                System.out.println("Case "+(i++)+": Hajj-e-Akbar");
            else if(chant.equals("Umrah"))
                System.out.println("Case "+(i++)+": Hajj-e-Asghar");
        }
    }
}
