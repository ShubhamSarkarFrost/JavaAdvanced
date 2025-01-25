import java.util.ArrayList;
import java.util.List;

public class Lambda_Express {

    public static void main(String[]Args) {

            List<String> new_list = new ArrayList<>(List.of("alpha", "bravo", "charlie", "delta"));

            System.out.println("List Print using For Each Loop");
            for(String list : new_list){
                System.out.println(list);
            }

            System.out.println("<-------------------List Print using Lambda-------------------------->");
            new_list.forEach(System.out::println);

            System.out.println("<------------------- First Element in the List ----------------------->");
            new_list.forEach((var myString) -> {
                char first = myString.charAt(0);
                System.out.println(myString + " means " + first);
            } );




    }
}
