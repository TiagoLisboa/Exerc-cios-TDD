/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class FizzbuzzTest {
    
    public FizzbuzzTest() {
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
     * Test of Answer method, of class Fizzbuzz.
     */
    @Test
    public void testAnswer() {
        System.out.println("Answer");
        Fizzbuzz instance = new Fizzbuzz();
        int i = 1;
        String expResult = "1";

        Map<Integer, String> mapaTestes = new HashMap<>();
        for (; i <= 10; i++) {
            mapaTestes.put(i, ((i % 3 == 0 && i % 5 == 0) ? "fuzzbuzz" : ((i % 3 == 0) ? "fizz" : ((i % 5 == 0) ? "buzz" : "" + i))));
        }
        
        for (Map.Entry<Integer, String> entry : mapaTestes.entrySet()) {
            String result = instance.Answer(entry.getKey());
            expResult = entry.getValue();
            assertEquals(expResult, result);
        }
        
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
