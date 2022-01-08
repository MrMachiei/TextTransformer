package pl.put.poznan.transformer.logic;
import java.util.StringTokenizer;

public class RepetitionsRemove extends TextTransformer{
    private final TextTransformer trans;

    public RepetitionsRemove(TextTransformer trans){
        this.trans = trans;
    }

    @Override
    public String transform()
    {
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(this.trans.transform());

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

