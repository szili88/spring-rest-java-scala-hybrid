package szili88.spring_rest_java_scala_hybrid.endpoints;

import org.junit.Test;
import static org.junit.Assert.*;

public class GreetingControllerJavaTest {

    @Test
    public void testHello() throws Exception {
        String result = new GreetingControllerJava().hello("John");
        assertEquals("Hello, Java John!", result);
    }
}