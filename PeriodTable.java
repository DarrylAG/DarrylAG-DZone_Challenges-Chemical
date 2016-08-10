package Tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class PeriodTable {

    // ---------------------------------------------------------------------------------- //
    private static Boolean isSymbolTwoChar(String pSymbol) {
        return (pSymbol.length() == 2);
    }

    // ---------------------------------------------------------------------------------- //
    private static Boolean isSymbolRightCase(String pSymbol) {
        return ((Character.isUpperCase(pSymbol.charAt(0)) && Character.isLowerCase(pSymbol.charAt(1))));
    }

    // ---------------------------------------------------------------------------------- //
    private static Boolean isSymbolInElement(String pSymbol, String pElement) {
        String lStringPattern;
        
        lStringPattern = pSymbol.charAt(0) + "*" + pSymbol.charAt(1);
        Pattern pattern = Pattern.compile(lStringPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(pElement);

        return (matcher.find());
    }

    // ---------------------------------------------------------------------------------- //
    private static Set<String> getPossibleSymbol(String pElement) {
        Set<String> symbolset = new TreeSet<>();
        for (int i = 0; i < pElement.length() - 1; i++) {
            for (int j = i + 1; j < pElement.length(); j++) {
                symbolset.add(Character.toUpperCase(pElement.charAt(i)) + "" + Character.toLowerCase(pElement.charAt(j)));
            }
        }
        return symbolset;
    }

    // ---------------------------------------------------------------------------------- //
    public static Boolean isSymbolValid(String pSymbol, String pElement) {

        return (isSymbolTwoChar(pSymbol) && isSymbolRightCase(pSymbol) && isSymbolInElement(pSymbol, pElement));
    }

    // ---------------------------------------------------------------------------------- //
    public static int getSymbolCount(String pElement) {
        Set<String> symbolList = getPossibleSymbol(pElement);
        return symbolList.size();
    }

    // ---------------------------------------------------------------------------------- //
    public static String getFirstSymbol(String pElement) {
        Set<String> symbolList = getPossibleSymbol(pElement);
        String firstElement = "";

        if (symbolList.size() > 0) {
            firstElement = "" + symbolList.toArray()[0];
        }
        return firstElement;
    }

}
