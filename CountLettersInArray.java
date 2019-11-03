

import java.util.Scanner;

class CountLettersInArray {

    Random_Character R2 = new Random_Character();

    private char[] arr;

    private int[] count = new int[26];

    private char[] test_arr = new char[27];

    private char[] wordGame;

    public void createArray() {

        arr = new char[100];

        for (int i = 0; i < 100; i++) {

            arr[i] = R2.getLowerCaseLetter();

        }

    }

    public char[] createArray(int limit) {

        arr = new char[limit];

        for (int i = 0; i < limit; i++) {

            arr[i] = (char) (Math.random() * ('z' - 'a' - 1) + 'a');

        }

        return arr;

    }

    public void displayCharacterArray() {

        for (int i = 0; i < 100; i++) {

            System.out.println(i + " Index :" + arr[i]);

        }

    }

    public void displayCountArray() {

        int c = 1;

        test_arr[0] = 'a';

        for (int i = 0; i < 26; i++) {

            for (int j = 0; j < 100; j++) {

                if (test_arr[i] == arr[j]) {

                    count[i]++;

                }

            }

            System.out.println(test_arr[i] + " = " + count[i]);

            test_arr[i + 1] = (char) (test_arr[0] + c);

            c++;

        }

    }

    //wordGame function

    public char[] wordGame(String word) {

        Scanner scan = new Scanner(System.in);

        int r_index = (int) (Math.random() * (5));

        int lOfString = word.length();

        int lenghtofLine = lOfString + 5;

        int size = lenghtofLine * lOfString;

        wordGame = new char[size];

        //Starting index == random index

        int start_index = r_index;

        System.out.println("Enter Choice\n1-Horizontal\n2-Vertical\n3-Diagonal");

        //choice variable for switch case

        int choice = scan.nextInt();

        switch (choice) {

            case 1:

                System.out.println("Horizontally Displaying words ");

                for (int i = 0; i < size; i++) {

                    int ccc = i;

                    //condition for placing words characters

                    if (i >= r_index && i < (start_index + lOfString)) {

                        while (!word.isEmpty()) {

                            for (int j = i; j < i + 1; j++) {

                                wordGame[ccc] = word.charAt(0);

                                word = word.substring(1);

                            }

                            ccc++;

                        }

                        i = ccc - 1;

                    } else {

                        wordGame[i] = (char) (Math.random() * ('z' - 'a' - 1) + 'a');

                    }

                }

                return wordGame;

            // for vertical

            case 2:

                System.out.println("Vertically displaying words ");

                int counter = 0;

                for (int i = 0; i < size; i++) {

                    int ver = r_index + (lenghtofLine * counter);

                    //condition for placing words character

                    if (i == ver) {

                        wordGame[i] = word.charAt(0);

                        word = word.substring(1);

                        counter++;

                    } else {

                        wordGame[i] = (char) (Math.random() * ('z' - 'a' - 1) + 'a');

                    }

                }

                return wordGame;

            //for diagonal

            default:

                System.out.println("Entered Words in Diangonal ");

                counter = 0;

                for (int i = 0; i < size; i++) {

                    int ver = r_index + (lenghtofLine * counter) + counter;

                    //Condition for placing enterd word's characters

                    if (i == ver) {

                        wordGame[i] = word.charAt(0);

                        word = word.substring(1);

                        counter++;

                    } else {

                        wordGame[i] = (char) (Math.random() * ('z' - 'a' - 1) + 'a');

                    }

                }

                return wordGame;

        }

    }

}
