import dao.UserDaoImpll;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImpl;

public class myTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoImpll());
//        userService.getUserDao();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService= (UserService) context.getBean("UserServiceImpl");
        userService.getUserDao();


    }
}
