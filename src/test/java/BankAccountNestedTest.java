import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class BankAccountNestedTest {
//If I don't use nested test only the bottom 2 will run NOT THE BOTTOM 4
    @Test
    @DisplayName("withdraw Successfully ")
    public void testwithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);//Creating the method
        bankAccount.withdraw(300);//calling the method withdraw
        assertEquals(-300, bankAccount.getBalance());//seeing if it equals

    }
    @Test
    @DisplayName("Deposit successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400,0);
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }
    @Nested //here is nexted that is NEEDED for this to run since it a new class
    class WhenBalenceEqualsZero { // new class
        @Test
        public void testwidthdrawwhenzero(){
        BankAccount bankAccount = new BankAccount(0,0);
        assertThrows(RuntimeException.class , () -> bankAccount.withdraw(500));
        }

        @Test
        public void testwidthdrawbelowzero(){
        BankAccount bankAccount = new BankAccount(0,-1000);
        assertEquals(-500,bankAccount.getBalance());
        }
    }

}

