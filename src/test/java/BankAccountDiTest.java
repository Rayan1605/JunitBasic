import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)

public class BankAccountDiTest {
@RepeatedTest(5) //this will repeat the test 5 times
    public void testDeposit(BankAccount bankAccount){
   bankAccount.deposit(500);
   assertEquals(500,bankAccount.getBalance());
    }
}
