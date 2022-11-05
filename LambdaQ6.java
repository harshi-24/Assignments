package com.lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
    public class LambdaQ6 {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList <>( Arrays.asList("hello", "everyone", "welcome", "capgemini", "warm", "welcome"));
            System.out.println(list);
            LambdaQ6 Letter = new LambdaQ6();
            System.out.println(Letter.convertToUpperCase(list));
        }
        public List<String> convertToUpperCase(List<String> list) {
            List<String> ToUpper = new ArrayList<>();
            Consumer<String> consumer = (str)->ToUpper.add(str.toUpperCase());
            list.stream()
                    .forEach(consumer);
            return  ToUpper;
        }
}
