package Tests;


public class PeriodTableRun {
    
   public static void main(String[] args){
       String pSymbol = "Zr";
       String pElement = "Slimyrine";
       
       System.out.println("For Element Name: " + pElement + ",  Symbol: " + pSymbol);
       System.out.println("   Symbol  is valid     : " + PeriodTable.isSymbolValid( pSymbol,  pElement));
       System.out.println("   # of possible symbols: " + PeriodTable.getSymbolCount(pElement));
       System.out.println("   1st valid symbol     : " + PeriodTable.getFirstSymbol(pElement));
   } 
    
}
