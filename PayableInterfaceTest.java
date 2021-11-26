public class PayableInterfaceTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new SalariedEmployee("John", "Smith", "111-11-1111", new Date(11, 2, 2002), 567.89),
                new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(1, 20, 1970), 16.75, 40),
                new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date(11, 30, 2000), 10000, .06),
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date(3, 17, 1989), 5000, .04, 300)
        };

        for (Employee currentEmployee : employees) {
            System.out.printf("%n%s%n%s: $%,.2f%n%n", currentEmployee, "earned", currentEmployee.earnings());
        }
    }
}
