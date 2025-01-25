package dev.frost;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaExpChallenge {

    private static Random random = new Random();

    public static void main(String[]args){
        String[] names ={"Anna", "Jacob", "Ethan", "Emily", "Drimatiscue", "Ed", "Fred", "Grey"};

        // to get all the letter in uppercase
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println("Transform to uppercase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s -> s + " "+ getRandomChar('A', 'D') + ".");
        System.out.println("Add Random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s+" "+ getReversedName(s.split(" ")[0]));
        System.out.println("Add Reversed lastName");
        Arrays.asList(names).forEach(s -> System.out.println(s));

    }
    
    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar , (int) endChar + 1);
    }

    public static String getReversedName(String firstname){
        return new StringBuilder(firstname).reverse().toString();
    }
}
