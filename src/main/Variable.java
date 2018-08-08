package main;

/**
 *
 * @author Gabriel e Antonio
 */
public class Variable{

    private char name;
    private double value;

    public Variable(){

    }

    public Variable(char name, double value){
        this.name  = name;
        this.value = value;
    }

    public void setName(char name){
        this.name = name;
    }
    public char getName(){
        return this.name;
    }

    public void setValue(double value){
        this.value = value;
    }
    public double getValue(){
        return this.value;
    }

}
