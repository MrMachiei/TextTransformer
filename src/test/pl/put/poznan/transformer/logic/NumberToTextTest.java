package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NumberToTextTest {

    @Test
    void transform() {
        TextTransformer mock = mock(TextTransformer.class);
        when(mock.transform()).thenReturn("start 2137 420 000srodek1000 :)999999 koniec");
        NumberToText test = new NumberToText(mock);
        assertEquals("start dwa tysiace sto trzydziesci siedem czterysta dwadziescia zerosrodektysiac :)dziewiecset dziewiecdziesiat dziewiec tysiecy dziewiecset dziewiecdziesiat dziewiec koniec", test.transform());
    }
}