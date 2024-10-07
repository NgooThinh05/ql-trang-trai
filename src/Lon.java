class Lon extends animal{
    public Lon(String name){
        super(name);
    }

    @Override
    boolean walk() {
        return true;
    }

    @Override
    boolean swim() {
        return false;
    }
}
