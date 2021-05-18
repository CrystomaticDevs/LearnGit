package builder_demo.adapter_demo;

public class adapterClass {
    public static employee getEmployee(candidate c){
        long salary = 100000;
        return  new employee(c.getId(),c.getName(),c.getDob(), salary);
    }
}
