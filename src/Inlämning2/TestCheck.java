package Inlämning2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestCheck {

    @Test
    public void testGetLines() {
        //arrange
        WordCounter wordCounter = new WordCounter();

        //act
        wordCounter.checkWords("Tjenare mannen");
        wordCounter.checkWords("Tjenare grabben");
        int actual = wordCounter.getLines();
        int expected = 2;

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testGetWords() {
        //arrange
        WordCounter wordCounter = new WordCounter();

        //act
        wordCounter.checkWords("Tjenare mannen");
        wordCounter.checkWords("Tjenare grabben");
        wordCounter.checkWords("Jag heter Sebastian");
        int actual = wordCounter.getWords();
        int expected = 7;

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCountCharacters() {
        //arrange
        WordCounter wordCounter = new WordCounter();

        //act
        wordCounter.checkWords("tjabba tjena");
        int actual = wordCounter.getCharacter();
        int expected = 12;

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestWord() {
        //arrange
        WordCounter wordCounter = new WordCounter();

        //act
        wordCounter.checkWords("tjabba");
        wordCounter.checkWords("jag");
        wordCounter.checkWords("nationalencyklopedin");
        wordCounter.checkWords("cooolt");
        String actual = wordCounter.getLongestWord();
        String expected ="nationalencyklopedin";

        //assert
        assertEquals(expected, actual);
    }


    @Test
    public void testBigAndSmallLettersStop() {
        //arrange
        WordCounter wordCounter = new WordCounter();

        //act
        boolean actual = wordCounter.stopMain("StOp");
        boolean expected = true;

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void testWrongSpellingStop() {
        //arrange
        WordCounter wordCounter = new WordCounter();

        //act
        boolean actual = wordCounter.stopMain("Stopp");
        boolean expected = false;

        //assert
        assertEquals(expected, actual);
    }
}
