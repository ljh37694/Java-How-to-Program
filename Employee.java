import java.time.LocalDate;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;
    private final int currentMonth;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
        currentMonth = LocalDate.now().getMonthValue();
    }

    // return first name
    public String getFirstName() {return firstName;}

    // return last name
    public String getLastName() {return lastName;}

    // return social security number
    public String getSocialSecurityNumber() {return socialSecurityNumber;}

    public int getBirthMonth() {return birthDate.getMonth();}

    public double birthdayBonus(int birthMonth) {return birthMonth == currentMonth ? 100.0 : 0.0;}

    //return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s%nbirthdayBonus: $%,.2f",
                getFirstName(), getLastName(), getSocialSecurityNumber(), birthdayBonus(getBirthMonth()));
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings();

    // implementing getPaymentAmount here enables the entire Employee
    // class hierarchy to be used in an app that processes Payable
    public double getPaymentAmount() {return earnings();}
}
