
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AliceAndBobEngineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AliceAndBobEngineTest
{
    @Test
    public void evaluateAliceOrBobTestAlice0(){
        //given
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        String input = "Alice";
        String expected = "Hello Alice";

        // when
        String actual = aliceAndBobEngineTest.evaluateAliceOrBob(input);
        // then :
        assertEquals(expected, actual);
    }
    
    
    @Test
    public void evaluateAliceOrBobTestAlice1(){
        //given
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        String input = "Jeff. Jeff the Elephant.";
        String expected = "Hello Alice";

        // when
        String actual = aliceAndBobEngineTest.evaluateAliceOrBob(input);
        // then :
        assertNotEquals(expected, actual);
    }
    
       
    @Test
    public void evaluateAliceOrBobTestAlice2(){
        //given
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        String input = "Alicia";
        String expected = "I DON'T KNOW YOU, YOU ARE SCARY";

        // when
        String actual = aliceAndBobEngineTest.evaluateAliceOrBob(input);
        // then :
        assertEquals(expected, actual);
    }
    
    
    @Test
    public void evaluateAliceOrBobTestAlice3(){
        //given 
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();
        String input = "Alice";
        String expected = "I DON'T KNOW YOU, YOU ARE SCARY";
        
       //when
       String actual = aliceAndBobEngineTest.evaluateAliceOrBob(input);
       //then :
       
        assertNotEquals(expected,actual);

    }
    
    @Test
    public void evaluateAliceOrBobTestBob(){
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();

        assertEquals("Hello Bob", aliceAndBobEngineTest.evaluateAliceOrBob("Bob"));
        assertNotEquals("Hello Alice", aliceAndBobEngineTest.evaluateAliceOrBob("Pamela. Pamela the tropical citrus tree."));

        assertEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Bobert"));
        assertNotEquals("I DON'T KNOW YOU, YOU ARE SCARY", aliceAndBobEngineTest.evaluateAliceOrBob("Bob"));
    }

    @Test
    public void evaluateAliceOrBobTestScary(){
        AliceAndBobEngine aliceAndBobEngineTest = new AliceAndBobEngine();

        assertNotEquals("I don't know you, you are scary?", aliceAndBobEngineTest.evaluateAliceOrBob("Cynthia"));
        assertNotEquals("I don't know you, you are scary!", aliceAndBobEngineTest.evaluateAliceOrBob("Simba"));
        assertNotEquals("New method, who dis?", aliceAndBobEngineTest.evaluateAliceOrBob("Luna"));
    }

}
