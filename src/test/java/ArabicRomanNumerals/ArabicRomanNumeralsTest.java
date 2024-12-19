package ArabicRomanNumerals;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {

  @Test
    public void testArabicRomanNumerals1() {
      //GIVEN
      ArabicRomanNumerals romanNumerals = new ArabicRomanNumerals();

      //WHEN
      String result = romanNumerals.convert(1) ;

      //THEN

      assertThat(result).isEqualTo("I");
  }

  @Test
  public void testArabicRomanNumerals2() {
    //GIVEN
    ArabicRomanNumerals romanNumerals = new ArabicRomanNumerals();

    //WHEN
    String result = romanNumerals.convert(2) ;

    //THEN

    assertThat(result).isEqualTo("II");
  }

  @Test
  public void testArabicRomanNumerals3() {
    //GIVEN
    ArabicRomanNumerals romanNumerals = new ArabicRomanNumerals();

    //WHEN
    String result = romanNumerals.convert(3) ;

    //THEN

    assertThat(result).isEqualTo("III");
  }




}
