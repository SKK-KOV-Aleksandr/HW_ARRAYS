package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumOfSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageOfSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15.0;
        double actual = service.averageOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonthTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesMonthTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesOverAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesOverAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesUnderAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.salesUnderAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
