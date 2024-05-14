package ru.ls.qa.school.core;

public class OddTask {

    public static boolean isOdd(int number) {
        return number % 2 !=0;
    }

    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 3;

        System.out.println(number1 + " - четное число? " + " ~ " + isOdd(number1));
        System.out.println(number2 + " - четное число? " + " ~ " + isOdd(number2));
    }

}
