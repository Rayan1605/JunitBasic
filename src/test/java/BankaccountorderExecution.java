import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //You need this and REMEMBER NO SEMI COLEN
// Ya so put this and after put order in each of your testing methods and pick the order you want

public class BankaccountorderExecution {
//So this is test your thing in the order that you wish
    static BankAccount bankAccount = new BankAccount(0,0);

        @Test
        @Order(2) // this would run second // if I did not have the order it will run first
    public void testWithdraw(){
        bankAccount.withdraw(300);
        assertEquals(-300,bankAccount.getBalance());
    }
        @Test
        @Order(1) //so this will run first //  if I did not have this order then it would run second
        public void testDeposit(){
        bankAccount.deposit(500);
        assertEquals(200,bankAccount.getBalance());
    }





}
