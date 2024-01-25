package ru.netology.stats;

public class StatsService {
    public int sumOfSales(int[] sales) {
        int Sum = 0;
        for (int a : sales) {
            Sum += a;
        }
        return Sum;
    }

    public double averageOfSales(int[] sales) {
        double d = Math.round(((double) sumOfSales(sales) / (double) sales.length) * 10);
        return d / 10;
    }

    public int maxSalesMonth(int[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[max] <= sales[i]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minSalesMonth(int[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[min] >= sales[i]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int salesOverAverage(int[] sales) {
        double average = averageOfSales(sales);
        int count = 0;
        for (int s : sales) {
            if (s > average) {
                count++;
            }
        }
        return count;
    }

    public int salesUnderAverage(int[] sales) {
        double average = averageOfSales(sales);
        int count = 0;
        for (int x : sales) {
            if (x < average) {
                count++;
            }
        }
        return count;
    }

}
