package builder_demo.adapter_demo;

public class mainClass {
    public static void main(String[] args) {
        candidate c = new candidate();
        c.setName("ridmi");
        c.setId(1);
        c.setDob(null);

        placement p = new placement();
        p.process(c);

        
    }
}
