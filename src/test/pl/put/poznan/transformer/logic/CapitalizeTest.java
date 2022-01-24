package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CapitalizeTest {
    TextTransformer mock = null;
    @BeforeEach
    void  setUp(){
        mock = mock(TextTransformer.class);
    }

    @Test
    void testTransform() {
       when(mock.transform()).thenReturn("ja widziałem, tak wielu trzymało się za ręce");
       Capitalize trans = new Capitalize(mock);
       assertEquals("Ja widziałem, tak wielu trzymało się za ręce", trans.transform());
    }

    @Test
    void testTransform2() {
        when(mock.transform()).thenReturn("Mówią, jeśli się zgodzimy, Ty możesz zostać tu");
        Capitalize trans = new Capitalize(mock);
        assertEquals("Mówią, jeśli się zgodzimy, Ty możesz zostać tu", trans.transform());
    }
    @Test
    void testTransform3() {
        when(mock.transform()).thenReturn("tylko Jeden z nas może tu zostać, to nie Będziesz Ty");
        Capitalize trans = new Capitalize(mock);
        assertEquals("Tylko Jeden z nas może tu zostać, to nie Będziesz Ty", trans.transform());
    }

    @Test
    void testTransform4() {
        when(mock.transform()).thenReturn("A ja nie chcę stąd odchodzić, nie chcę Smucić się");
        Capitalize trans = new Capitalize(mock);
        assertEquals("A ja nie chcę stąd odchodzić, nie chcę Smucić się", trans.transform());
    }
}