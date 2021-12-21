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
            if(Objects.equals(transformation, "upperCase")){
                UpperCase upperCase = new UpperCase(text);
                text = upperCase.transform();
            }
            else if(Objects.equals(transformation, "lowerCase")){
                LowerCase lowerCase = new LowerCase(text);
                text = lowerCase.transform();
            }
            else if(Objects.equals(transformation, "inverse")){
                Inverse inverse = new Inverse(text);
                text = inverse.transform();
            }
            else if(Objects.equals(transformation, "capitalize")){
                Capitalize capitalize = new Capitalize(text);
                text = capitalize.transform();
            }
            else if(Objects.equals(transformation, "signsInLatex")){
                SignsInLatex signsInLatex = new SignsInLatex(text);
                text = signsInLatex.transform();
            }
            else if(Objects.equals(transformation, "collapseToShortcuts")){
                CollapseToShortcuts collapseToShortcuts = new CollapseToShortcuts(text);
                try {
                    text =  collapseToShortcuts.transform();
                } catch( Throwable ex){
                    return "NULL";
                }
            }
            else if(Objects.equals(transformation, "extendShortcuts")){
                ExtendShortcuts extendShortcuts = new ExtendShortcuts(text);
                try {
                    text =  extendShortcuts.transform();
                } catch( Throwable ex){
                    return "NULL";
                }
            }
            else if(Objects.equals(transformation, "numberToText")){
                NumberToText numberToText = new NumberToText(text);
                text = numberToText.transform();
            }
            else if(Objects.equals(transformation, "textToNumber")){
                TextToNumber textToNumber = new TextToNumber(text);
                text = textToNumber.transform();
            }
        }
        return text;
    }
}
