package pl.put.poznan.transformer.logic;

public class Inverse {
    private final String[] text;

    public Inverse(String[] text){
        this.text = text;
    }

    public String[] transform()
    {

    String reversed;
    for(int i = 0; i < this.text.length; i++)
    {
      Boolean[] upper = new Boolean[this.text[i].length()];
      
      for(int j = 0; j < this.text[i].length(); j++)
      {
        if(this.text[i].charAt(j) > 'A' && this.text[i].charAt(j) < 'Z'){
        	upper[j] = true;
        }
        else{
        	upper[j] = false;
        }
      }

      reversed = "";
      for(int j = 0; j < this.text[i].length(); j++)
      {
        if(!upper[j]){
        	reversed += Character.toString(this.text[i].charAt(this.text[i].length()-j-1)).toLowerCase();
        }
        else{
        	reversed += Character.toString(this.text[i].charAt(this.text[i].length()-j-1)).toUpperCase();

        }
      }
        return this.text;
    }
}
