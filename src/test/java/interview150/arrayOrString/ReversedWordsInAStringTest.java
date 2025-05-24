package interview150.arrayOrString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedWordsInAStringTest {

    ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();

    @Test
    void testSingleWord() {
        assertEquals("Yes", reverseWordsInAString.reverseWords("Yes"));
        assertEquals("Spaces", reverseWordsInAString.reverseWords("Spaces  "));
    }

    @Test
    void testMultipleWords() {
        assertEquals("I am Coding", reverseWordsInAString.reverseWords(" Coding   am I "));
        assertEquals("today is 24", reverseWordsInAString.reverseWords("24 is  today"));
    }

}
