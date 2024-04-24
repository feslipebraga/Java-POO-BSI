package v5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v5.enums.*;

public class FindInstrument {
    public static void main(String[] args) {
    	
        Inventory inventory = new Inventory();
        
        initializeInventory(inventory);

        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);

        InstrumentSpec cliencSpec = new InstrumentSpec(properties);

        List<Instrument> matchingInstruments = inventory.search(cliencSpec);
        showSearchInstrumentResult(matchingInstruments);
    }
    private static void showSearchInstrumentResult(List<Instrument> matchingInstruments){
        if (!matchingInstruments.isEmpty()) {
            System.out.println("You might like these guitars: ");
            for (Instrument instrument : matchingInstruments) {
                InstrumentSpec spec = instrument.getSpec();
                for(String propertyName : spec.getProperties().keySet()){
        
                    if(propertyName.equals("instrumentType")){
                        continue;
                    }
                    System.out.println("    " + propertyName + ": " +
                        spec.getProperty(propertyName)
                    );
                }
                System.out.println("    You can have this "+
                    spec.getProperty("instrumentType") + " for $" +
                    instrument.getPrice() + "\n---"
                );

            }
        } else { 
            System.out.println("Sorry, we have nothing for you.");
        }
    }
    private static void initializeInventory(Inventory inventory) {
    	// GUITARS
        inventory.addInstrument("11277", 3999.95, 
        new InstrumentSpec(Map.of(
            "builder", Builder.COLLINGS,
            "model", "CJ", 
            "type", Type.ACOUSTIC,
            "numStrings", 6, 
            "backWood", Wood.INDIAN_ROSEWOOD, 
            "topWood", Wood.SPRUCE,
            "instrumentType", InstrumentType.GUITAR
        )));

        inventory.addInstrument("122784", 5495.95,  
        new InstrumentSpec(Map.of(
            "builder", Builder.MARTIN,
            "model", "D-18", 
            "type", Type.ACOUSTIC,
            "numStrings", 6, 
            "backWood", Wood.MAHOGANY, 
            "topWood",Wood.ADIRONDACK,
            "instrumentType", InstrumentType.GUITAR
        )));

        inventory.addInstrument("V95693", 1499.95,  
        new InstrumentSpec(Map.of(
            "builder", Builder.FENDER,
            "model", "Stratocastor", 
            "type", Type.ELECTRIC,
            "numStrings", 6, 
            "backWood", Wood.ALDER, 
            "topWood",Wood.ALDER,
            "instrumentType", InstrumentType.GUITAR
        )));

        inventory.addInstrument("V9512", 1549.95,  
        new InstrumentSpec(Map.of(
            "builder", Builder.FENDER,
            "model", "Stratocastor", 
            "type", Type.ELECTRIC,
            "numStrings", 6, 
            "backWood", Wood.ALDER, 
            "topWood",Wood.ALDER,
            "instrumentType", InstrumentType.GUITAR
        )));

        inventory.addInstrument("82765501", 1890.95,  
        new InstrumentSpec(Map.of(
            "builder", Builder.GIBSON,
            "model", "SG´61 Reissue", 
            "type", Type.ELECTRIC,
            "numStrings", 6, 
            "backWood", Wood.MAHOGANY, 
            "topWood",Wood.MAHOGANY,
            "instrumentType", InstrumentType.GUITAR
        )));

        inventory.addInstrument("70108276", 2295.95,  
        new InstrumentSpec(Map.of(
            "builder", Builder.GIBSON,
            "model", "Les Paul", 
            "type", Type.ELECTRIC,
            "numStrings", 6, 
            "backWood", Wood.MAPLE, 
            "topWood",Wood.MAPLE,
            "instrumentType", InstrumentType.GUITAR
        )));
  
  
  
        // MANDOLINS

        inventory.addInstrument("9019920", 5495.99,  
        new InstrumentSpec(Map.of(
            "builder", Builder.GIBSON,
            "model", "F5-G", 
            "type", Type.ACOUSTIC,
            "backWood", Wood.MAPLE,
            "topWood",Wood.MAPLE,
            "instrumentType", InstrumentType.MANDOLIN
        )));

        inventory.addInstrument("8900231", 2945.95,
        new InstrumentSpec(Map.of(
            "builder", Builder.GIBSON,
            "model", "RB-3", 
            "numStrings", 5,
            "type", Type.ACOUSTIC,
            "backWood", Wood.MAPLE, 
            "topWood",Wood.MAPLE,
            "instrumentType", InstrumentType.BANJO
        )));

    }
}