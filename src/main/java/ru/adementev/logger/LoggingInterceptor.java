package ru.adementev.logger;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;
/**
 * Created by Антон Дементьев on 06.09.2017.
 */
@Interceptor
@Loggable
public class LoggingInterceptor {

    @Inject
    private Logger logger;

    @AroundInvoke
    public Object logMethod(InvocationContext invocationContext) throws Exception{
        logger.entering(invocationContext.getTarget().getClass().getName(),invocationContext.getMethod().getName());
        try {
            return invocationContext.proceed();
        }
        finally {
            logger.exiting(invocationContext.getTarget().getClass().getName(),invocationContext.getMethod().getName());
        }
    }
}
