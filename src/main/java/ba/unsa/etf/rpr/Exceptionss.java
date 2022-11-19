package ba.unsa.etf.rpr;

public class Exceptionss {



    public static boolean exceptionsArray(String[] sNiz) {

        if (sNiz.length > 5 && (!sNiz[0].equals("(") || !sNiz[sNiz.length - 1].equals(")")))
            throw new RuntimeException("Invalid input2");

            for (String q : sNiz) {
                if (q.charAt(0) >='0' &&  q.charAt(0) <= '9') {
                    for (int i = 0; i < q.length(); i++) {
                        if (q.charAt(i) != '0' && q.charAt(i) != '1' && q.charAt(i) != '2' && q.charAt(i) != '3' && q.charAt(i) != '4' && q.charAt(i) != '5' &&
                                q.charAt(i) != '6' && q.charAt(i) != '7' && q.charAt(i) != '8' && q.charAt(i) != '9' && q.charAt(i) != '.')
                            throw new RuntimeException("Invalid input3");
                    }

                }
                else if (!q.equals("(") && !q.equals(")") && !q.equals("+") && !q.equals("-") && !q.equals("*") && !q.equals("/") && !q.equals("sqrt"))
                    throw new RuntimeException("Invalid input4");
            }

            for(int i=0;i<sNiz.length;i++) {
                if (i + 3 < sNiz.length && sNiz[i].equals("sqrt")) {
                    if (!sNiz[i + 1].equals("(") || sNiz[i + 2].charAt(0) < 48 || sNiz[i + 2].charAt(0) > 57 || !sNiz[i + 3].equals(")")) {
                        throw new RuntimeException("Invalid input5");
                    }

                }
                else if (i + 3 >= sNiz.length && sNiz[i].equals("sqrt"))throw new RuntimeException("Invalid input5");
            }


              return true;
    }
}