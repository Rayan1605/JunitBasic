import jdk.jfr.MemoryAddress;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountBeforeAndAfter {
    static BankAccount bankAccount ;


    @BeforeAll
    public static void prepTest(){
        bankAccount = new BankAccount(500,0);
    }
//If you want to something before testing or something after the testing you can use this annotation
    // @BeforeAll and AfterAll
    //However you Need too  have it as static to work however if you are not using static you can use the
    //TestInstance(TestInstance.lifecycle.PER_CLASS) and put it above the public class

    @Test
    public void testWithdraw(){
        bankAccount.withdraw(300);
        assertEquals(200,bankAccount.getBalance());
    }

    @Test
    public void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(700,bankAccount.getBalance());
    }

    @AfterAll
    public static void endTest(){
        System.out.println("Bye"); //It ran this after doing all the test
    }

}
