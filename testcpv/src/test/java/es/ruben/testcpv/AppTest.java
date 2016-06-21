package es.ruben.testcpv;

import org.junit.Assert;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void test() {
        App app = new App();
        Assert.assertEquals("Hello", app.returnHello());
    }
    
}
