import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Enter the total bill: ");
        double bill = myScanner.nextDouble();
        System.out.print("Enter the tip percentage (no percent sign): ");
        double tipPercent = myScanner.nextDouble();
        System.out.print("Enter the total number of people in the party: ");
        int numPeople = myScanner.nextInt();

        double singleBill = bill/numPeople;
        double totalTip = (tipPercent/100)*bill;
        double totalBill = totalTip+bill;
        double singleTip = totalTip/numPeople;
        double totalPerPerson = singleBill+singleTip;

        System.out.println("The total tip amount is: " + df.format(totalTip));
        System.out.println("The total bill including tip is: " + df.format(totalBill));
        System.out.println("The tip per person is: " + df.format(singleTip));
        System.out.println("The total per person (bill+tip) is: " + df.format(totalPerPerson));
    }
}
