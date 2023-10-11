package ex4;

public class Animal {
    private String nome;
    private String raca;
    
    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void caminha(){
        System.out.println(this.getNome() + " está caminhando 🐾");
    }
}