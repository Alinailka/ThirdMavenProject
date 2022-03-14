package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSale(int[] sales) {

        sumSales(sales);
        int averageSale = sumSales(sales) / 12;
        {
            return averageSale;
        }
    }

    public int lowAverageSale(int[] sales) {
        averageSale(sales);
        int counter = 0;
        for (int sale : sales)
            if (averageSale(sales) > sale)
                counter++;
        {
            return counter;
        }
    }

    public int highAverageSale(int[] sales) {
        averageSale(sales);
        int counter = 0;
        for (int sale : sales)
            if (averageSale(sales) < sale)
                counter++;
        {
            return counter;
        }
    }
}
