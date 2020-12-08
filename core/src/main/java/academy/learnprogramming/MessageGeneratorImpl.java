package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MessageGeneratorImpl implements MessageGenerator {

    // Constants
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    // Fields
    private final Game game;

    // Constructor
    @Autowired
    public MessageGeneratorImpl(Game game) {
        this.game = game;
    }

    // Init Method
    @PostConstruct
    public void init() {
        log.info("Game = {}", game);
    }

    // Destroy Method
    @PreDestroy
    public void preDestroy() {
        log.info("I will be destroyed now, BYE BYE");
    }

    // Public Methods
    @Override
    public String getMainMessage() {
        return "Number is between " +
                game.getSmallest() +
                " and " +
                game.getBiggest() +
                ". Can you guess it?";
    }

    @Override
    public String getResultMessage() {
        if(game.isGameWon()) {
            return "You guessed it! The number was " + game.getNumber();
        } else if (game.isGameLost()) {
            return "You lost. The number was " + game.getNumber();
        } else if (!game.isValidNumberRange()) {
            return "Invalid number range!";
        } else if (game.getRemainingGuesses() == game.getGuessCount()) {
            return "What is your first guess?";
        } else {
            String direction = "Lower";
            if(game.getGuess() < game.getNumber()) {
                direction = "Higher";
            }
            return direction + "! You have " + game.getRemainingGuesses() + " guesses left";
        }
    }
}
