package ru.netology.Paramcycl.services;

public class BalanceService {
    public int calculate(int income, int expenses, int threshold) {
        int vacation = 0;
        int balance = 0;
        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                vacation++;
                balance = ((balance - expenses) / 3);
            } else {
                balance = balance + income - expenses;
            }
        }
        return vacation;
    }
}