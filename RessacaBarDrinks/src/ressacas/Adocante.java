package ressacas;

public class Adocante extends CondimentDecorator{
    Bebidas bebida;

	public Adocante(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Adoçante";
	}

	@Override
	public double cost() {
		return 0.40 + bebida.cost();
	}
}