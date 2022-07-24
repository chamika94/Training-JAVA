public class Logger3 extends AbstractLogger{
    public Logger3(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Checked by Logger3 : " + message);
    }
}
