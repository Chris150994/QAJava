/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediate.JUnitTested.TooHot;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class TooHotTest {
    
    public TooHotTest() {
    }
    
    @Test
    public void TooHotTestSummer(){
        TooHot tH = new TooHot();
        assertEquals(true,(tH.CheckTemp(100, true)));
        assertEquals(true,(tH.CheckTemp(60, true)));
        assertEquals(false,(tH.CheckTemp(101, true)));
        assertEquals(false,(tH.CheckTemp(59, true)));
    }
    
    @Test
    public void TooHotTestNotSummer(){
        TooHot tH = new TooHot();
        assertEquals(true,(tH.CheckTemp(90, false)));
        assertEquals(false,(tH.CheckTemp(91, false)));
        assertEquals(true,(tH.CheckTemp(60, false)));
        assertEquals(false,(tH.CheckTemp(59, false)));
    }
}
