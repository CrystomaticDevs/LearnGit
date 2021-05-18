package builder_demo;

public abstract class pizza implements foodItem {
    @Override
    public abstract float price();

    @Override
    public abstract String packing();
}
