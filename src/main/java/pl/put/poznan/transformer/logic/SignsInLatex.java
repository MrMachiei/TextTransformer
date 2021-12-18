package pl.put.poznan.transformer.logic;

public class SignsInLatex {
    private final String[] text;

    public SignsInLatex(String[] text){
        this.text = text;
    }

    public String[] transform()
    {
        String[] signs = {"\\$", "&", "#", "%", "\\{", "\\}"};

        for (int i = 0; i < this.text.length; i++) {

            this.text[i] = this.text[i].replaceAll("\\\\","\\\\backslash");

            for (int j = 0; j < signs.length; j++) {
                this.text[i] = this.text[i].replaceAll(signs[i], "\\\\" + signs[i]);
            }
        }
        return this.text;
    }
}
