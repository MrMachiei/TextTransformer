package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SignsInLatexTest {

    @Test
    void transform() {
        TextTransformer mock = mock(TextTransformer.class);
        when(mock.transform()).thenReturn("Test znaków takich { i tkich $ oraz \\");
        SignsInLatex trans = new SignsInLatex(mock);
        assertEquals("Test znaków takich \\{ i tkich \\$ oraz \\backslash", trans.transform());
    }
}