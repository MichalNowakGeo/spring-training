package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");
        System.out.println(context);

        Message message = context.getBean("myMessage", Message.class);
        System.out.println(message.getText());

        ExtraMessage extraMessage = context.getBean("myExtraMessage", ExtraMessage.class);
        System.out.println(extraMessage.getText());

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        message.setText("Zmiana");
        Message message1 = context.getBean("myMessage", Message.class);
        System.out.println(message1.getText());

//        ((ClassPathXmlApplicationContext)context).registerShutdownHook();

        Message myMessage3 = context.getBean("myMessage3", Message.class);
        //myMessage3.setText("nowy");
        System.out.println(myMessage3.getText());
        Message myMessage4 = context.getBean("myMessage3", Message.class);
        System.out.println(myMessage4.getText());

        System.out.println(myMessage3.equals(myMessage4));

        Person person = context.getBean(Person.class);
        System.out.println(person.getAddress().getCity());
    }


}