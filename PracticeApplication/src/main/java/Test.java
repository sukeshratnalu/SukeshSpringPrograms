import com.sb.pacticeApplication.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
  public static void main(String[] args) {

    Resource r=new ClassPathResource("applicationContext.xml");
    BeanFactory factory=new XmlBeanFactory(r);
    Student student=(Student) factory.getBean("student");
    student.setName("Sukesh");
    student.getStudent();
    Student student1=(Student) factory.getBean("student");
    student1.getStudent();
    System.out.println("getting by AbstractApplicationContext");
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Student student2=(Student) context.getBean("student");
    student2.getStudent();
    context.registerShutdownHook();
  }

}
