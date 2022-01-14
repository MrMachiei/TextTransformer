package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UpperCaseTest {

    @Test
    void transform() {
        TextTransformer mock = mock(TextTransformer.class);
        when(mock.transform()).thenReturn("ala ma kota a kot ma ale 88");
        UpperCase trans = new UpperCase(mock);
        assertEquals("ALA MA KOTA A KOT MA ALE 88", trans.transform());
    }
}