package v5.enums;

public enum InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;

    public String toString() {
        switch (this) {
            case GUITAR: return "Guitar";
            case BANJO: return "BANJO";
            case DOBRO: return "DOBRO";   
            case FIDDLE: return "FIDDLE";   
            case BASS: return "BASS";   
            case MANDOLIN: return "MANDOLIN";        
            default: return "Unspecified";
        }
    }
}
