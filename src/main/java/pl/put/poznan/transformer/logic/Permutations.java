package pl.put.poznan.transformer.logic;

import java.util.Collections;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Permutations extends TextTransformer {

    private final TextTransformer trans;
    public Permutations(TextTransformer trans) {
        this.trans = trans;
    }

    @Override
    public String transform() {

        StringBuilder result = new StringBuilder();
        StringBuilder pom = new StringBuilder();
        ArrayList<Integer> Lista = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(this.trans.transform());

        while (st.hasMoreTokens()) {
            pom = new StringBuilder();
            String wyraz = st.nextToken().toString();

            for (int i = 0; i < wyraz.length(); i++) {
                Lista.add(i);
            }

            Collections.shuffle(Lista);
            for (int j = 0; j < wyraz.length(); j++) {
                pom.append(wyraz.charAt(Lista.get(j)));
            }

            result.append(pom).append(" ");
            Lista.clear();
        }
        return result.toString();
    }
}

