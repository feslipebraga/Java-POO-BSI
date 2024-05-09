package ressacas;

public class Caipirinha extends Bebidas {

	public Caipirinha() {
		description = "Caipirinha, Cachaca, Limao, Gelo, Acucar";
	}
	
	@Override
	public double cost() {
		return 20.00;
	}
}