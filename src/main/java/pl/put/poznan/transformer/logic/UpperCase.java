package pl.put.poznan.transformer.logic;

public class UpperCase {
    private final String[] text;

    public UpperCase(String[] text){
        this.text = text;
    }

    public String[] transform()
    {
        for(int i = 0; i < this.text.length; i++)
        {
            this.text[i] = this.text[i].toUpperCase();
        }
        return this.text;
    }
}
