package dev.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinary_Interface {

    public static void main(String[]Args) throws IOException {

        int num, i;
        List<Integer> numbers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the Number of elements in the List \n");
        num = Integer.parseInt(br.readLine());

        for(i = 0; i<=num; i++){
            System.out.println("Please Enter the Number is the " + i + "Position");
            numbers.add(Integer.parseInt(br.readLine()));
        }

        System.out.println("The Numbers Entered in the List are");
        numbers.forEach(s -> System.out.println(s));

        // Increment each numbers in the List by One
        UnaryOperator<Integer> increment = n -> n+ 1;
        numbers.replaceAll(increment);

        System.out.println("All Numbers Increased By One :"+ numbers);

        //Binary Operator
        // Define a BinaryOperator to calculate the sum of two numbers
        BinaryOperator<Integer> sumOperator = (a, b) -> a + b;

        // Use the BinaryOperator with the reduce method to calculate the sum
        int sum = numbers.stream().reduce(0, sumOperator);

        // Print the sum
        System.out.println("Sum of elements: " + sum);

    }
}
