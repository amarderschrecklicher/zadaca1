package ba.unsa.etf.rpr;

import java.util.Arrays;
import java.util.Stack;

/**
 * ExpressEvaluator class divides the strings into operators or operands
 * format of strings: ( a + ( b - ( c * ( d / ( sqrt e ) ) ) ) )
 * a,b,c,d,e are real numbers
 * @author Amar Tahirovic
 */

public class ExpressionEvaluator {

   private static final Stack<String> operators = new Stack<String>();
   private static final Stack<Double> operands = new Stack<Double>();

    /**
     * evaluate method will use the Dijkstra's Algorithm to calculate the expression
     * the method also will check if the string is rightly formatted
     * @param s is the string of the expression that we will calculate
     * @return is the value in double of the string given expression
     */

    public static Double evaluate(String s)
    {

        String[] sNiz=s.split(" ");

        Exceptionss.exceptionsArray(sNiz);


        for(String q:sNiz)
        {

            if(q.equals("(")){}
            else if(q.equals("+"))operators.push(q);
            else if(q.equals("-"))operators.push(q);
            else if(q.equals("/"))operators.push(q);
            else if(q.equals("*"))operators.push(q);
            else if(q.equals("sqrt")){operators.push(q);}
            else if(q.equals(")")) {
                String op=operators.pop();
                double v=operands.pop();
                if(op.equals("+")) v= operands.pop()+v;
                else if(op.equals("-")) v= operands.pop()-v;
                else if(op.equals("*")) v= operands.pop()*v;
                else if(op.equals("/")) v= operands.pop()/v;
                else if(op.equals("sqrt")) v= Math.sqrt(v);
                operands.push(v);
            }
            else operands.push(Double.parseDouble(q));

        }

        return operands.pop();
    }



}

