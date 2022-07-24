public class Logger2 extends AbstractLogger{
    public Logger2(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Checked by Logger2 : " + message);
    }
}
