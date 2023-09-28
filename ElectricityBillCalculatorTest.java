import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ElectricityBillCalculatorTest {

    @Test
    public void testCalculateElectricityBill() {
        // Testcase <: consumedUnits < 0
        int consumedUnits1 = -5;
        double expectedBillAmount1 = -1;
        double actualBillAmount1 = ElectricityBillCalculator.calculateElectricityBill(consumedUnits1);
        assertEquals(expectedBillAmount1, actualBillAmount1, 0.01);
        // Testcase 1: consumedUnits <= 50
        int consumedUnits2 = 30;
        double expectedBillAmount2 = 30 * 1678;
        double actualBillAmount2 = ElectricityBillCalculator.calculateElectricityBill(consumedUnits2);
        assertEquals(expectedBillAmount2, actualBillAmount2, 0.01);

        // Testcase 2: 50 < consumedUnits <= 100
        int consumedUnits3 = 80;
        double expectedBillAmount3 = 50 * 1678 + (80 - 50) * 1734;
        double actualBillAmount3 = ElectricityBillCalculator.calculateElectricityBill(consumedUnits3);
        assertEquals(expectedBillAmount3, actualBillAmount3, 0.01);

        // Testcase 3: 100 < consumedUnits <= 200
        int consumedUnits4 = 150;
        double expectedBillAmount4 = 50 * 1678 + 50 * 1734 + (150 - 100) * 2014;
        double actualBillAmount4 = ElectricityBillCalculator.calculateElectricityBill(consumedUnits4);
        assertEquals(expectedBillAmount4, actualBillAmount4, 0.01);

        // Testcase 4: 200 < consumedUnits <= 300
        int consumedUnits5 = 250;
        double expectedBillAmount5 = 50 * 1678 + 50 * 1734 + 100 * 2014 + (250 - 200) * 2536;
        double actualBillAmount5 = ElectricityBillCalculator.calculateElectricityBill(consumedUnits5);
        assertEquals(expectedBillAmount5, actualBillAmount5, 0.01);

        // Testcase 5: 300 < consumedUnits <= 400
        int consumedUnits6 = 350;
        double expectedBillAmount6 = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (350 - 300) * 2834;
        double actualBillAmount6 = ElectricityBillCalculator.calculateElectricityBill(consumedUnits6);
        assertEquals(expectedBillAmount6, actualBillAmount6, 0.01);

        // Testcase 6: consumedUnits > 400
        int consumedUnits7 = 450;
        double expectedBillAmount7 = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (450 - 400) * 2927;
        double actualBillAmount7 = ElectricityBillCalculator.calculateElectricityBill(consumedUnits7);
        assertEquals(expectedBillAmount7, actualBillAmount7, 0.01);

    
    }
}