package ba.unsa.etf.rpr;


/**
 * Entry point to Dijkstra's Algorithm program
 * @author Amar Tahirovic
 * @version 1.0
 */
public class App 
{
    /**
     * Main method in App
     * @param args array of strings ( a + ( b - ( c * ( d / ( sqrt e ) ) ) ) )
     */
    public static void main( String[] args )
    {

        try {

            String izraz = new String();

            for(int i=0;i< args.length;i++) {
                if(i!=args.length-1)
                izraz=(izraz + args[i]+" ");

                else izraz=(izraz + args[i]); }

            double iznos = ExpressionEvaluator.evaluate(izraz);

            System.out.println("Result: "+ iznos);

        }catch (Exception e){
            System.err.println(e.getMessage());}

    }
}
