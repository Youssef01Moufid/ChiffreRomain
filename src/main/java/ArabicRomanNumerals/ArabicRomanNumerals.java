package ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public static String convert(int i) {
       String romain = "" ;

       if(i == 10)
           return  "X";

       while (i-- > 0) {
           romain += "I";
       }
       return romain;
    }
}
