import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
// So this is our ParamterResolver class THAT WE NEED in order to implement dependency Injection and to do this we have to implement ParameterResolver
//Once we do we are going to have to override two methods
public class BankAccountParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == BankAccount.class; // this is to basically set our thing to bankaccount class
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
       return new BankAccount(0,0); // this is to return our bankaccount
    }
}
