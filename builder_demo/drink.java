package builder_demo;

public abstract class drink implements foodItem {
    @Override
    public abstract float price();

    @Override
    public abstract String packing();
}
