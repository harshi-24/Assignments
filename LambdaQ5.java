
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.function.Consumer;
import java.util.List;
        import java.util.stream.Stream;
public class LambdaQ5 {
   ArrayList<String> names = new ArrayList<>( Arrays.asList("Matta", "Harshitha", "Jagan", "Sumathi", "Kranthi", "Reddy"));
        public static void main(String[] args) {
        LambdaQ5 firstletter = new LambdaQ5();
        processWords(firstletter.names);
    }

    public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));
        list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }
}




