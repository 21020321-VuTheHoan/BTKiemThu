import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so don vi tieu thu dien: ");
        int consumedUnits = scanner.nextInt();

        double billAmount = ElectricityBillCalculator.calculateElectricityBill(consumedUnits);
        System.out.println("so tien dien: " + billAmount);

        scanner.close();
    }
}