public class Logger1 extends AbstractLogger{
    public Logger1(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Checked by Logger1 : " + message);
    }
}
