package pl.put.poznan.transformer.logic;

import java.rmi.NoSuchObjectException;

/**
 * Klasa jest odpowiedzialna za funkjonalnosc zamiany wszystkich liter tekstu na male
 * klasa posiada - text, przechowujacy transformowana informacje
 *
 * @author Karol Zawislak
 * @version 2.2
 */


public class LowerCase {
    private final String text;

    /**
     * Konstruktor klasy
     *
     * @param text transformowany tekst
     */

    public LowerCase(String text){
        this.text = text;
    }

    /**
     * metoda odpowiedzialna za transformacje obiektu
     *
     * @return tekst po zamianie lister na male
     */

    public String transform()
    {
        return this.text.toLowerCase();
    }
}
