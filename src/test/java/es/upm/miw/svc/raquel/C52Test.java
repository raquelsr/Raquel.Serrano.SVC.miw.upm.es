package es.upm.miw.svc.raquel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C52Test {

    C52 c52;
    
    @Before
    public void before() {
        c52 = new C52();
    }
    
    @Test
    public void testMA() {
        assertEquals("mA", c52.mA());
    }

}
