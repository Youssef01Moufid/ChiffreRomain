package ArabicRomanNumerals;

public class ArabicRomanNumerals {

     static int[] NumberArabic = {10,5,4,1};
     static String[] chiffreRomain = {"X","V","IV","I"};


    public static String convert(int i) {
       String romain = "" ;

       for(int j = 0; j < NumberArabic.length; j++){
           while ( i >= NumberArabic[j]){
               romain += chiffreRomain[j];
               i -= NumberArabic[j];
           }

       }
       return romain;
    }
}
