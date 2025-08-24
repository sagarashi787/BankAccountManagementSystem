package com.bank;

import com.bank.models.BankAccount;
import com.bank.models.User;
import com.bank.services.BankService;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа запущена!");
        System.out.println("Тест BigDecimal: " + new BigDecimal("1000"));

        // Создаем пользователя
        User user = new User(0, "John Doe");
        System.out.println("Пользователь создан: " + user.getAccounts().size() + " счетов");

        // Создаем сервис
        BankService bankService = new BankService();
        System.out.println("Сервис создан");

        // Создаем счета
        bankService.createAccount(user, "ACC123");
        bankService.createAccount(user, "ACC456");
        System.out.println("Счета созданы: " + user.getAccounts().size() + " счетов");

        // Получаем счета пользователя
        List<BankAccount> accounts = user.getAccounts();
        BankAccount acc1 = accounts.get(0);
        BankAccount acc2 = accounts.get(1);
        System.out.println("Получаем счета: " + acc1.getAccountNumber() + " и " + acc2.getAccountNumber());

        // Пополняем первый счет
        acc1.deposit(new BigDecimal("1000"));
        System.out.println("Счёт пополнен: " + acc1.getAccountNumber() + " и " + acc2.getAccountNumber());

        // Переводим средства между счетами
        bankService.transfer(acc1, acc2, new BigDecimal("500"));
        System.out.println("Перевод прошёл" + acc1.getAccountNumber() + "и " + acc2.getAccountNumber());

        // Выводим балансы
        System.out.println("Balance of ACC123: " + acc1.getBalance());
        System.out.println("Balance of ACC456: " + acc2.getBalance());

        // Выводим историю транзакций
        System.out.println("Transaction history for ACC123:");
        bankService.getTransactionHistory(acc1).forEach(System.out::println);
    }
}
