package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RepetitionRemoveTest {

    @Test
    void transform() {
        TextTransformer mock = mock(TextTransformer.class);
        when(mock.transform()).thenReturn("Jak to to prawda to nie nie wiem.");
        RepetitionsRemove trans = new RepetitionsRemove(mock);
        assertEquals("Jak to prawda to nie wiem.", trans.transform());
    }
}