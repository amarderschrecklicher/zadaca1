package ba.unsa.etf.rpr;

public class Exceptionss {


    public static boolean exceptionsString(String s) {
        if (s.length() == 0) throw new RuntimeException("Empty array");

        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) != ' ') {
                throw new RuntimeException("Invalid input");
            }
        }
        return true;
    }


    public static boolean exceptionsArray(String[] sNiz) {

        if (sNiz.length % 2 == 0 || sNiz.length > 5 && (!sNiz[0].equals("(") || !sNiz[sNiz.length - 1].equals(")")))
            throw new RuntimeException("Invalid input2");
        else {
            for (String q : sNiz) {
                if (q.charAt(0) == '0' || q.charAt(0) == '1' || q.charAt(0) == '2' || q.charAt(0) == '3' || q.charAt(0) == '4' || q.charAt(0) == '5' || q.charAt(0) == '6'
                        || q.charAt(0) == '7' || q.charAt(0) == '8' || q.charAt(0) == '9') {
                    for (int i = 0; i < q.length(); i++) {
                        if (q.charAt(i) != '0' && q.charAt(i) != '1' && q.charAt(i) != '2' && q.charAt(i) != '3' && q.charAt(i) != '4' && q.charAt(i) != '5' &&
                                q.charAt(i) != '6' && q.charAt(i) != '7' && q.charAt(i) != '8' && q.charAt(i) != '9' && q.charAt(i) != '.')
                            throw new RuntimeException("Invalid input3");

                    }

                } else if (!q.equals("(") && !q.equals(")") && !q.equals("+") && !q.equals("-") && !q.equals("*") && !q.equals("/") && !q.equals("sqrt"))
                    throw new RuntimeException("Invalid input4");
            }


            return true;
        }


    }
}