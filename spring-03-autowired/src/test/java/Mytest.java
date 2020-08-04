import com.hc.pojo.Cat;
import com.hc.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Mytest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Person person=context.getBean("person",Person.class);
        Class c1 = Cat.class;
        Method[] m1= c1.getDeclaredMethods();
        for(Method m2 :m1){
            System.out.println(m2);
        }
        Method m3 = c1.getDeclaredMethod("shout");
        System.out.println(m3);
        Object o = c1.newInstance();
        m3.setAccessible(true);
        m3.invoke(o,null);
        person.getDog().shout();
    }
}
