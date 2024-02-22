package ex3;

public class ex3 {
    public static void main (String[] args){
        Administrativo adm1 = new Administrativo(12345, "João Silva", "Rua A, 123", 987654321, "joao@example.com", "Noturno", 100.00f);
        Administrativo adm2 = new Administrativo(54323, "Ana Silva", "Praça X, 123", 987987654, "ana@example.com", "Diurno", 800.00f);
        Tecnico tec1 = new Tecnico(54321, "Maria Oliveira", "Av. B, 456", 987654324, "maria@example.com", 500.00f);
        Tecnico tec2 = new Tecnico(98765, "João Rodrigues", "Rua D, 789", 987123123, "joao@example.com", 300.00f);
        
        System.out.println(adm1.getNome() + " possui a matrícula: " + adm1.getMatricula());
        System.out.println(adm2.getNome() + " possui a matrícula: " + adm2.getMatricula());
        System.out.println(tec1.getNome() + " possui a matrícula: " + tec1.getMatricula());
        System.out.println(tec2.getNome() + " possui a matrícula: " + tec2.getMatricula());
    }
}