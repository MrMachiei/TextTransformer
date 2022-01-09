package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class CollapseToShortcutsTest {

    @Test
    void transform() {
       TextTransformer mock = mock(TextTransformer.class);
       when(mock.transform()).thenReturn("MAgiSter Inżynier dOktor powiedzial.");
       CollapseToShortcuts trans = new CollapseToShortcuts(mock);
       assertEquals("MGr Inż. dR powiedzial.", trans.transform());
    }
}