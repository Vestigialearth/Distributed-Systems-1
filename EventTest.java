package com.kusman.schoenberger;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *Tests to see that the class "promptString" doesnt return with a null identifier
 *
 */
public class EventHandlerManipulatorTest
    extends EventHandlerManipulator
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
     
    public EventHandlerManipulatorrTest( String EventHandlerManipulatorrTest )
    {
       assertNotNull(["This is not null",] taskManager)
       assertNotNull(["This is not null",] deviceManager)
       assertNotNull(["This is not null",] eventBroker)
       assertNotNull(["This is not null",] scheduler)
        super(EventHandlerManipulatorrTest);
    }
    
        public removeEventListenerTest( String removeEventListenerTest )
    {
       assertNotNull(["This is not null",] id)
        super(removeEventListenerTest);
    }
    
    public DateTest( String DateTest )
    
    {
       assertNotNull(["This is not null",] date)
       assertNotNull(["This is not null",] units)
       assertNotNull(["This is not null",] numberOfUnits)
        super(DateTest);
    }
    
        public addEventListenerTest( String addEventListenerTest )
    {
       assertNotNull(["This is not null",] name)
       assertNotNull(["This is not null",] nameRegex)
       assertNotNull(["This is not null",] task)
       assertNull(["This is null",] listenOnTask)
        super(addEventListenerTest);
    }
    
        public ScheduledTaskTypeTest( String ScheduledTaskTypeTest )
    {
       assertNotNull(["This is not null",] toggle)
       assertNotNull(["This is not null",] turnOn)
       assertNotNull(["This is not null",] turnOff)
       assertNull(["This is null",] delayInMinutes)
        super(ScheduledTaskTypeTest);
    }
   
        public createNameConditionTest( String createNameConditionTest )
    {
       assertNotNull(["This is not null",] namePattern)
        super(createNameConditionTest);
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
