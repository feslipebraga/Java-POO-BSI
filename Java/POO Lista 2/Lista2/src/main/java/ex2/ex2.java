package ex2;
public class ex2 {
     public static void main(String[] args) {
        Ingresso ing = new Ingresso(50);
        ing.ImprimeValor();
        VIP vip = new VIP(20, 50);
        vip.valorVIP();
        Normal normal = new Normal(50);
        normal.ingressoNormal();
        CamaroteInferior ci = new CamaroteInferior("A1", 30, 50);
        ci.imprimeLocalizacao();
        CamaroteSuperior cs = new CamaroteSuperior(20, 30, 50);
        cs.valorCS();
     }
}
