import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage() + " " + secondBean.getMessage());

        ApplicationContext applicationContextCat =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat =
                (Cat) applicationContextCat.getBean("cat");
        Cat secondBeanCat =
                (Cat) applicationContextCat.getBean("cat");
        System.out.println(beanCat.getString() + " " + secondBeanCat.getString());

        System.out.println(bean == secondBean);
        System.out.println(beanCat == secondBeanCat);
    }
}