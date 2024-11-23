package org.example;

public class Main2 {
    public static void main(String[] args) {

        hasTeen(20, 5, 1);
        hasTeen(15,25,35);
    }
      static void hasTeen(int a, int b, int c) {
         int[] numbers = {a, b, c};
         for (int i = 0; i < numbers.length; i++) {
             if (numbers[i] >= 13 && numbers[i] <= 19) {
                System.out.println("True");
                break;
            }
             else if (i == numbers.length -1){
                System.out.println("False");
            }
        }
    }
}


