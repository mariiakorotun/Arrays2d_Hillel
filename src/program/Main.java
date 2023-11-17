package program;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public final static int rows = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] lotteryMatrix = new int [rows][rows];

        // числа від 10 до 99
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < lotteryMatrix[i].length; j++){
                lotteryMatrix[i][j] = (random.nextInt(90) + 10);
            }
        }

        System.out.println("\nYour lottery blank:\n");
        for(int[] lotteryMatrix2 : lotteryMatrix){
            System.out.print("[ ");
            for(int lotteryMatrix1 : lotteryMatrix2){
                System.out.print(lotteryMatrix1 + " ");
            }
            System.out.print("]\n");
        }
        int count = 1;
        System.out.println("\nYou have only 3 attempts to guess the number.");

        while(count <= 3) {
            System.out.print("\nGuess the winning number: ");
            int guessedNumber = scanner.nextInt();
            if (guessedNumber == lotteryMatrix[2][2]) {
                System.out.println("You are right! " + guessedNumber + " is the winning number.");
                break;
            } else {
                System.out.println("You are wrong. " + guessedNumber + " is not the winning number. Try again!");
            }
            count++;
        }

        scanner.close();
    }
}
