
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class codetest {
    @Test // We need this so it can run the code and test it
    public void testSayHello(){
        Code code = new Code(); // Just making the class interface
        assertEquals("Hello world" , code.sayHello()); // usally you have to write Assertion.assert
        //but a nicer way is to write this and import the static that you see above
        // to see what value is excepted write assertequal and then first paramater is what you expect the answer to be
        //and the next is the mthod you are calling and here you can add any paramater

        //Look below we can see the green tick which we got our expected result

    }

}
