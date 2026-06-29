package SingletonPatternExample;

public class Logger {
    private static Logger instance = new Logger();
    private Logger(){
        System.out.println("Logger Instance Created");
    }
    public static Logger getInstance(){
        return instance;
    }
    public void log(String message){
        System.out.println("Log: " + message);
    }
}
