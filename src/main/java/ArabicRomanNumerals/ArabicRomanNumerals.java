package ArabicRomanNumerals;

public class ArabicRomanNumerals {

     static int[] NumberArabic = {50,10,9,5,4,1};
     static String[] chiffreRomain = {"L","X","IX","V","IV","I"};


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
