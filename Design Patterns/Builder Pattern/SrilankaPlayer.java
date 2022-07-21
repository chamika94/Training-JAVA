public abstract class SrilankaPlayer implements Player {
    @Override
    public Region region() {
        return new AsiaRegion();
    }
    @Override
    public abstract int otherMember();
}
