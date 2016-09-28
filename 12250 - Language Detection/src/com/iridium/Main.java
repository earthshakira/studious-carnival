package com.iridium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String word="",exit="#";
        while(scanner.hasNextLine()){
            word=scanner.next();
            if(word.equals(exit))
                break;
            switch(word){
                case "HELLO":
                    System.out.println("ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("SPANISH");
                    break;
                case "HALLO":
                    System.out.println("GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("FRENCH");
                    break;
                case "CIAO":
                    System.out.println("ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("RUSSIAN");
                    break;
                default: System.out.println("UNKNOWN");
            }
        }
    }
}
