package org.skypro.skyshop.exception;

import java.io.IOException;

// Создали класс исключения.
public class BestResultNotFound extends IOException {

    public BestResultNotFound(String s) {
        super(s);
    }
}
