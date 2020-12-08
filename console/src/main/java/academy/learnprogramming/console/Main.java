package academy.learnprogramming.console;

import academy.learnprogramming.config.GameConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    //private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess The Number Game");

        // Create the Context (container) that creates instances of beans presented
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        // Close context (container) to prevent any memory resource leak
        context.close();

        /*
        // Get the created object (bean) of numberGenerator from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        // Call method next() to get a random number
        int number = numberGenerator.next();

        // Log generated number
        log.info("number = {}", number);

        // Get game bean from context (container)
        Game game = context.getBean(Game.class);

        // Get Message bean from context (container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        // Call messageGenerator methods
        System.out.println(messageGenerator.getMainMessage());
        System.out.println(messageGenerator.getResultMessage());
        */
    }
}
