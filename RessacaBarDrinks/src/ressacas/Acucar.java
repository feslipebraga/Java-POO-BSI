package ressacas;

public class Acucar extends CondimentDecorator{
    Bebidas bebida;

	public Acucar(Bebidas drink) {
		this.bebida = drink;
	}

	@Override
	public String getDescription() {
		return bebida.getDescription() + ", Açúcar";
	}

	@Override
	public double cost() {
		return 0.50 + bebida.cost();
	}
}