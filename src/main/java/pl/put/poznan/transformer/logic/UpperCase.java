package pl.put.poznan.transformer.logic;

public class UpperCase {
    private final String text;

    public UpperCase(String text){
        this.text = text;
    }

    public String transform()
    {
        return this.text.toUpperCase();
    }
}
