package by.java.homework.task16;

import by.java.homework.task16.Exceptions.AccountNotFoundException;
import by.java.homework.task16.Exceptions.NotEnoughMoneyException;

import java.util.Set;

public class Bank {
//    2. Создать класс Банк.  В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
//5. В классе банк реализовать метод перевода денежных средств с одного счёта на другой. Сигнатура метода будет такая:
//public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount)
//5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги, выбрасывает своё исключение AccountNotFoundException с errorCode= not.found.account
//5.2 Если на счёте, с которого переводят деньги, сумма меньше переводимой то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money
// 5.3  Соответсвтенно выполните логику перевода денег в белорусской валюте (отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту,на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.
    //9. *В классе банк реализуйте метод перевода денег со счёта на счёт, который будет работать со счетами, у которых разные валюты (USD и BYN). Сигнатура метода такая:
//public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate). exchangeRate это курсовая разница между доларом и белорусским рублём. Проверки выполните те же что и в пункте 5.

    Set<Account> accounts;

    public Bank(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        double amountResult = 0.00;
        boolean accountNumberFromExist = false;
        boolean accountNumberToExist = false;
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumberFrom)) {
                amountResult = account.getAmount() - amount;
                accountNumberFromExist = true;
            }
            if (account.getNumber().equals(accountNumberTo)) {
                accountNumberToExist = true;
            }
        }
        if (!accountNumberFromExist | !accountNumberToExist) {
            throw new AccountNotFoundException("Откройте счёт в нашем банке для выполнения переводов", "not.found.account");
        }
        if (amountResult < 0.00) {
            throw new NotEnoughMoneyException("Недостаточно средств для перевода", "not.enough.money");
        }
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumberFrom)) {
                account.setAmount(account.getAmount() - amount);
            }
            if (account.getNumber().equals(accountNumberTo)) {
                account.setAmount(account.getAmount() + amount);
            }
        }
    }

    public void transferMoneyExchange(String accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate) {
        double amountResult = 0.00;
        boolean accountNumberFromExist = false;
        boolean accountNumberToExist = false;
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumberFrom)) {
                if (!account.getCurrency().equals("BYN")) {
                    amountResult = account.getAmount() - amount / exchangeRate;
                } else {
                    amountResult = account.getAmount() - amount;
                }
                accountNumberFromExist = true;
            }
            if (account.getNumber().equals(accountNumberTo)) {
                accountNumberToExist = true;
            }
        }
        if (!accountNumberFromExist | !accountNumberToExist) {
            throw new AccountNotFoundException("Откройте счёт в нашем банке для выполнения переводов", "not.found.account");
        }
        if (amountResult < 0.00) {
            throw new NotEnoughMoneyException("Недостаточно средств для перевода", "not.enough.money");
        }
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumberFrom)) {
                account.setAmount(amountResult);
            }
            if (account.getNumber().equals(accountNumberTo)) {
                if (!account.getCurrency().equals("BYN")) {
                    account.setAmount(account.getAmount() + amount / exchangeRate);
                } else {
                    account.setAmount(account.getAmount() + amount);
                }
            }
        }
    }
}
