package com.kusman.schoenberger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *Tests to see that the class "promptString" doesnt return with a null identifier
 *
 */
public class GroupManipulatorTest
    extends GroupManipulator 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
     
    public GroupManipulatorrTest( String GroupManipulatorrTest )
    {
       assertNotNull(["This is not null",] groupManager)
       assertNotNull(["This is not null",] deviceManager)
       assertNotNull(["This is not null",] id)
       assertNotNull(["This is not null",] str)
        super(GroupManipulatorrTest);
    }
    
        public printDevicesInGroupTest( String printDevicesInGroupTest )
    {
       assertNotNull(["This is not null",] id)
        super(printDevicesInGroupTest);
    }
    
    public runTest( String runTest )
    
    {
       assertNotNull(["This is not null",] m )
       assertNotNull(["This is not null",] id)
       assertNotNull(["This is not null",] n)
        super(runTest);
    }
    
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
