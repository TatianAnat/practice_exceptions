import com.skypro.account.Account;

import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatFlagsException;

public class JavaProfMain {
    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");
        businessTransaction();
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
            System.out.printf("%f",1);
        } catch (IllegalFormatFlagsException e) {
            System.out.println("Caught IllegalFormatFlagsException " + e.getFlags());
        } finally {
            System.out.println("JavaProfMain.multiCatch end");
        }
    }
    //создаём два аккаунта
    private static void businessTransaction() {
        Account ivan = new Account("Ivan", 20);
        Account petr = new Account("Petr", 5);

        try {
            System.out.println("ivan = " + ivan);
            System.out.println("petr = " + petr);
            //выполним метод перевода денег
            sendMoney(ivan, petr, 30);
            System.out.println("ivan = " + ivan);
            System.out.println("petr = " + petr);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
            e.printStackTrace();
        }
    }

    private static void sendMoney(Account from, Account to, int amount) {
        from.changeBalance(- amount);
        to.changeBalance(amount);
    }
}