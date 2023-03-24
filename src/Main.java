import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        Employee commissioned = new Commissioned("Bob", "Loblaw", 2000, 40000);
        Employee salaried = new Salaried("Sue", "Me", 50000, 10);
        Employee pieceWorker = new PieceWorker("Tina", "Zena", 1000);
        Employee manager = new Manager("Richard", "Rich", 100000, 2000);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(commissioned);
        employeeList.add(salaried);
        employeeList.add(pieceWorker);
        employeeList.add(manager);

        for(Employee current : employeeList){
            if(current instanceof Commissioned){
                Commissioned commissioned1 = (Commissioned)current;
                System.out.println(commissioned1.printMonthlyPay() + "\n");
            }else if(current instanceof Salaried){
                Salaried salaried1 = (Salaried)current;
                System.out.println(salaried1.printMonthlyPay() + "\n");
            }else if(current instanceof PieceWorker){
                PieceWorker pieceWorker1 = (PieceWorker)current;
                System.out.println(pieceWorker1.printMonthlyPay() + "\n");
            }else if(current instanceof Manager){
                Manager manager1 = (Manager)current;
                System.out.println(manager1.printMonthlyPay() + "\n");
            }
        }

    }
}