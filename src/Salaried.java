import java.text.DecimalFormat;

public class Salaried extends Employee{
    private double monthlySalary;
    private int yearsOfService;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Salaried(String firstName, String lastName, double monthlySalary, int yearsOfService) {
        super(firstName, lastName);
        this.monthlySalary = monthlySalary/12;
        this.yearsOfService = yearsOfService;
    }

    @Override
    public double calculateMonthlyPay() {
        return monthlySalary + (yearsOfService*0.01);
    }

    @Override
    public String printMonthlyPay() {
        return "Name: " + this.getFirstName() +" " + this.getLastName() + "\n" +
                "   Pay Type: " + this.getClass().getSimpleName() + "\n" +
                "   Monthly pay: $" + df.format((this.calculateMonthlyPay()));
    }
}
