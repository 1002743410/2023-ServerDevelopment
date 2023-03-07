package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/** 1.加了Aspect注解指定一个切面 */
@Aspect
public class Audience {
    /** Before被切入的方法运行之前把下面的方法应用 */
    //返回值加*意思是不关心返回的是什么
    @Before("execution(* concert.Performance.perform( .. ))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }//DIY

    @Before("execution(* concert.Performance.perform( .. ))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("execution(* concert.Performance.perform( .. ))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("execution(* concert.Performance.perform( .. ))")
    public void demandRefund() {
        System.out.println("Demand a refund");
    }
}