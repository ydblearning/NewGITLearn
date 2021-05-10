package com.company;

public class TestGit {
    static int a = 0;

    public static void main(String[] args) {
        System.out.println("Hello Git");
        // a=10;
        if (a < 10) {
            System.out.println("Print Zero");
        } else {
            System.out.println(a);
            // a--;

            sample();
        }
    }

    public static void sample() {
        System.out.println("This is newly generated tline in TestGit of Git Learning");
    }

}

