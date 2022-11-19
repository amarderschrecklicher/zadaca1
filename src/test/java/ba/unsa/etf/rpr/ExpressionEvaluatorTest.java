package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionEvaluatorTest {



    @org.junit.jupiter.api.Test
    void evaluate() {
        assertEquals(7.0,ExpressionEvaluator.evaluate("( 1 + ( 2 * 3 ) )"));
    }
    @org.junit.jupiter.api.Test
    void evaluate2() {
        assertEquals(5.0,ExpressionEvaluator.evaluate("( 1 + ( 2 * ( 14 / 7 ) ) )"));
    }
    @org.junit.jupiter.api.Test
    void evaluate3() {
        assertEquals(15.0,ExpressionEvaluator.evaluate("( 7 + ( 2 * ( 12 / sqrt ( 9 ) ) ) )"));
    }
    @org.junit.jupiter.api.Test
    void evaluate4() {
        assertEquals(4.0,ExpressionEvaluator.evaluate("( 7 - ( 2 + ( 13 / ( sqrt ( 25 ) + ( 2 * 4 ) ) ) ) )"));
    }


    @Test
    void nevalidanUnos1(){
        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("(1 + ( 2 * 3 ) )");});
    }
    @Test
    void nevalidanUnos2(){
        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("(1 a ( 2 * 3 ) )");});
    }
    @Test
    void nevalidanUnos3(){
        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("1 +( 2 * 3 ) )");});
    }
    @Test
    void nevalidanUnos4(){
        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("1 + ( 2 * 3 )");});
    }
    @Test
    void nevalidanUnos5(){
        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("( sqrt 16 )");});
    }
    @Test
    void nevalidanUnos6(){
        assertThrows(RuntimeException.class,
                ()->{ExpressionEvaluator.evaluate("( 1 + ( sqrt 16 ) )");});
    }



}