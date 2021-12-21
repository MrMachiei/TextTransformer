package pl.put.poznan.transformer.logic;

public class SignsInLatex {
    private final String text;

    public SignsInLatex(String text){
        this.text = text;
    }

    public String transform()
    {
        String[] signs = {"\\$", "&", "#", "%", "\\{", "}", "_"};


            String result = this.text.replaceAll("\\\\","\\\\backslash");

            for (int j = 0; j < signs.length; j++) {
                result = result.replaceAll(signs[j], "\\\\" + signs[j]);
            }
        return result;
    }
}
