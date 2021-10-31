/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:05 PM
 */
public class AliceAndBobEngine {
    /**
     * return `true` if the input value is "Alice"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice"
     */
    public Boolean isAlice(String input) {
        String name = "Alice";
        boolean rightName;
        
        if (input.equals(name)) {
            rightName = true;
        } else {
            rightName = false;
        }
        
        return rightName;
    }

    /**
     * return `true` if the input value is "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Bob"
     */
    public Boolean isBob(String input) {
        String name = "Bob";
        boolean rightName;
        
        if (input.equals(name)) {
            rightName = true;
        } else {
            rightName = false;
        }
        
        return rightName;
    }

    /**
     * return `true` if the input value is "Alice" or "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice" or "Bob"
     */
    public Boolean isAliceOrBob(String input) {
        String alice = "Alice";
        String bob = "Bob";
        boolean rightName;
        
        if (input.equals(alice) || input.equals(bob)) {
            rightName = true;
        } else {
            rightName = false;
        }
        
        return rightName;
    }

    /**
     * if the input value is "Alice" or "Bob", then
     *      return "Hello PERSONSNAME!",
     * otherwise
     *      return "Begone, PERSONNAME! You're a stranger!",
     * where `PERSONNAME` is replaced with the person's name respectively.
     *
     * @param input - this value is variable: it has the potential to be many things
     * @return respective String value
     */
    public String getGreeting(String input) {
        String alice = "Alice";
        String bob = "Bob";
        String greeting = null;
        
        if (input.equals(alice)) {
            greeting = "Hello, " + input + "!";
        } else if (input.equals(bob)) {
            greeting = "Hello, " + input + "!";
        } else {
            greeting = "Begone, " + input + "! You're a stranger!";
        }
        
        return greeting;
    }
}
