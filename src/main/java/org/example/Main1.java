package org.example;

public class Main1 {
    public static void main(String[] args) {

        checkNumber(10);
        checkNumber(-10);
        checkNumber(0);
    }
    static void checkNumber(int x) {
        if (x > 0) {
            System.out.println("დადებითი");
        }
        else if (x < 0) {
            System.out.println("უარყოფითი");
        }
        else {
            System.out.println("ნული");
        }
    }
}


