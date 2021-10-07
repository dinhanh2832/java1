package com.codegym;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score : ");
        int score;

        score = scanner.nextInt();
        System.out.println("Enter score : ");

        if (score <= 5 && score >= 0) {
            System.out.printf("Your score is %d Your academic performance is Average.",score);
        } else if (score < 8) {
            System.out.printf("Your score is %d Your academic ability is Good.",score);
        } else if (score <= 10) {
            System.out.printf("Your score is %d Your academic ability is Best Master.",score);

        }
    }
}
