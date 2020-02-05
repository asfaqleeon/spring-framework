import beans.Samsung;
import beans.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void xmlConfigExample() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle obj = (Vehicle) applicationContext.getBean("car");
        obj.drive();

        //Tyre tyre = (Tyre) applicationContext.getBean("tyre");
        //System.out.println(tyre);
    }

    public static void annotationConfigExample() {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }

    public static void main(String[] args) {
        annotationConfigExample();
    }
}
