public abstract class AbstractLogger {
    public static int LOGGER1 = 3;
    public static int LOGGER2 = 2;
    public static int LOGGER3 = 1;
    protected int level;
    //next element in chain or responsibility
    protected AbstractLogger nextLogger;
    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }
    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }
    abstract protected void write(String message);
}
