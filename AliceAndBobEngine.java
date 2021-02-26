
/**
 * Create a conditional statement to allow the test cases to pass.
 *
 * @author (Justin Banks)
 * @version (February 25, 2021)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
        if (input == "Alice" || input == "Bob") {
           result = "Hello " + input;
        } else {
            result = "I DON'T KNOW YOU, YOU ARE SCARY";
        }
        return result;
    }
}
