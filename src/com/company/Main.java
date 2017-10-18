package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while(running){

            System.out.println("Enter sentence or exit to quit");
            String sentence = input.nextLine().toUpperCase();
            sentence += "EAT SOCKS";


            if(sentence.equalsIgnoreCase("EXIT")){
                running = false;
            }else{

                String sp[] = sentence.split("E");
                int occ = sp.length-1;
                System.out.println("There is/are " + occ + " occurrence(s)");
            }
        }
    }
}
