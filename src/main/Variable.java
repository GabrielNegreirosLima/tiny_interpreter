package main;

/**
 *
 * @author Gabriel e Antonio
 */
public class Variavel {
    
    private char nome;
    private double valor;
    
    public Variavel(){
    
    }
    
    public Variavel(char nome, double valor){
        this.nome  = nome;
        this.valor = valor;        
    }
    
    public void setNome(char nome){
        this.nome = nome;
    }
    public char getNome(){
        return this.nome;
    }    
    
    public void setValor(double valor){
        this.valor = valor;        
    }
    public double getValor(){
        return this.valor;
    }
    
}
