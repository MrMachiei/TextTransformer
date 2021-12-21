package pl.put.poznan.transformer.rest;

public class Request {
    private final String text;
    private  final String[] params;

    public Request(String text, String[] params){
        this.text = text;
        this.params = params;
    }

    public String getText(){
        return this.text;
    }

    public String[] getParams(){
        return this.params;
    }

}
