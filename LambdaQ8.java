import java.util.*;
import java.lang.*;

public class LambdaQ8 {
    public static void main(String[] args){
        Thread t1 = new Thread(() ->{
         List<Integer>list = new ArrayList<Integer>();
         list.add(10);
         list.add(15);
         list.add(20);
         list.add(25);
         list.add(30);
            System.out.println(list.size());
            System.out.println(list);
        });
        t1.start();
    }
}
