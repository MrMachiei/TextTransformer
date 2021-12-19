package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.logic.UpperCase;

import java.util.Objects;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {

    private final String[] transforms;

    public TextTransformer(String[] transforms){
        this.transforms = transforms;
    }

    public String transform(String text){
        // of course, normally it would do something based on the transforms

        for(String transformation : this.transforms){
            System.out.println(transformation);
            if(Objects.equals(transformation, "upper")){
                UpperCase upperCase = new UpperCase(text);
                text = upperCase.transform();
            }
            else if(Objects.equals(transformation, "lower")){
                LowerCase lowerCase = new LowerCase(text);
                text = lowerCase.transform();
            }
            else if(Objects.equals(transformation, "inverse")){
                Inverse inverse = new Inverse(text);
                text = inverse.transform();
            }
            else if(Objects.equals(transformation, "latex")){
                SignsInLatex signsInLatex = new SignsInLatex(text);
                text = signsInLatex.transform();
            }
        }
        return text;
    }
}
