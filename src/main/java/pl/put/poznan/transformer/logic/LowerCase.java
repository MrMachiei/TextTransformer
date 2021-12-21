package pl.put.poznan.transformer.logic;

public class LowerCase {
    private final String text;

    public LowerCase(String text){
        this.text = text;
    }

    public String transform()
    {
        return this.text.toLowerCase();
    }
}
