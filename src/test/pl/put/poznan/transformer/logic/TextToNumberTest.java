package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TextToNumberTest {

    @Test
    void transform() {
        TextTransformer mock = mock(TextTransformer.class);
        when(mock.transform()).thenReturn("start dwa tysiace sto trzydziesci siedem czterysta dwadziescia i tysiac srodek zero :) dziewiecset dziewiecdziesiat dziewiec tysiecy dziewiecset dziewiecdziesiat dziewiec koniec");
        TextToNumber test = new TextToNumber(mock);
        assertEquals("start 2137 420 i 1000 srodek 0 :) 999999 koniec ", test.transform());
    }
}