package com.company;

    import java.lang.annotation.Annotation;
            import java.lang.annotation.ElementType;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
    int authorId() default 242;
    String Authorname() default "Harshitha";
    String developersupervisor() default "Chitti";
    String date() default "14/09/22";
    String Time() default "4.00 PM";
    int version() default 6;
}


@info
class developers{
    int authorId;
    String Authorname;
    String developersupervisor;
    String date;
    String Time;
    int version;
}
public class AnnotationQ2 {

    public static void main(String[] args) {
        developers obj = new developers();
        Class n = obj.getClass();
        Annotation anno = n.getAnnotation(info.class);
        info k = (info) anno;
        System.out.println(k.authorId());
        System.out.println(k.Authorname());
        System.out.println(k.developersupervisor());
        System.out.println(k.date());
        System.out.println(k.Time());
        System.out.println(k.version());

    }
}