/**
 * It is creating a greeting. If the person is Bob or Alice it will greet them
 * by name. Otherwise the result will be scared.
 *
 * @author Gregory Donnelly
 * @version 2.24.2021
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
        if (input.equals("Alice")) {
        result = "Hello Alice";
        } else if (input.equals("Bob")) {
        result = "Hello Bob";
        } else {
        result = "I DON'T KNOW YOU, YOU ARE SCARY";
        }
        return result;
    }
}
