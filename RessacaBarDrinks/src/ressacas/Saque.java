package ressacas;

public class Saque extends CondimentDecorator{
    Bebidas bebida;

	public Saque(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Saque";
	}

	@Override
	public double cost() {
		return 2.00 + bebida.cost();
	}
}