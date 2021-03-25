package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    @Test
    public void addTest(){
        SimpleCalculator calc = new SimpleCalculator();
        calc.add(2,2);
        assertEquals(0, calc.getResult()); //calc.getResult() == 5
    }
//    @Test
//    public void addErr(){
//        SimpleCalculator calc = new SimpleCalculator();
//        calc.add(1,1);
//        assertEquals(2, calc.getResult() );
//        calc.add(2,3);
//        assertEquals(5, calc.getResult()); //calc.getResult() == 5
//    }
}