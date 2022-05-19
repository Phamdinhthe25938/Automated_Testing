import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDayCalculator() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1 day :");
//        int day = sc.nextInt();
        int day =1;
        int nextDay=2;
        int result= NextDayCalculator.NextDayCalculator(day);
        assertEquals(nextDay, result);
    }
}