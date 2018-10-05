package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<String> guess = new ArrayList<>();
        System.out.println("Welcome! Let's play hangman!");

        guess.add("Tree");
        guess.add("Rain");
        guess.add("Bear");
        guess.add("Encourage");
        guess.add("Promise");
        guess.add("Soup");
        guess.add("Chess");
        guess.add("Insurance");
        guess.add("Pancakes");
        guess.add("Stream");

        System.out.println("Here is the word I am thinking of: ");

        String guess1 = "Tree";
        String[] splittedWord = guess1.split("");
        String guessNow;

        String word1 = " Tree";
        ArrayList<String> splittedWord1 = new ArrayList<>();
        for (int index = 0; index < splittedWord.length; index++) {
            if (splittedWord[0].equalsIgnoreCase("T") || splittedWord[1].equalsIgnoreCase("r") || splittedWord[2].equalsIgnoreCase("e") || splittedWord[3].equalsIgnoreCase("e")) {
                System.out.println("_ ");
            } else {
                System.out.println(splittedWord[index] + "");
            }
        }
        int i = 1;
        do {

            System.out.println("Enter letter or word:");
            guessNow = input.nextLine();

            if (guessNow.equalsIgnoreCase("T")) {
                System.out.println("T is in the first spot");
            } else if (guessNow.equalsIgnoreCase("r")) {
                System.out.println("r is in the second spot");
            } else if (guessNow.equalsIgnoreCase("e")) {
                System.out.println("e is in the third and fourth position");
            } else if (guessNow.equalsIgnoreCase(guess1)) {
                System.out.println("You won! The word was tree");
            } else if (!guessNow.equalsIgnoreCase(guess1)) {
                System.out.println("You have guessed incorrectly " + i + "/6 times.");
                i++;
            }

        }
        while (i <= 6);
        System.out.println("Sorry, you have no more guesses left. The word was tree. \n Thank you for playing!");

//Repeat for other words as well
    {
            Random rnd = new Random();

            int index = rnd.nextInt(guess.size() - 1);

            String nextWord = guess.get(index);
            String nextWord1 = guess.get(1);
//for loop

        //while loop through questions
        }

    }
}



