import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.*; //importing it here
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("Testing BankAccount class")
public class bankAccounted {

    @Test
    @DisplayName("withdraw Successfully ")
    public void testwithdraw(){
        BankAccount bankAccount = new BankAccount(500,-1000);//Creating the method
       assumeTrue(bankAccount != null);
       //basically what is your assumption when dealing with this class so before withdrawing
        //we are assuming that IT IS NOT NULL
        //As you will see the assumption is met so the TEST CONTINUES RUNNING
        //if it was not meant then it will fail the test
        bankAccount.withdraw(300);//calling the method withdraw
        assertEquals(-300,bankAccount.getBalance());//seeing if it equals

    }
}
