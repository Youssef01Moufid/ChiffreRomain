package ArabicRomanNumerals;

public class ArabicRomanNumerals {

    public static String convert(int i) {

       String romain = "" ;
       while (i-- > 0) {
           romain += "I";
       }
       return romain;
    }
}
