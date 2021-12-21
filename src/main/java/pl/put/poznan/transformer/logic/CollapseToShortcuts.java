package pl.put.poznan.transformer.logic;

import java.rmi.NoSuchObjectException;
import java.util.HashMap;
import java.util.Map;

/**
 * klasa odpowiedzialna za zwijanie predefiniowanych skrótów z zachowaniem wielkośći liter
 * klasa ta posiada dwa atrybuty - text, przechowujący transformowaną informację oraz mapę rozwinięć i ich skrótów
 *
 * @author Maciej Walczykowski
 * @version 2.1
 */


public class CollapseToShortcuts {
    private final String text;
    private final Map<String, String> shortcuts;

    /**
     * Konstruktor klasy
     *
     * @param text transformowany tekst
     */

    public CollapseToShortcuts(String text){
        this.text = text;
        this.shortcuts = new HashMap<>();
        genMap();
    }

    /**
     * metoda odpowiedzialna za transformację obiektu
     *
     * @return tekst po zwinięciu do skrótu
     * @throws NoSuchObjectException kiedy tekst nie zostaje odnaleziony w mapie
     */

    public String transform() throws NoSuchObjectException
    {
        //Transformer logic here
        String result;
        String t = text;
        Boolean[] cap = getCapitals(t);
        String temp = t.toLowerCase();

        if(shortcuts.containsKey(temp)) temp = shortcuts.get(temp);
        else throw new NoSuchObjectException("Nie ma takiego skrótu.");

        char[] res = temp.toCharArray();
        for(int i = 0; i < temp.length(); i++){
            if(cap[i]) res[i] -= 'a' - 'A';
        }
        result = String.valueOf(res);
        return result;
    }

    private Boolean[] getCapitals(String text){
        Boolean[] capitals = new Boolean[text.length()];
        for(int i = 0; i < text.length(); i++){
            capitals[i] = text.charAt(i) <= 'Z' && text.charAt(i) >= 'A';
        }
        return capitals;
    }

    private void genMap(){
        shortcuts.put("doktor", "dr");
        shortcuts.put("profesor", "prof.");
        shortcuts.put("inżynier","inż.");
        shortcuts.put("magister", "mgr");
    }
}
