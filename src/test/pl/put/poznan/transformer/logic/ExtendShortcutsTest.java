package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ExtendShortcutsTest {

    @Test
    void transform() {
        TextTransformer mock = mock(TextTransformer.class);
        when(mock.transform()).thenReturn("MGr Inż. dR powiedzial.");
        ExtendShortcuts trans = new ExtendShortcuts(mock);
        assertEquals("MAgister Inżynier dOktor powiedzial.", trans.transform());
    }
}