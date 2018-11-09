/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IT
 */
public class FriendEJBTest {
    
    public FriendEJBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of myTimer method, of class FriendEJB.
     */
    @Test
    public void testMyTimer() throws Exception {
        System.out.println("myTimer");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FriendEJB instance = (FriendEJB)container.getContext().lookup("java:global/classes/FriendEJB");
        instance.myTimer();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getList method, of class FriendEJB.
     */
    @Test
    public void testGetList() throws Exception {
        System.out.println("getList");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        FriendEJB instance = (FriendEJB)container.getContext().lookup("java:global/classes/FriendEJB");
        List expResult = null;
        List result = instance.getList();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
