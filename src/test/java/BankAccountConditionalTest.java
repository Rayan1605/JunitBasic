import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BankAccountConditionalTest {

//This is how to test on only mac or windows
    //so for me it will run the Window test but IGNORE THE MAC one
    @Test
    @EnabledOnOs({OS.MAC})
    public void testMac(){

    }
        @Test
        @EnabledOnOs({OS.WINDOWS})
    public void testWindows(){

    }
//cHECKING jAVA VERSION
@Test
@EnabledOnJre({JRE.JAVA_17})
    public void testJRE(){

    }
    @Test
    @DisabledOnJre({JRE.JAVA_17})

    public void testNoJRE16(){

    }

}
