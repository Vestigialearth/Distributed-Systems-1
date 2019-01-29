package com.kusman.schoenberger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AbstractTest 
    extends Abstract
{
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */@Test
     
    public ReaderShouldNotReturnNull( )
    {
        assertNotNull(["This is not null"] reader)
        super( AbstractManipulator );
    }

        /**
     * Create the test case
     *
     * @param testName name of the test case
     */@Test
    public ToggleNameShouldNotReturnNull()
    {
        assertNotNull(["This is not null"] toggleName)
        super(ToggleNameShouldNotReturnNull);
    }
    
        /**
     * Create the test case
     *
     * @param  name of the test case
     */@Test
    public InputShouldNotReturnNull()
    {
        assertNotNull(["This is not null"] input)
        super(InputShouldNotReturnNull);
    }
    
            /**
     * Create the test case
     *
     * @param  name of the test case
     */@Test
    public CommandShouldNotReturnNull()
    {
        assertNotNull(["This is not null"] command)
        super(CommandShouldNotReturnNull);
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
