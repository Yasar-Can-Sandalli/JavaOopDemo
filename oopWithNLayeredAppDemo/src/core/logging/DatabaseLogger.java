package core.logging;

public class DatabaseLogger implements BaseLogger {

    @Override
    public void log(String data) {
        System.out.println("Logged to Database" + data);
    }
}
