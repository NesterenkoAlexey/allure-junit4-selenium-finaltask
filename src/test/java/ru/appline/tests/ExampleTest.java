package ru.appline.tests;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.appline.base.BaseTest;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ExampleTest extends BaseTest {

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"RUB", "300000", "6 месяцев", "50000", "ON", "12 243,26", "562 243,26"},
                {"USD", "500000", "12 месяцев", "20000", "ON", "920,60", "720 920,60"}
                        });
    }

    @Parameterized.Parameter(0)
    public String currency;

    @Parameterized.Parameter(1)
    public String depositSum;

    @Parameterized.Parameter(2)
    public String depositTerm;

    @Parameterized.Parameter(3)
    public String replenishSum;

    @Parameterized.Parameter(4)
    public String monthlyCapitalization;

    @Parameterized.Parameter(5)
    public String percentAmount;

    @Parameterized.Parameter(6)
    public String finalAmount;

    @Test
    public void startTest() {

        app.getHomePage()
                .selectMenu("Вклады")
                .chooseCurrency(currency)
                .fillSum(depositSum)
                .chooseDepositTerm(depositTerm)
                .fillReplenish(replenishSum)
                .selectMonthlyCapitalization(monthlyCapitalization)
                .percentCheck(percentAmount)
                .finalAmountCheck(finalAmount);

    }

}
