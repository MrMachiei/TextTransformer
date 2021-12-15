package pl.put.poznan.transformer.logic;

public class Capitalize {
    private final String[] text;

    public Capitalize(String[] text){
        this.text = text;
    }

    public String[] transform()
    {
        for(int i = 0; i < this.text.length; i++)
        {
            this.text[i] = this.text[i].substring(0, 1).toUpperCase() + this.text[i].substring(1);
        }
        return this.text;
    }
}
