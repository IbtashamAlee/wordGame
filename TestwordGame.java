

import java.util.Scanner;

public class TestwordGame {

    public static void main(String[] args) {

        CountLettersInArray w1 = new CountLettersInArray();

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter Word :");

        String word=scan.next();

        char[] a=w1.wordGame(word);

        int newln=word.length()+5;

        int i;

        for (i = 0; i < a.length; i++) {

            System.out.printf("%c  ", a[i]);

            if ((i + 1) % newln == 0) System.out.println("");

        }

    }

}
