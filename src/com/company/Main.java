package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is my First program on InteliJ");
        Main c = new Main();
        c.newMethod();
        statMethod();
    }
    public void newMethod(){

        System.out.println("NewMethod Sample");
        statMethod1();
    }

    public static void statMethod(){

        System.out.println("Calling from Main static method to static method");
    }

    public static void statMethod1(){

        System.out.println("Calling from  concrete method to static method");
    }


}
