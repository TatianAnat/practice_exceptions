public class JavaProfMain {
    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");
        try {
            toThrowOrNotToThrow(false);
            toThrowOrNotToThrow(true);
        } catch (Exception e) {
            throw new RuntimeException(e); //оборачиваем проверяемое исключение в непроверяемое
            //т.о. не теряем исключение, а пробрасываем наверх и сохраняем всю информацию о том исключении, которое было выбрашено первоначально
        }
    }

    private static void toThrowOrNotToThrow(boolean exc) throws Exception {
        System.out.println("JavaProfMain.toThrowOrNotToThrow start");
        if (exc) {
            throw new Exception(); //основное не проверяемое исключение
        }
        System.out.println("JavaProfMain.toThrowOrNotToThrow end");
    }
}