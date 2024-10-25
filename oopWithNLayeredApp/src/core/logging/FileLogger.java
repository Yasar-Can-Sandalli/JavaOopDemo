package core.logging;

import dataAccess.BaseProductDao;
import entities.Product;

public class FileLogger implements BaseLogger {
    @Override
    public void log(String data) {
        System.out.println("Logged to File: " + data);
    }
}
