package com.kusman.schoenberger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class DeviceTest 
    extends Device
{
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */@Test
     
    public idShouldNotReturnNull( )
    {
        assertNotNull(["This is not null"] id)
        super(idShouldNotReturnNull);
    }
    
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AbstractTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
