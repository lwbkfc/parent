package com.lin;

import com.lin.test.Driver;
import com.lin.test.ICar;
import com.lin.test.IDriver;
import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

/**
 * Created by lwb on 16/1/11.
 */
public class TestCar extends TestCase {
    Mockery context = new JUnit4Mockery();
    @Test
    public void testDriver(){
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();
        context.checking(new Expectations(){
            {
                oneOf(car).run();
            }
        });
        driver.drive(car);
    }

}
