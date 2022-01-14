package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InverseTest {

    @Test
    void transform() {
        TextTransformer mock = mock(TextTransformer.class);
        when(mock.transform()).thenReturn("ala Ma kota a kot ma ale 88");
        Inverse trans = new Inverse(mock);
        assertEquals("88 eLa am tok a atok am ala", trans.transform());
    }
}