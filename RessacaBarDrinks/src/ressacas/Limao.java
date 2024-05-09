package ressacas;

public class Limao extends CondimentDecorator{
    Bebidas bebida;

	public Limao(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Limao";
	}

	@Override
	public double cost() {
		return 0.20 + bebida.cost();
	}
}