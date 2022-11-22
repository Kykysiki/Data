public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("test", "test", "test");
        if (success) {
            System.out.println("Даннные валидны");
        } else {
            System.out.println("Даннные невалидны");
        }
    }
}