public abstract class GermanPlayer implements Player{
    @Override
    public Region region() {
        return new EuropeRegion();
    }
    @Override
    public abstract int otherMember();
}
