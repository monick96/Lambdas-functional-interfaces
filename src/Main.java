import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //to declare string list
        List<String> strings = Arrays.asList("tomatoes", "potatoes", "lettuce", "pepper");

        //call to method
        List<String> upperStringList = stringsLowCaseToUppercase(strings);

        //print result
        System.out.println("List string Upper case: " + upperStringList);
    }
    public static List<String> stringsLowCaseToUppercase (List<String> stringList){
        //make the function
        //referencia a un método lambda espresion
        Function<String, String> upperCaseString = (s) -> s.toUpperCase();

        //or Method Reference (Referencia a un Método)
        //Function<String, String> upperCaseString = String::toUpperCase;

        return stringList
                .stream()
                .map(upperCaseString)
                .collect(Collectors.toList());
    }
}