package com.skypro.account;

public class TransactionException extends RuntimeException {
    //имя человека, у которого не хватило денег
    private String name;

    public TransactionException(String name) {
        //по умолчанию у наследников вызывается пустой метод
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "TransactionException{" +
                "у " + name + " нет денег!}";
    }
}
