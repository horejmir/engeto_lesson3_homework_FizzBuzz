package com.engeto.lesson3;

import java.util.function.Predicate;

public class Main {

    /*
        Počítejte od 1 do 100 a při každém kroku vypište číslo daného kroku.
        Ale v případě, že je číslo dělitelné třemi, tak napište místo čísla Fizz.
        Pokud je dělitelné pěti, tak místo čísla vypište Buzz.
        A pokud je dělitelní třemi a pěti zároveň, tak FizzBuzz.
    */

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static void main(String[] args) {

        //fizzBuzz(100);
        fizzBuzzPredicates(100);

    }

    public static void fizzBuzz(int itterations) {

        for (int i = 1; i <= itterations; i++) {

            String out = String.valueOf(i);

            if(i % 3 == 0 && i % 5 == 0)
                System.out.println(FIZZ+BUZZ);
            else if(i % 5 == 0)
                System.out.println(BUZZ);
            else if(i % 3 == 0)
                System.out.println(FIZZ);
            else
                System.out.println(i);
        }

    }

    public static void fizzBuzzPredicates(int itterations) {

        Predicate<Integer> divisibleBy3 = i -> i % 3 == 0;
        Predicate<Integer> divisibleBy5 = i -> i % 5 == 0;
        Predicate<Integer> divisibleBy3and5 = divisibleBy3.and(divisibleBy5);

        for (int i = 1; i <= itterations; i++) {

            String out = String.valueOf(i);

            if (divisibleBy3and5.test(i))
                out = FIZZ + BUZZ;
            else if (divisibleBy5.test(i))
                out = BUZZ;
            else if (divisibleBy3.test(i))
                out = FIZZ;

            System.out.println(out);
        }
    }


}
