package mvc;

import mvc.config.MvcConfig;
import mvc.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Check {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MvcConfig.class);

        UserService service = context.getBean(UserService.class);

        service.deleteUser(7);
        System.out.println("it is done");
    }

}
