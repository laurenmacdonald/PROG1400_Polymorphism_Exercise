import java.text.DecimalFormat;

public class PieceWorker extends Employee{
    private int unitsProduced;
    DecimalFormat df = new DecimalFormat("#0.00");

    public PieceWorker(String firstName, String lastName, int unitsProduced) {
        super(firstName, lastName);
        this.unitsProduced = unitsProduced;
    }

    @Override
    public double calculateMonthlyPay() {
        return unitsProduced;
    }

    @Override
    public String printMonthlyPay() {
        return "Name: " + this.getFirstName() +" " + this.getLastName() + "\n" +
                "   Pay Type: " + this.getClass().getSimpleName() + "\n" +
                "   Monthly pay: $" + df.format((this.calculateMonthlyPay()));
    }
}
