import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)

public class BankAccountParameterizedTest {
       @ParameterizedTest //This is very similar to repeat tests expect it uses different values.
       @ValueSource(ints = {100,400,800,1000}) //and to know which different value it uses is with ValueSource
       //once that you write ints = and then in a array formot write the different value you want check
        public void testDeposit(int amount , BankAccount bankAccount){ //to get it from value
           //just write int and then a name (can be any) and then java will know to go to the
           //ValueSource
            bankAccount.deposit(amount);
            assertEquals(amount,bankAccount.getBalance());
        }
            @ParameterizedTest
            @EnumSource(value = DayOfWeek.class, names = {"TUESDAY" , "THURSDAY"})
            //we are not using a EnumSource which take a enum value
            //a enum is defined as set of values that can't be changed
        public void testDayOfWeek(DayOfWeek day){
           assertTrue(day.toString().startsWith("T")); //once we get the values check if it start with T
        }
        @ParameterizedTest
        //@CsvSource({"100, Mary" , "200, Rachid","150, Ted"}) we made a new file in the Resources file
        //and it our root look up right side and consists of the same thing 100,mary then next line 200 Rachid
        //Now we use the fileSource
        @CsvFileSource(resources = "details.csv")
        public void despositAndNameTest(double amount, String name, BankAccount bankAccount){
            bankAccount.deposit(amount);
            bankAccount.setHolderName(name);
            assertEquals(amount,bankAccount.getBalance());
            assertEquals(name,bankAccount.getHolderName());
//So here we are saying mary get 100 euro
            //then checking if she does with asset equal
        }




    }

