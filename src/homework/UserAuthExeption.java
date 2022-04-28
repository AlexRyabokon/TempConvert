package org.except.homework;

public class UserAuthExeption extends Exception {

    public UserAuthExeption() {
    }

    public UserAuthExeption(String message) {
        super(message);
    }

    public UserAuthExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAuthExeption(Throwable cause) {
        super(cause);
    }

    public UserAuthExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
