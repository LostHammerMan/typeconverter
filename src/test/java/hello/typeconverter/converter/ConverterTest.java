package hello.typeconverter.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    void stringToInteger(){
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void IntegerToString(){
        IntegerToString convert = new IntegerToString();
        String result = convert.convert(20);
        Assertions.assertThat(result).isEqualTo("20");
    }
}
