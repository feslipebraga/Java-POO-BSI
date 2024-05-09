package ressacas;

public class Pedido {
	public static void main(String[] args) {

		Bebidas caipirinha = new Caipirinha();
		System.out.printf(caipirinha.getDescription() + " R$%.2f %n", caipirinha.cost());

		Bebidas caipira1 = new Caipira();
		caipira1 = new Saque(caipira1);
		caipira1 = new Abacaxi(caipira1);
		caipira1 = new Kiwi(caipira1);
		caipira1 = new Acucar(caipira1);
		System.out.printf(caipira1.getDescription() + " R$%.2f %n", caipira1.cost());
		
		Bebidas caipira2 = new Caipira();
		caipira2 = new Vodka(caipira2);
		caipira2 = new Morango(caipira2);
		caipira2 = new Adocante(caipira2);
		System.out.printf(caipira2.getDescription() + " R$%.2f %n", caipira2.cost());
	}
}
