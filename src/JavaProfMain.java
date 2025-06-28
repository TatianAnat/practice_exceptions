import com.skypro.account.Account;
import com.skypro.account.PersonalInfoException;
import com.skypro.account.TransactionException;

import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatFlagsException;

public class JavaProfMain {
    public static void main(String[] args) {
        System.out.println("Skypro Uni - Java Profession start!");
        try {
            businessTransaction();
        } catch (TransactionException e) {
            System.out.println(e);
        } catch (PersonalInfoException e) {
            System.out.println("Позвоните менеджеру! Аккаунт без имени.");
        }
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
        System.out.println("ivan = " + ivan);
        System.out.println("petr = " + petr);
        //выполним метод перевода денег
        sendMoney(ivan, petr, 30);
        System.out.println("ivan = " + ivan);
        System.out.println("petr = " + petr);
    }

    private static void sendMoney(Account from, Account to, int amount) {
        from.changeBalance(amount);
        to.changeBalance(- amount);
    }
}