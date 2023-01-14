import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDisabledTest {
    @Test
    @Disabled("Disabled because I wanted to test it ")// write this if you want to disable the test but you can also add a message
    @DisplayName("Deposit successfully")
    public void testDeposit(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }

}
