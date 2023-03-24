import java.text.DecimalFormat;

public class Commissioned extends Employee{

    private double baseSalary;
    private double grossSales;
    DecimalFormat df = new DecimalFormat("#0.00");

    public Commissioned(String firstName, String lastName, double baseSalary, double grossSales) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
        this.grossSales = grossSales;
    }

    @Override
    public double calculateMonthlyPay() {
        return baseSalary + (grossSales*.10);
    }

    @Override
    public String printMonthlyPay() {
        return "Name: " + this.getFirstName() +" " + this.getLastName() + "\n" +
                "   Pay Type: " + this.getClass().getSimpleName() + "\n" +
                "   Monthly pay: $" + df.format((this.calculateMonthlyPay()));
    }

}
