package ressacas;

public class Caipira extends Bebidas {

    public Caipira(){
        description = "Caipira";
    }

    @Override
    public double cost() {
        return 20.00;
    }
}