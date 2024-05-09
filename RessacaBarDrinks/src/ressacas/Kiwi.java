package ressacas;

public class Kiwi extends CondimentDecorator{
    Bebidas bebida;

	public Kiwi(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Kiwi";
	}

	@Override
	public double cost() {
		return 1.00 + bebida.cost();
	}
}