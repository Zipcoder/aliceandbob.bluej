
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * Michael Doll
 * 10.16.19
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
        if(input == "Alice" || input == "Bob"){
            return "Hello" + " " + input; 
        }else {
            return "I DON'T KNOW YOU, YOU ARE SCARY";
        }
  
    }
}
