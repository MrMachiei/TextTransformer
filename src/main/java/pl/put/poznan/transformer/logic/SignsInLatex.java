package pl.put.poznan.transformer.logic;

/**
 * Klasa jest odpowiedzialna za zapisanie znaków w taki sposób, aby były one kompatybilne z latexem
 *
 * @author Beata Wiśniewska
 * @version 3.4
 */

public class SignsInLatex extends TextTransformer{
    private final TextTransformer trans;

    /**
     * Konstruktor klasy
     *
     * @param trans - nadrzedny dekorator
     */

    public SignsInLatex(TextTransformer trans){
        this.trans = trans;}

    /**
     * metoda odpowiedzialna za zmienienie znaków na wersję odpowiednią w latexie -> dodanie \ przed znaki specjalne
     *
     * @return tekst po zamianie znaków
     */

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
