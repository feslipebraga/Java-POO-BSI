package ressacas;

public class Vodka extends CondimentDecorator{
    Bebidas bebida;

	public Vodka(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Vodka";
	}

	@Override
	public double cost() {
		return 2.50 + bebida.cost();
	}
}