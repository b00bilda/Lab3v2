package Characters;

public class GellaIsStillInjured extends RuntimeException {
  public String getMessage() {
    return "Гелла ранен, драка не была закончена.";
  }
}
