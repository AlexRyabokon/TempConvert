package org.except.homework;

public class WrongIndex extends Exception{
    public WrongIndex() {
    }

    public WrongIndex(String message) {
        super(message);
    }

    public WrongIndex(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongIndex(Throwable cause) {
        super(cause);
    }

    public WrongIndex(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public void printStackTrace() {
        System.out.println("Введите число от ноля до десяти");
    }
}
