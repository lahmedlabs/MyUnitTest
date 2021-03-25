package indirectOut;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IndirectOutTest {

    @Mock
    Greeting greeting;
    @InjectMocks
    IndirectOut indirectOut;
    @Test
    public void testHelloOnce(){
        MockitoAnnotations.initMocks(this);
        indirectOut.doIt("Hello");
        verify(greeting,times(1)).say("Hello!");
    }
    @Test
    public void testHiOnce(){
        MockitoAnnotations.initMocks(this);
        indirectOut.doIt("Hi");
        verify(greeting,times(1)).say("Good bye!");
        verify(greeting,never()).say("Hello!");
    }
    @Test
    public void testHelloThreeTimes(){
        MockitoAnnotations.initMocks(this);
        for(int i=0; i<3;i++)
            indirectOut.doIt("Hello");
        verify(greeting,times(3)).say("Hello!");
        verify(greeting,timeout(100).atLeast(2)).say("Hello!");
    }
}