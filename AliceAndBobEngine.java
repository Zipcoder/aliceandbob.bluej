
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    if ("Alice".equals (input)){
        return "Hello Alice";
    } else if ("Bob".equals (input)){
        return "Hello Bob";
    } else if (!"Alice".equals (input)) {
        return "I DON'T KNOW YOU, YOU ARE SCARY";
    } else if (!"Bob".equals(input)) {
        return "I DON'T KNOW YOU, YOU ARE SCARY";
    }
    
        return result;
    }
}
