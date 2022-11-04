package com.company;

public class RunnableExample {
    public static void main(String[] args){
        Thread myThread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("RunnableExample");
            }
        }
        );
        myThread.run();

        Thread myLambdaThread = new Thread(() ->System.out.println("Lambda RunnableExample") );
        myLambdaThread.run();
    }
}
