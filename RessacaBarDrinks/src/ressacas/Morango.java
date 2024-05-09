package ressacas;

public class Morango extends CondimentDecorator{
    Bebidas bebida;

	public Morango(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Morango";
	}

	@Override
	public double cost() {
		return 1.00 + bebida.cost();
	}
}