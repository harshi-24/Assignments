 import java.util.Date;
        import java.util.function.Consumer;
        import java.util.function.Function;
        import java.util.function.Predicate;
        import java.util.function.Supplier;

interface Inter
{
    public void test(int n);
}

public class Interfaces
{
    public static void main(String args[])
    {
        Predicate<Integer> P = n -> n*2==30;
        System.out.println(P.test(15));

        Function<Integer,Integer> F = n -> n+n;
        System.out.println(F.apply(5));

        Supplier<Date> S = () -> new Date();
        System.out.println(S.get());

        Consumer<String> C = (string) -> System.out.println("hello");
        C.accept("hello");
    }
}
