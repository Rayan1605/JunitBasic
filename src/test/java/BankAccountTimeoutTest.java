import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)

public class BankAccountTimeoutTest {
//The first is using the timeout Annotation
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS) //so the first value is the time it can wait
    //the second is the unit
    public void testDepositTimeoutAssertion(BankAccount bankAccount){
        bankAccount.deposit(300);
        assertEquals(300,bankAccount.getBalance());
    }
    //below is using the assertimeout
    @Test
    public void testDepositTimeoutAnnotation(BankAccount bankAccount){
        try{
            Thread.sleep(10000); //putting it to sleep so it can fail
        }catch (Exception e){
            e.printStackTrace();
        }
        assertTimeout(Duration.ofMillis(500) , ()-> {
            Thread.sleep(1000);//putting it to sleep longer so it can fail
            //so one will pass and the other will fail
        });

    }

}
