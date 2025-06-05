package Inlämning2;

import java.util.Scanner;

public class WordCounterMain {

    public static void main(String[] args) {
        //skapar en Scanner så användaren kan mata in sin input
        Scanner scan = new Scanner(System.in);

        //ett nytt objekt i klassen WordCounter
        WordCounter words = new WordCounter();

        System.out.println("Skriv några ord/meningar eller ordet STOP för att avsluta programmet: ");
        String input = scan.nextLine();
        //programmet körs i en loop tills användaren skriver ordet "STOP"
        while (!words.stopMain(input)) {
            input = scan.nextLine();

            //skickar input till metoden för att göra alla uträkningar
            words.checkWords(input);

        }
        //skriver ut alla uträkningar efter programmet avslutats
        System.out.println("Rader: " + words.getLines());
        System.out.println("Tecken: " + words.getCharacter());
        System.out.println("Ord: " + words.getWords());
        System.out.println("Längsta ordet: " + words.getLongestWord());

    }

}
