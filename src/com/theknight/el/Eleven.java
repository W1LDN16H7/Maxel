package com.theknight.el;

import com.theknight.vecna.Engine;

import java.util.Scanner;

public class Eleven {
    static String commands [] = {
            "warranty",



    };
    public static void main(String[] args) throws Exception {
        Engine en = new Engine();
        Scanner sc = new Scanner(System.in);
        String msg = "Eleven 0.0.1 Copyright  (c) 2022 TheKnight and All contributors\nThis is free software with ABSOLUTELY NO WARRANTY. For details type `warranty'.";
        System.out.println(msg + " \n" + "Hello from Eleven,Type anything to see my superpowers \n\n");
        String input;

        do {
            input = sc.nextLine();
            for(String command : commands){
                if(input.equals(command)){
                    en.runQuery(command);
                }
                else System.out.println(en.evaluate(input));
            }



        }
        while (!input.equals(commands));





    }
}
