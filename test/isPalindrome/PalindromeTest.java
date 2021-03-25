package isPalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("eve"));
    }
    @Test
    public void isNotPalindrome() {
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome("apple"));
    }
}
