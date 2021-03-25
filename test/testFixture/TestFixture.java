package testFixture;

import org.junit.*;

public class TestFixture {
    @Test
    public void firstTest(){
        System.out.println("first test runs!");
    }
    @Test
    public void secondTest(){
        System.out.println("second test runs!");
    }
    @Test
    public void thirdTest(){
        System.out.println("third test runs!");
    }
    @Before
    public void setUp(){
        // precodition, init...
        System.out.println("Test started");
    }
    @After
    public void tearDown(){
        System.out.println("Test finished");
    }
    @BeforeClass
    public static void setUpClass(){
        System.out.println("Test Class started");
    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("Test Class finished");
    }
}
