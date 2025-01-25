package dev.frost;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Challenge_One {

    public static void main(String[]Args){

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String [] parts = sentence.split(" ");
                for(String part : parts){
                    System.out.println(part);
                }
            }
        };

        // change the above one to lambda
        Consumer<String> printWordsLambda = sentence -> {
            String [] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWords.accept("Lion");
        printWordsLambda.accept("Lion");

        UnaryOperator<String> everySecondChar = source ->{
            StringBuilder returnval = new StringBuilder();
            for(int i = 0 ; i< source.length(); i++){
                if(i % 2 == 1){
                    returnval.append(source.charAt(i));
                }
            }
            return returnval.toString();
        };
        System.out.println(everySecondChar.apply("12345678"));
    }

    public  static String everySecondCharacter(String source){

        StringBuilder returnval = new StringBuilder();
        for(int i = 0 ; i< source.length(); i++){
            if(i % 2 == 1){
                returnval.append(source.charAt(i));
            }
        }
        return returnval.toString();
    }


}
