
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (Valentin G)
 * @version (October 16,2019)
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
        if (input.equals("Alice"))
        {
            this.result = "Hello " + input;
        } else if (input.equals("Bob")) 
        {
            this.result = "Hello " + input;
        }else
        {
            this.result = "I DON'T KNOW YOU, YOU ARE SCARY";            
        }    
            
        
        return this.result;
    }
}
