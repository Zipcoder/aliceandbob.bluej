
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
    
        if (input.equals("Alice")) {
            return "Hello Alice";}
        else if (input.equals("Bob")){
            return "Hello Bob";}
        else if (!input.equals("Alice")){
            return "I DON'T KNOW YOU, YOU ARE SCARY";}
        else if (!input.equals("Bob")){
            return "I DON'T KNOW YOU, YOU ARE SCARY";}
          
        
        return result;
    }
}
