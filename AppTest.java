package com.example;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    Bank b= new Bank();
    @BeforeAll
    public static void checkconnection(){
        System.out.println("connected");
    }
   
    @BeforeEach
    public void setbalance(){
        
        b.setBalance(20000);
    }

    
    

    @Test
    public void checkwithdrawsuccess(){
        
        Boolean r= b.withdraw(1500);
        assertTrue(r);

    }

    @Test
    public void checkWithdrawFail(){
        
        Boolean r= b.withdraw(20000);
        assertFalse(r);

    }

    @AfterEach
    public void cleanup(){
        System.err.println("clean up done");
    }

    @AfterAll
    public static void closeconnection(){
        System.out.println("connection closed");
    }


}



 // StudentService s= new StudentService();
    // @Test
    // public void marks(){
    //     int x=s.getMarks();
    //     assertEquals(80,x);
        
    // }
    // @Test
    // public void name(){
    //     String n=s.getName();
    //     assertNotNull(n);

    // }
    // @Test
    // public void city(){
    //     String c= s.getCity();
    //     assertNull(c);
    // }
    // @Test
    // public void passed(){
    //     Boolean b1=s.isPassed(50);
    //     assertTrue(b1);
    // }
    // @Test
    // public void notpassed(){
    //     Boolean b2= s.isPassed(30);
    //     assertFalse(b2);

    // }