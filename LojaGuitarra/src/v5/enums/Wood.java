package v5.enums;

public enum Wood { 

  INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
  COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA, SPRUCE;

  public String toString() {
      switch(this) {
          case INDIAN_ROSEWOOD:    return "Indian Rosewood";
          case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
          case MAHOGANY:           return "Mahogany";
          case MAPLE:              return "Maple";
          case COCOBOLO:           return "Cocobolo";
          case CEDAR:              return "Cedar";
          case ADIRONDACK:         return "Adirondack";
          case ALDER:              return "Alder";
          case SITKA:              return "Sitka";
          case SPRUCE:              return "Spruce";
          default:  return "unspecified";
      }
  }
}
