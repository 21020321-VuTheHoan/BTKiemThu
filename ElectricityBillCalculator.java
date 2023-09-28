public class ElectricityBillCalculator {
    
    public static double calculateElectricityBill(int consumedUnits) {
        double billAmount = 0;
        if (consumedUnits < 0) {
            billAmount = -1;
        } else if (consumedUnits <= 50) {
            billAmount = consumedUnits * 1678;
        } else if (consumedUnits <= 100) {
            billAmount = 50 * 1678 + (consumedUnits - 50) * 1734;
        } else if (consumedUnits <= 200) {
            billAmount = 50 * 1678 + 50 * 1734 + (consumedUnits - 100) * 2014;
        } else if (consumedUnits <= 300) {
            billAmount = 50 * 1678 + 50 * 1734 + 100 * 2014 + (consumedUnits - 200) * 2536;
        } else if (consumedUnits <= 400) {
            billAmount = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (consumedUnits - 300) * 2834;
        } else {
            billAmount = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (consumedUnits - 400) * 2927;
        }

        return billAmount;
    }
}

    
