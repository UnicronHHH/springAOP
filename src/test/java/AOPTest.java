import aop.MathCalculator;
import config.ConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {

    AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigOfAOP.class);

    @Test
    public void print(){
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1,0);//错误测试
        System.out.println("git 更新测试");
    }

    @Test
    public void xxxAwareTest(){
        System.out.println(applicationContext);
    }
}
