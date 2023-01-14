import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Parallel Execution is basiaclly multiple test running at the same time
// So to add Parallel Execution we need to  add a junit-platform-properties(basiaclly a file called that) in the Resources file
//and say this in the file
//junit.jupiter.execution.parallel.enabled = true
//     junit.jupiter.execution.parallel.config.strategy = dynamic

//However this does not add the test parallel automatically , we need to indicate that we want this by an annotation

//And it below
@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(BankAccountParameterResolver.class)

public class BankAccountParallelExecution {
//Now the test are running at the same time instead of waiting one by one
    @Test
    public void testDeposit(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }

    @Test
    public void testDeposit2(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }
    @Test
    public void testDeposit3(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }


}
