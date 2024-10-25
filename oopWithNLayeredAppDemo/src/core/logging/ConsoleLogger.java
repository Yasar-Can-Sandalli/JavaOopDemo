package core.logging;

public class ConsoleLogger implements BaseLogger{
    public void log(String data) {
        System.out.println("Logged to Console : " + data);
    }
}
