class Ca extends animal {
    public Ca(String name) {
        super(name);
    }

    @Override
    boolean walk() {
        return false;
    }

    @Override
    boolean swim() {
        return true;
    }
}
