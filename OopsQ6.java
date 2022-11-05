package com.company;

abstract class Persistance {
    abstract void persist();

}
class Filepersistence extends Persistance{
    void persist()
    {
        System.out.println("data is stored in files");
    }
}
class DatabasePersistence extends Persistance{
    void persist()
    {
        System.out.println("Data is stored in Database");
    }
}
class OopsQ6
{
    public static void main(String args[])
    {
        Filepersistence f=new Filepersistence();
        DatabasePersistence d=new DatabasePersistence();
        f.persist();
        d.persist();
    }
}




