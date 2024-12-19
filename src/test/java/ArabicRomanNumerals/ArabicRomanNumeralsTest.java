package ArabicRomanNumerals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {

  private ArabicRomanNumerals romanNumerals;
  @BeforeEach
  public void setUp() {
    romanNumerals = new ArabicRomanNumerals();
  }
  @AfterEach
  public void tearDown() {
    romanNumerals = null;
  }
  @Test
    public void testArabicRomanNumerals1() {
      //GIVEN
      //WHEN
      String result = romanNumerals.convert(1) ;
      //THEN
      assertThat(result).isEqualTo("I");
  }
  @Test
  public void testArabicRomanNumerals2() {
    //GIVEN
    //WHEN
    String result = romanNumerals.convert(2) ;
    //THEN
    assertThat(result).isEqualTo("II");
  }
  @Test
  public void testArabicRomanNumerals3() {
    //GIVEN
    //WHEN
    String result = romanNumerals.convert(3) ;
    //THEN
    assertThat(result).isEqualTo("III");
  }




}
