package pl.put.poznan.transformer.logic;

public class SignsInLatex extends TextTransformer{
    private final TextTransformer trans;

    public SignsInLatex(TextTransformer trans){
        this.trans = trans;
    }

    public String transform()
    {
        String[] signs = {"\\$", "&", "#", "%", "\\{", "}", "_"};

            String result = trans.transform().replaceAll("\\\\","\\\\backslash");

            for (int j = 0; j < signs.length; j++) {
                result = result.replaceAll(signs[j], "\\\\" + signs[j]);
            }
        return result;
    }
}
