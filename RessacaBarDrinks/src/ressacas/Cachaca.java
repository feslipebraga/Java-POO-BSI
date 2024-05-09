package ressacas;

public class Cachaca extends CondimentDecorator{
    Bebidas bebida;

	public Cachaca(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Cachaca";
	}

	@Override
	public double cost() {
		return 0.20 + bebida.cost();
	}
}