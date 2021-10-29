/**
 * @author git-leon
 * @version 1.0.0
 * @date 5/19/21 5:05 PM
 */
public class AliceAndBobEngine {
    private String name1 = "Alice";
    private String name2 = "Bob";
    /**
     * return `true` if the input value is "Alice"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice"
     */
    public Boolean isAlice(String input) {
        if(input.equals(name1))
        return true;
        else
        return false;
        
    }

    /**
     * return `true` if the input value is "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Bob"
     */
    public Boolean isBob(String input) {
        if(input.equals(name2))
        return true;
        else 
        return false;
        
    }

    /**
     * return `true` if the input value is "Alice" or "Bob"
     * @param input - this value is variable: it has the potential to be many things
     * @return `true` if `input` is "Alice" or "Bob"
     */
    public Boolean isAliceOrBob(String input) {
        if(input.equals(name1) || input.equals(name2))
        return true;
        else
        return false;
       
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
        if(input.equals(name1))
        return "Hello, Alice!";
        else if(input.equals(name2))
        return "Hello, Bob!";
        else
        return "Begone, " + input + "! You're a stranger!";
        
    }
}
