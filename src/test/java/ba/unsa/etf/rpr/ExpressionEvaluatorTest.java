package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionEvaluatorTest {



    @org.junit.jupiter.api.Test
    void evaluate() {

        double d = ExpressionEvaluator.evaluate("( 1 + ( 2 * 3 ) )");

        assertEquals(7.0,d);

    }

    @Test
    void nevalidanUnos(){

        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("(1 + ( 2 * 3 ) )");});
        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("(1 a ( 2 * 3 ) )");});
        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("1 + ( 2 * 3 ) )");});


    }


}