package com.kusman.schoenberger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *Tests to see that the class "promptString" doesnt return with a null identifier
 *
 */
public class AbstractTest
    extends Abstract
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public promptStringTest( String promptStringTest )
    {
       assertNotNull(["This is not null",] toggleName)
        super(promptStringTest);
    }
    
        public promptOneFromManyTest( String promptOneFromManyTest)
    {
       assertNotNull(["This is not null",] input)
        super(promptOneFromManyTest);
    }
    
        public matchFirstIntegerTest( String matchFirstIntegerTest)
    {
       assertNotNull(["This is not null",] m);
       assertNotNull(["This is not null",] id);
       super(matchFirstIntegerTest);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AbstractTest.class );
    }

    /**
     * Rigourous Test 
     */
    public void AbstractTest()
    {
        assertTrue(true);
    }
}
