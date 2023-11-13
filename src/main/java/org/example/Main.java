package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /// Домашно 2:
        /// Заместете даден под-string в даден string с друг текст:
        /// Пример: “My name is <Test>” – заместете Test с нещо, което чете от конзолата.
        /// Сравнете 2 стринга дали са еднакви - подадени от конзолата и изпишете резултата в нея.
        /// Пребройте колко думи има в един стринг (разделете текста по space) - изпишете резултата в нея.
        /// Обединете 2 и повече стринга в един и го изпишете в конзолата.

        System.out.println("What is your favourite type of car ?");
        Scanner scanner = new Scanner(System.in);
        String favouriteCar = scanner.nextLine();

        System.out.println("My favourite type of car is " + favouriteCar);

        System.out.println("What car do you own ?");
        String currentCar= scanner.nextLine();

        System.out.println("Are the two cars the same? " + favouriteCar.equals(currentCar));

        System.out.println("Please write a sentence");
        String sentence= scanner.nextLine();
        String[] l = sentence.split(" ");

        System.out.println("The number of words in the above sentence is: " + l.length);

        System.out.println("My favourite car is " + favouriteCar + " and my current car is " + currentCar + " and i wrote the sentence : " + sentence);

    }
}