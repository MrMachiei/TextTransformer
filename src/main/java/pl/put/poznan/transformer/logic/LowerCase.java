package pl.put.poznan.transformer.logic;

import java.rmi.NoSuchObjectException;

/**
 * Klasa jest odpowiedzialna za funkjonalnosc zamiany wszystkich liter tekstu na male
 * klasa posiada - text, przechowujacy transformowana informacje
 *
 * @author Karol Zawislak
 * @version 2.2
 */


public class LowerCase extends TextTransformer{
    private final TextTransformer trans;

    /**
     * Konstruktor klasy
     *
     * @param trans - nadrzedny dekorator
     */

    public LowerCase(TextTransformer trans){
        this.trans = trans;
    }

    /**
     * metoda odpowiedzialna za transformacje obiektu
     *
     * @return tekst po zamianie lister na male
     */
    @Override
    public String transform()
    {
        return trans.transform().toLowerCase();
    }
}
