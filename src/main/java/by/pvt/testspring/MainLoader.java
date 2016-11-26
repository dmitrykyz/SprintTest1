package by.pvt.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dmitry on 11/25/2016.
 */
public class MainLoader {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans-services.xml");
        SenderService senderService = (SenderService) context.getBean("sender");
        senderService.sendMessage();
    }
}

