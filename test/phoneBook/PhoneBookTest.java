package phoneBook;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookTest {

    @Test
    public void testPhoneBookCreation(){
        PBook pBook = new PBook();
        assertTrue(pBook.isEmpty());
    }

    @Test
    public void testAddNumber(){
        PBook pBook = new PBook();
        pBook.addNumber1("Mark", "010-1234-1234");
        assertFalse(pBook.isEmpty());
    }
    @Test
    public void testGetNumber(){
        PBook pBook = new PBook();
        pBook.addNumber1("Mark", "010-1234-1234");
        assertEquals("010-1234-1234", pBook.getNumber("Mark"));
        assertFalse(pBook.isEmpty());
    }
    @Test
    public void testTwoNumbers(){
        PBook pBook = new PBook();
        pBook.addNumber1("Mark", "010-1234-1234");
        pBook.addNumber1("James", "010-5678-5678");
        assertEquals("010-1234-1234", pBook.getNumber("Mark"));
        assertEquals("010-5678-5678", pBook.getNumber("James"));
        assertFalse(pBook.isEmpty());
    }

}