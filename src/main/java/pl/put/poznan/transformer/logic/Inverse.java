package pl.put.poznan.transformer.logic;

public class Inverse {
    private final String[] text;

    public Inverse(String[] text){
        this.text = text;
    }

    public String[] transform()
    {

        String tail;
        for(int i = 0; i < this.text.length; i++)
        {
            tail = "";
            for(int j = 0; j < this.text[i].length(); j++)
            {
                tail += this.text[i].charAt(this.text[i].length()-j);
            }
            this.text[i] = this.text[i].charAt(0) + tail;
        }
        return this.text;
    }
}
