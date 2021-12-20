package pl.put.poznan.transformer.logic;

public class Inverse {
    private String text;

    public Inverse(String text){
        this.text = text;
    }

    public String transform() {

        String reversed;

        Boolean[] upper = new Boolean[this.text.length()];

        for (int j = 0; j < this.text.length(); j++) {
            upper[j] = this.text.charAt(j) > 'A' && this.text.charAt(j) < 'Z';
        }

        reversed = "";
        for (int j = 0; j < this.text.length(); j++) {
            if (!upper[j]) {
                reversed += Character.toString(this.text.charAt(this.text.length() - j - 1)).toLowerCase();
            } else {
                reversed += Character.toString(this.text.charAt(this.text.length() - j - 1)).toUpperCase();
            }
        }
        this.text = reversed;
        return this.text;
    }
}
