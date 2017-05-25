package baristamatic5;

/* Copyright (C) 2017 Ilakkuvaselvi Manoharan - All Rights Reserved
 * 
 */

import org.junit.Ignore;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class VendingMachineTest {
	
	private static VendingMachine vm;
	   
    @BeforeClass
    public static void setUp(){
        vm = VendingMachineFactory.createVendingMachine();
    }
   
    @AfterClass
    public static void tearDown(){
        vm = null;
    }
       
   
    @Test
    public void testOutOfStock(){
        for (int i = 0; i < 6; i++) {
        	
        	vm.dispenseItem(Menu.AMERICANO);
            
        }
     
    }
    
    @Test
    public void testReStock(){
        
     vm.restock();
     
     
    }
      
   
    @Test
    public void testRestock(){
        VendingMachine vmachine = VendingMachineFactory.createVendingMachine();
        vmachine.restock();;
       
        vmachine.dispenseItem(Menu.CAPPUCCINO);
       
    }
    
   
}
