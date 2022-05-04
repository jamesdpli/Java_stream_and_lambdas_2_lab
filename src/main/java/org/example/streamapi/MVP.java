package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)
//      Same as below with different syntax
//      names
//              .stream()
//              .forEach((name) -> {
//                 System.out.println(name);
//              });
        names
                .stream()
                .forEach(System.out::println);
    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        // Implement me :)
//      Predicate<Integer> evenOnly = (num) -> {
//          return num % 2 == 0;
//      };
        return numbers
                .stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        // Implement me :)
        return Arrays.stream(numbers)
                .map(num -> 2 * num)
                .toArray();
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        // Implement me :)
        return Arrays.stream(input
                .split(""))
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        // Implement me :)
        return null;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        // Implement me :)
        return null;
    }
}