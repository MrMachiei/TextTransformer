package pl.put.poznan.transformer.logic;

import org.w3c.dom.Text;
import pl.put.poznan.transformer.logic.UpperCase;

import java.util.Objects;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {
    private String text;

    public TextTransformer(String text){
        this.text = text;
    }

    public TextTransformer(){}

    public String transform(){
        return text;
    }
}
