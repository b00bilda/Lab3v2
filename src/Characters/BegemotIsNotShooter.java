package Characters;

public class BegemotIsNotShooter extends RuntimeException {
    public String getMessage() {
        return "Бегемот был слишком зол, чтобы продолжать драку.";
    }
}
