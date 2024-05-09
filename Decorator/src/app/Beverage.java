package app;

public abstract class Beverage {
	String description = "Bebida desconhecida";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}