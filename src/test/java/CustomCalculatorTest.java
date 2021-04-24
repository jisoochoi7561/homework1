import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,10);
        assertEquals(result,20);
    }

    @Test
    public void testSubtract(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10,10);
        assertThat(result,is(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThorwExceptionWhenGetZeroIndex(){
        new ArrayList<Object>().get(0);
    }

    @Test(timeout  = 5000)
    public void testshouldRunInLimitedTime() throws InterruptedException{
        Thread.sleep(6000);
    }

}