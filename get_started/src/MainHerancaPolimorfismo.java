public class MainHerancaPolimorfismo {
    public static void main(String[] args) {
        //Employee employee = new Employee();
        Employee manager = new Manager();

        manager.setName("Nelson");
        manager.setSalary(5000);

        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
    }
}
