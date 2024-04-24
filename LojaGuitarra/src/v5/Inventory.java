package v5;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;

	public Inventory() {
		inventory = new ArrayList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
    	Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
    	
        for (Instrument instrument : inventory) {
        	
        	if (instrument.getserialNumber().equals(serialNumber)) {
        		return instrument;
            }
        }
        
        return null;
    }

    public List<Instrument> search(InstrumentSpec searchSpec) {
    	
        List<Instrument> matchingGuitars = new ArrayList<Instrument>();
        
        for (Instrument instrument : inventory) {
        	if (instrument instanceof Instrument) {
        		
        		Instrument guitar = (Instrument) instrument;

        		if (guitar.getSpec().matches(searchSpec)) {
        			
        			matchingGuitars.add(guitar);
        		}
            }
        }
        
        return matchingGuitars;
    }
    
}