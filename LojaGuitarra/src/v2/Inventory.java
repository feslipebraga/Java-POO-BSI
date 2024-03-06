package v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

	public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
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

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            if (searchSpec.getBuilder() != guitarSpec.getBuilder()) {
                continue;
            }
            
            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase()))) {
                continue;
            }
            
            if (searchSpec.getType() != guitarSpec.getType()) {
                continue;
            }
            
            if (searchSpec.getBackWood() != guitarSpec.getBackWood()) {
                continue; 
            }
            
            if (searchSpec.getTopWood() != guitarSpec.getTopWood()) {
                continue;
            }
            
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}