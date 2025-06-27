import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatFlagsException;

public class JavaProfMain {
    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");
        multiCatch();
}
    private static void toThrowOrNotToThrow(boolean exc) throws Exception {
        System.out.println("JavaProfMain.toThrowOrNotToThrow start");
        if (exc) {
            throw new Exception(); //основное не проверяемое исключение
        }
        System.out.println("JavaProfMain.toThrowOrNotToThrow end");
    }

    private static void multiCatch(){
        try {
            System.out.printf("%#%f",1);
        } catch (IllegalFormatConversionException e) {
            System.out.println("Caught exc");
        } catch (IllegalFormatFlagsException e) {
            System.out.println("Caught exc");
        }
        System.out.println("JavaProfMain.toThrowOrNotToThrow end");
    }
}