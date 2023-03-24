import java.text.DecimalFormat;

public class Manager extends Employee{

    private double baseSalary;
    private double monthlyBonusAmount;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Manager(String firstName, String lastName, double baseSalary, double monthlyBonusAmount) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    @Override
    public double calculateMonthlyPay() {
        return (baseSalary + monthlyBonusAmount)/12;
    }

    @Override
    public String printMonthlyPay() {
        return "Name: " + this.getFirstName() +" " + this.getLastName() + "\n" +
                "   Pay Type: " + this.getClass().getSimpleName() + "\n" +
                "   Monthly pay: $" + df.format((this.calculateMonthlyPay()));
    }
}
