package br.com.mariojp.solid.isp;

public class SimplePrinter implements Print {
	
    @Override 
    public void print(String content){
    	System.out.print("Imprimindo: " + content);
    } 

}
