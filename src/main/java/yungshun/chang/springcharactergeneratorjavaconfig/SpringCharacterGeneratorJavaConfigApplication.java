package yungshun.chang.springcharactergeneratorjavaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCharacterGeneratorJavaConfigApplication {

    public static void main(String[] args) {

        // [1] Load Spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CharacterGeneratorConfig.class);

        // [2] Get the bean from Spring container
        CharacterProfile characterProfile = context.getBean("maleCharacterProfile", CharacterProfile.class);

        // [3] Call a method on the bean
        System.out.println(characterProfile.getName());

        // [4] Call method to get personality
        System.out.println(characterProfile.getPersonality());

        // [6] Call methods with the pros values injected
        System.out.println(characterProfile.getAge());
        System.out.println(characterProfile.getSocialClass());

        // [5] Close the context
        context.close();
    }

}
