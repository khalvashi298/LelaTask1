package org.example;

public class While {
    public static void main(String[] args) {

        String text= "dress from zara";/*"მომწონს ავტომატიზაციის კურსი";*/

        int i=2;
        while (i<text.length()){
            if (text.charAt(i )=='z'){
                break;
            }

            System.out.print(text.charAt(i));
            i=i+3;
        }

    }
}

