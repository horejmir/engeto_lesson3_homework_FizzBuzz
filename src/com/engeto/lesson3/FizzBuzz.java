package com.engeto.lesson3;

public class FizzBuzz {

    public static void main(String[] args) {

        /*
            Počítejte od 1 do 100 a při každém kroku vypište číslo daného kroku.
            Ale v případě, že je číslo dělitelné třemi, tak napište místo čísla Fizz.
            Pokud je dělitelné pěti, tak místo čísla vypište Buzz.
            A pokud je dělitelní třemi a pěti zároveň, tak FizzBuzz.
        */

        for (int i = 1; i < 101; i++) {

            String out = String.valueOf(i);

            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if(i % 5 == 0)
                System.out.println("Buzz");
            else if(i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }

    }
}
