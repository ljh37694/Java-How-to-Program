public class SalariedEmployee  extends Employee{
    private double weeklySalary;

    // construct
    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNumber, Date birthDate, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    // set salary
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    // return salary
    public double getWeeklySalary() {return weeklySalary;}

    //calculate earning; override abstract method earnings in Employee
    @Override
    public double earnings() {return getWeeklySalary() + birthdayBonus(getBirthMonth());}

    // return String representation of SalariedEmployee Object
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}
