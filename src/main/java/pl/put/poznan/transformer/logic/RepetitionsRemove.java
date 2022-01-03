package pl.put.poznan.transformer.logic;
import java.util.StringTokenizer;

public class RepetitionsRemove {
    private final String text;

    public RepetitionsRemove(String text){
        this.text = text;
    }

    public String transform()
    {
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(this.text);

        String last = "";
        String current = "";

        while(st.hasMoreTokens()){
            current = st.nextToken();
            if(! current.equals(last)){
                out.append(current).append(" ");
                last = current;
            }
        }

        return out.toString();
    }
}

