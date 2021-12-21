package pl.put.poznan.transformer.logic;

public class Capitalize {
    private final String text;

    public Capitalize(String text){
        this.text = text;
    }

    public String transform()
    {
            String result = this.text.substring(0, 1).toUpperCase() + this.text.substring(1);
        return result;
    }
}
