public class BuilderPatternDemo {
    public static void main(String[] args) {

        EventBuilder eventBuilder = new EventBuilder();

        Event battle1 = eventBuilder.prepareBattle1();
        System.out.println("battle1");
        battle1.showDetails();
        System.out.println("Total Number of Players: " + battle1.getMembers());

        Event battle2 = eventBuilder.prepareBattle2();
        System.out.println("battle2");
        battle2.showDetails();
        System.out.println("Total Number of Players: " + battle2.getMembers());
    }
}
