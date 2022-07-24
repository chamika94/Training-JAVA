public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger logger1 = new Logger1(AbstractLogger.LOGGER1);
        AbstractLogger logger2 = new Logger2(AbstractLogger.LOGGER2);
        AbstractLogger logger3 = new Logger3(AbstractLogger.LOGGER3);

        logger1.setNextLogger(logger2);
        logger2.setNextLogger(logger3);

        return logger1;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.LOGGER3,
                "This is an information of logger1.");

        loggerChain.logMessage(AbstractLogger.LOGGER2,
                "This is an information of logger2.");

        loggerChain.logMessage(AbstractLogger.LOGGER1,
                "This is an information of logger3.");
    }
}
