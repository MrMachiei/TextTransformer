package pl.put.poznan.transformer.logic;

import java.rmi.NoSuchObjectException;
import java.util.HashMap;
import java.util.Map;

public class ExtendShortcuts {
    private final String[] text;
    private Map<String, String> shortcuts;

    public ExtendShortcuts(String[] text){
        this.text = text;
        this.shortcuts = new HashMap<>();
        genMap();
    }

    public String[] transform() throws NoSuchObjectException
    {
        //Transformer logic here
        String[] result = new String[text.length];
        for(int k = 0; k < text.length; k++){
            String t = text[k];
            Boolean[] cap = getCapitals(t);
            String temp = t.toLowerCase();

            if(shortcuts.containsKey(temp)) temp = shortcuts.get(temp);
            else throw new NoSuchObjectException("Nie ma takiego skrótu.");

            char[] res = t.toCharArray();
            for(int i = 0; i < cap.length; i++){
                if(cap[i]) res[i] -= 'a' - 'A';
            }
            result[k] = String.valueOf(res);
        }
        return result;
    }

    private Boolean[] getCapitals(String text){
        Boolean[] capitals = new Boolean[text.length()];
        for(int i = 0; i < text.length(); i++){
            capitals[i] = text.charAt(i) >= 'a';
        }
        return capitals;
    }

    private void genMap(){
        shortcuts.put("dr", "doktor");
        shortcuts.put("prof.", "profesor");
        shortcuts.put("inż.", "inżynier");
        shortcuts.put("mgr", "magister");
    }
}
