package com.engeto.lesson3;

import java.util.function.Predicate;

public class FizzBuzzPredicates {

    public static void main(String[] args) {

        /*
            Počítejte od 1 do 100 a při každém kroku vypište číslo daného kroku.
            Ale v případě, že je číslo dělitelné třemi, tak napište místo čísla Fizz.
            Pokud je dělitelné pěti, tak místo čísla vypište Buzz.
            A pokud je dělitelní třemi a pěti zároveň, tak FizzBuzz.
        */

        Predicate<Integer> divisibleBy3 = i -> i % 3 == 0;
        Predicate<Integer> divisibleBy5 = i -> i % 5 == 0;
        Predicate<Integer> divisibleBy3and5 = divisibleBy3.and(divisibleBy5);

        String fizz = "Fizz";
        String buzz = "Buzz";

        for (int i = 1; i < 101; i++) {

            String out = String.valueOf(i);

            if (divisibleBy3and5.test(i))
                out = fizz+buzz;
            else if (divisibleBy5.test(i))
                out = buzz;
            else if (divisibleBy3.test(i))
                out = fizz;

            System.out.println(out);
        }

    }
}
