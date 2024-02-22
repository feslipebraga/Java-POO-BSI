package ex5;

public class Pobre extends Pessoa {

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }
    
    public void trabalha(){
        System.out.println(this.getNome() + " está trabalhando... 🔨");
    }
}
