package v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if (searchGuitar.getBuilder() != guitar.getBuilder()) {
                continue;
            }

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))) {
                continue;
            }

            if (searchGuitar.getType() != guitar.getType()) {
                continue;
            }

            if (searchGuitar.getBackWood() != guitar.getBackWood()) {
                continue; 
            }

            if (searchGuitar.getTopWood() != guitar.getTopWood()) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}