package Inlämning2;

public class WordCounter {

    //Attributer som håller reda på antalet rader, tecken, ord och det längsta ordet
    private int lineCount;
    private int characterCount;
    private int wordCount;
    private String longestWord;

    //Konstruktor
    public WordCounter() {
        lineCount = 0;
        characterCount = 0;
        wordCount = 0;
        longestWord = "";
    }

    //metod som räknar rader, tecken, antal ord och uppdaterar det längsta ordet som användaren matat in
    public void checkWords(String line) {
        //ökar radräknaren
        lineCount++;

        //räknar tecken
        characterCount += line.length();

        //delar upp raden i ord och uppdaterar ordräknaren och sparar även det längsta ordet
        String[] wordArray = line.trim().split(" ");
        wordCount += wordArray.length;
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > longestWord.length()) {
                longestWord = wordArray[i];
            }
        }
    }

    //metod som returnerar antalet rader
    public int getLines() {
        return lineCount;
    }

    //metod som returnerar antalet tecken
    public int getCharacter() {
        return characterCount;
    }

    //metod som returnerar antalet ord
    public int getWords() {
        return wordCount;
    }

    //metod som returnerar längsta ordet
    public String getLongestWord() {
        return longestWord;
    }

    //metod för STOP, stora och små bokstäver fungerar
    public boolean stopMain(String line) {
        return line.equalsIgnoreCase("stop");
    }
}
