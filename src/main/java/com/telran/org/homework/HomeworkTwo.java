package com.telran.org.homework;

import java.util.Scanner;

public class HomeworkTwo {

    public static void getString(String line){
        char lastChar = line.charAt(line.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        boolean containsJava = line.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);

        String upperCaseLine = line.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseLine);

        String lowerCaseLine = line.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseLine);

        String subStr = line.substring(line.indexOf("Java"), line.indexOf("Java") + "Java".length());
        System.out.println("Вырезанная подстрока 'Java': " + subStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Введите первое слово (с четным количеством букв):");
        String word1 = scanner.nextLine();

        System.out.println("Введите второе слово (с четным количеством букв):");
        String word2 = scanner.nextLine();


        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            String firstHalf = word1.substring(0, word1.length() / 2);
            String secondHalf = word2.substring(word2.length() / 2);
            String combinedWord = firstHalf + secondHalf;
            System.out.println("Результат: " + combinedWord);
        }

        String line = "I study Basic Java";
        getString(line);

        }
    }
