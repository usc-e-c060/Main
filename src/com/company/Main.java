package com.company;
import java.util.Random;
import java.util.Scanner;

/**
 * This is a simple math game for grades 3-5.
 *
 * @author Eujin Choi
 */

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i = 0 ; i < 10; i++) {
            int x = rand.nextInt(12);
            int y = rand.nextInt(12);

            System.out.println("What is "+ y + " + "+ x +"?"  );

            int correct= x+y;
            int response = input.nextInt();
            if (response == correct) {
                System.out.println("Correct");
                count++;
            }else {
                System.out.println("Wrong");
            }


        } if (count >= 8){
            System.out.println("Congratuation!, correct "+ count + " times");
        }else{
            System.out.println("You got " + count + " corrects");
        }
    }
}
