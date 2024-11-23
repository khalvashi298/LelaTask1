package org.example;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {8,10,13,15,16,20};

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                count++;
            }

        }
         if (count == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");

        } else {


            System.out.println("ამ მასივში არის " + count + "  ლუწი რიცხვი");
        }





    }

}