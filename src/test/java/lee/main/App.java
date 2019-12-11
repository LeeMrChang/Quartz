package lee.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName:App
 * @Author：Mr.lee
 * @DATE：2019/11/08
 * @TIME： 10:07
 * @Description: TODO
 */
public class App {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("application-jobs.xml");
    }
}
