public class EventBuilder {
    public Event prepareBattle1(){
        Event event = new Event();
        event.addPlayer(new ColomboSrilankaPlayer());
        event.addPlayer(new BerlinGermanPlayer());
        return event;
    }
    public Event prepareBattle2(){
        Event event = new Event();
        event.addPlayer(new KandySrilankaPlayer());
        event.addPlayer(new MunichGermanPlayer());
        return event;
    }
}
