package tempConversion;

import org.junit.Test;

import static org.junit.Assert.*;

public class TempConversionTest {
    @Test
    public void testTempConversion() {
        TempConversion temp = new TempConversion();
        assertEquals(-17.78, temp.tempConversion(0,"F"), 0.01);
    }
}