package pl.put.poznan.transformer.logic;

public class SignsInLatex {

    private String text;

    public SignsInLatex(String text){
        this.text = text;
    }

    public String transform()
    {
        String[] signs = {"\\$", "&", "#", "%", "\\{", "}", "_"};

        this.text = this.text.replaceAll("\\\\","\\\\backslash");

        for(int j = 0; j < signs.length; j++) {
            this.text = this.text.replaceAll(signs[j], "\\\\" + signs[j]);
        }
        return this.text;
    }
}
