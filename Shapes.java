package com.company;

 abstract class shape {

    abstract void draw();
}
class rectangle extends shape
{
    int height,width;
    rectangle(int h, int w) {
        this.height = h;
        this.width = w;
    }
    public void draw(){

        System.out.println("the rectangle is drawn");
    }
}
class line extends shape{
    int length;
    line(int length) {
        this.length=length; }
    public void draw()
    {
        System.out.println("the line is drawn");
    }
}

class cube extends shape{
    int s;
    cube(int s) {
        this.s=s;
    }
    public void draw()
    {
        System.out.println("the cube is drawn");
    }
}

class shapes
{
    public static void main(String[] args) {
        rectangle q=new rectangle(  5, 3);
        q.draw();
        cube k=new cube(5);
        k.draw();
        line l=new line( 5);
        l.draw();
    }
}




