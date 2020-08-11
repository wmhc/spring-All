import com.hc.Dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.image.PixelConverter;

public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplacationContext.xml");
        User user=context.getBean("user",User.class);
        System.out.println(user.getName());
    }
}
