package largestNumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {
    private LargestNumber lNumber;
    @Before
    public void setUp(){
        lNumber = new LargestNumber();
    }
    @Test
    public void largestAssendingOrder() {
//        LargestNumber lNumber = new LargestNumber();
        assertEquals(9, lNumber.largest(new int[] {7,8,9}) );
    }
    @Test
    public void largestReversedOrder() {
 //     LargestNumber lNumber = new LargestNumber();
        assertEquals(9, lNumber.largest(new int[] {9,8,7}) );
    }
    @Test
    public void largestDuplicated() {
//       LargestNumber lNumber = new LargestNumber();
        assertEquals(9, lNumber.largest(new int[] {9,9,8,7,0}) );
    }
    @Test
    public void largestSingle(){
        assertEquals(1, lNumber.largest(new int[] {1}) );
    }
}