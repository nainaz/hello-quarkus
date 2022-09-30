package functions;

import io.quarkus.funqy.Funq;
import java.util.*;


/**
 * Your Function class
 */
public class Function {

    /**
     * Use the Quarkus Funqy extension for our function. This function simply echoes its input
     * @param input a Java bean
     * @return a Java bean
     */
    @Funq
    public Output function(Input input) {

        // Add business logic here
        Map<String, String> greetings = Map.of(
                   "english", "Welcome",
                   "spanish", "Bienvenido",
                   "italian", "Benvenuto");

        String lang = Optional.ofNullable(input.getLanguage()).orElse("english");
        String greeting = greetings.getOrDefault(lang, "");
    
        return new Output(String.format("%s!!! Here is your message: %s", greeting,
                            input.getMessage()));
    }

   
}



