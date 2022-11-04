package com.company;
        import java.util.Collection;
        import java.util.Comparator;
        import java.util.TreeSet;
        import java.util.Scanner;
        import java.lang.String;
        import java.util.*;
class EmployeeDtls
{
    int id;
    String name;
    String department;
    int salary;
    EmployeeDtls(int id, String name, String department, int salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "Treeset{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class Sortbyid implements Comparator<EmployeeDtls>
{
    public int compare(EmployeeDtls a, EmployeeDtls b)
    {
        return a.id - b.id;
    }
}
class Sortbysalary implements Comparator<EmployeeDtls>
{
    public int compare(EmployeeDtls a, EmployeeDtls b)
    {
        return a.salary - b.salary;
    }
}
class Sortbyname implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        return i2.compareTo(i1);
    }

}
class Sortbydepartment implements Comparator
{
    public int compare(Object str1, Object str2)
    {
        String i1=str1.toString();
        String i2= str2.toString();
        int l1=i1.length();
        int l2=i2.length();
        if(l1>l2)
            return -1;
        else if(l1<l2)
            return 1;
        else
            return i1.compareTo(i2);
    }

}
public class Treesetexm
{
    public static void main(String[] args)
    {
        String name;
        int id;
        String department;
        int salary;
        Scanner s = new Scanner(System.in);

        EmployeeDtls t1 = new EmployeeDtls(1, "mani", "B", 10000);
        EmployeeDtls t2 = new EmployeeDtls(2, "bachi", "c", 20000);
        EmployeeDtls t3 = new EmployeeDtls(3, "kali", "a", 30000);
        EmployeeDtls t4 = new EmployeeDtls(4, "durga", "j", 40000);
        EmployeeDtls t5 = new EmployeeDtls(11, "abhi", "k", 50000);
        EmployeeDtls t6 = new EmployeeDtls(6, "faima", "l", 60000);
        EmployeeDtls t7 = new EmployeeDtls(7, "gosh", "m", 70000);
       EmployeeDtls t8 = new EmployeeDtls(8, "hari", "n", 80000);
        EmployeeDtls t9 = new EmployeeDtls(9, "immu", "o", 1000);
        EmployeeDtls t10 = new EmployeeDtls(10, "jhon", "p", 100000);
        System.out.println("choose 1 for name/n choose 2 for department /n choose 3 for salary/n choose 4 for id");

        int choose = s.nextInt();
        switch (choose)
        {
            case 1:
                TreeSet<EmployeeDtls> s1 = new TreeSet<>(new Sortbyid());
                s1.add(t1);
                s1.add(t2);
                s1.add(t3);
                s1.add(t4);
                s1.add(t5);
                s1.add(t6);
                s1.add(t7);
                s1.add(t8);
                s1.add(t9);
                s1.add(t10);
                System.out.println(s1);
                break;
            case 2:
                TreeSet<EmployeeDtls> s2 = new TreeSet<>(new Sortbysalary());
                s2.add(t1);
                s2.add(t2);
                s2.add(t3);
                s2.add(t4);
                s2.add(t5);
                s2.add(t6);
                s2.add(t7);
                s2.add(t8);
                s2.add(t9);
                s2.add(t10);
                System.out.println(s2);
                break;
            case 3:
                TreeSet<EmployeeDtls> s3=new TreeSet<EmployeeDtls>( new Sortbyname());
                s3.add(t1);
                s3.add(t2);
                s3.add(t3);
                s3.add(t4);
                s3.add(t5);
                s3.add(t6);
                s3.add(t7);
                s3.add(t8);
                s3.add(t9);
                s3.add(t10);
                System.out.println(s3);
                break;
            case 4:
                TreeSet<EmployeeDtls> s4=new TreeSet<EmployeeDtls>( new Sortbydepartment());
                s4.add(t1);
                s4.add(t2);
                s4.add(t3);
                s4.add(t4);
                s4.add(t5);
                s4.add(t6);
                s4.add(t7);
                s4.add(t8);
                s4.add(t9);
                s4.add(t10);
                System.out.println(s4);

        }

    }
}