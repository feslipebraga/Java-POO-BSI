package ex4;

public class ex4 {
    public static void main(String[] args){
      Cachorro dog = new Cachorro("Scooby", "Grande Danês");
      dog.late();
      
      Gato cat = new Gato("Garfield", "Gato Malhado Americano");
      cat.mia();
      
      dog.caminha();
      cat.caminha();
    }
}
