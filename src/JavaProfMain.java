public class JavaProfMain {
    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");
        toThrowOrNotToThrow(true);
        toThrowOrNotToThrow(false);
    }

    private static void toThrowOrNotToThrow(boolean exc) {
        System.out.println("JavaProfMain.toThrowOrNotToThrow start");
        if (exc) {
            throw new RuntimeException(); //основное не проверяемое исключение
        }
        System.out.println("JavaProfMain.toThrowOrNotToThrow end");
    }
}