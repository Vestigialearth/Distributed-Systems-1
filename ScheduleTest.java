package com.kusman.schoenberger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *Tests to see that the class "promptString" doesnt return with a null identifier
 *
 */
public class ScheduleManipulatorTest
    extends ScheduleManipulator
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
     
    public ScheduleManipulatorrTest( String EventHandlerManipulatorrTest )
    {
       assertNotNull(["This is not null",] reader)
       assertNotNull(["This is not null",] taskManager)
       assertNotNull(["This is not null",] deviceManager)
        super(EventHandlerManipulatorrTest);
    }
    
        public removeTaskTest( String removeTaskTest )
    {
       assertNotNull(["This is not null",] id)
        super(removeTaskTest);
    }
    
    public addTaskTest( String addTaskTest)
    
    {
       assertNotNull(["This is not null",] name)
       assertNotNull(["This is not null",] dateString)
       assertNotNull(["This is not null",] initialDate)
        super(addTaskTest);
    }
    
        public runTest( String runTest )
    {
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
