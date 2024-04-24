package v4;

import java.util.Iterator;
import java.util.List;

public class FindInstrument {
    public static void main(String[] args) {
    	
        Inventory inventory = new Inventory();
        
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        
        MandolinSpec whatPhilLikes = new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Style.A, Wood.ALDER, Wood.ALDER);


        // Encontrando a guitarra do Erin
        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars: ");
            for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = (GuitarSpec) guitar.getSpec();
                System.out.println(" We have a " +
                spec.getBuilder() + " " + spec.getModel() + " " +
                spec.getType() + " guitar:\n   " +
                spec.getBackWood() + " back and sides,\n   " +
                spec.getTopWood() + " top.\n You can have it for only $" + guitar.getPrice() + "!\n ----");
            }
        } else { 
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
        
        // Encontrando o Bandolin do Phil
	    List<Mandolin> matchingMandolins = inventory.search(whatPhilLikes);
	    
	    if (!matchingMandolins.isEmpty()) {
	    	System.out.println("Phil, you might like these mandolins: ");
	    	for (Iterator<Mandolin> i = matchingMandolins.iterator(); i.hasNext();) {
	    		Mandolin mandolin = (Mandolin)i.next();
	    		MandolinSpec spec =  (MandolinSpec) mandolin.getSpec();
	    		System.out.println(" We have a " +
	    				spec.getBuilder() + " " + spec.getModel() + " " +
	    				spec.getType() + " mandolin:\n   " +
	    				spec.getBackWood() + " back and sides,\n   " +
	    				spec.getTopWood() + " top.\n You can have it for only $" + mandolin.getPrice() + "!\n ----");
	    	}
	    } else { 
	        System.out.println("Sorry, Phil, we have nothing for you.");
	        }
	    }
    
    private static void initializeInventory(Inventory inventory) {
    	// GUITARS
        inventory.addInstrument("11277", 3999.95, 
        	      new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
        inventory.addInstrument("V95693", 1499.95, 
        	      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
        inventory.addInstrument("V9512", 1549.95, 
        	      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
        
        // MANDOLINS
        inventory.addInstrument("X12345", 1745.55,
        		new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, Style.A, Wood.ALDER, Wood.ALDER));
        inventory.addInstrument("Q21457", 1200.55,
        		new MandolinSpec(Builder.COLLINGS, "OakTown Goove", Type.ACOUSTIC,  Style.F, Wood.BRAZILIAN_ROSEWOOD, Wood.CEDAR));
        inventory.addInstrument("S95693", 1699.95,
        		new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC,  Style.A, Wood.ALDER, Wood.ALDER));
      }
}