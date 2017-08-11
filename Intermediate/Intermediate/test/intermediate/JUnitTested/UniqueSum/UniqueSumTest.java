/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate.JUnitTested.UniqueSum;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class UniqueSumTest {
    
    public UniqueSumTest() {
    }


    @Test
    public void testSum() {
        UniqueSum uS = new UniqueSum();
        
        assertEquals(6,(uS.Sum(1,2,3)));
        assertEquals(0,(uS.Sum(3,3,3)));
        assertEquals(2,(uS.Sum(1,1,2)));
    }
    
        //public static int Sum(int a, int b, int c)
    
}
