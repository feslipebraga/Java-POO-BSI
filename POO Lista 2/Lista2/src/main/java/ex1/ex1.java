package ex1;
public class ex1 {
    public static void main(String[] args) {
        Empregado e = new Empregado(1, "Matheus", "matheuz.fuzi", 2000);
        Chefe c = new Chefe(100, 2, "Luiz", "luiz.biedacha", 3000);
        Estagiario est = new Estagiario(10, 3, "Felipe", "feslipebraga", 1000);
       
        
        System.out.println(est.toString());
        System.out.println(c.toString());
        System.out.println(e.toString());
        
        est.aumentoSalarial(10);
        c.aumentoSalarial(10);
        e.aumentoSalarial(10);
        
        System.out.println("================================================================");
        
        System.out.println(est.toString());
        System.out.println(c.toString());
        System.out.println(e.toString());
    }
}