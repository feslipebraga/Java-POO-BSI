package ressacas;

public abstract class Bebidas {
    
    String description = "Bebida desconhecida";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}