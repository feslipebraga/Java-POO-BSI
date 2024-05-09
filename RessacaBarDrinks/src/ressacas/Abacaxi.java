package ressacas;

public class Abacaxi extends CondimentDecorator{
    Bebidas bebida;

	public Abacaxi(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Abacaxi";
	}

	@Override
	public double cost() {
		return 1.50 + bebida.cost();
	}
}