package pl.put.poznan.transformer.logic;

public class LowerCase {
    private final String[] text;

    public LowerCase(String[] text){
        this.text = text;
    }

    public String[] transform()
    {
        for(int i = 0; i < this.text.length; i++)
        {
            this.text[i] = this.text[i].toLowerCase();
        }
        return this.text;
    }
}
