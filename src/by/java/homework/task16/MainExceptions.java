package by.java.homework.task16;

import by.java.homework.task16.Exceptions.AccountNotFoundException;
import by.java.homework.task16.Exceptions.NotEnoughMoneyException;

import java.util.HashSet;
import java.util.Set;

public class MainExceptions {
    //    . Создать класс счёт (Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double). Выполнить переопределение equals и hashcode по двум полям (id и номер счёта), так как логически, эти поля будут уникальными для каждого счёта.
//2. Создать класс Банк.  В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
//3. Создать своё непроверяемое исключение AccountNotFoundException. В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.
//4. Создать своё непроверяемое исключение NotEnoughMoneyException. В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.
//5. В классе банк реализовать метод перевода денежных средств с одного счёта на другой. Сигнатура метода будет такая:
//public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount)
//5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги, выбрасывает своё исключение AccountNotFoundException с errorCode= not.found.account
//5.2 Если на счёте, с которого переводят деньги, сумма меньше переводимой то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.
//5.3  Соответсвтенно выполните логику перевода денег в белорусской валюте (отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту,на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.
//6. В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)
//7. В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт. При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch
//7.1 Если пришло исключение AccountNotFoundException то выведите в консоль «Откройте счёт в нашем банке для выполнения переводов»
//7.2 Если пришло исключение NotEnoughMoneyException то выведите в консоль «Недостаточно средств для перевода»
//7.3 В обоих случаях не пробрасывайте исключения дальше. Программа должна продолжать работу.
//8. Добавьте блок finally. В блоке finally выведите в консоли «Спасибо,что вопользовались услугами банка»
//9. *В классе банк реализуйте метод перевода денег со счёта на счёт, который будет работать со счетами, у которых разные валюты (USD и BYN). Сигнатура метода такая:
//public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate). exchangeRate это курсовая разница между доларом и белорусским рублём. Проверки выполните те же что и в пункте 5.

    static void main() {
        Set<Account> accounts = new HashSet<>();
        Account account1 = new Account(11, "numberByn", "BYN", 20.55);
        Account account2 = new Account(2, "numberUSD", "USD", 100.45);
        Account account3 = new Account(3, "numberByn1", "BYN", 2000.15);
        Account account4 = new Account(41, "numberEUR", "EUR", 300.02);
        Account account5 = new Account(15, "numberUSD1", "USD", 1098.32);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);

        Bank bank = new Bank(accounts);
        System.out.println(bank);

        System.out.println("*************************после перевода***********************");

        try {
            bank.transferMoney("numberByn", "numberByn1", 30.00);
        } catch (AccountNotFoundException accountNotFoundException) {
            System.out.println(accountNotFoundException);
        } catch (NotEnoughMoneyException moneyException) {
            System.out.println(moneyException);
        } finally {
            System.out.println("Баланс ваших счетов: " + bank);
            System.out.println("Спасибо,что воспользовались услугами банка");
        }

        System.out.println("*************************после перевода с валютой ***********************");

        try {
            bank.transferMoneyExchange("numberUSD", "numberByn1", 50.00, 2.0);
        } catch (AccountNotFoundException accountNotFoundException) {
            System.out.println(accountNotFoundException);
        } catch (NotEnoughMoneyException moneyException) {
            System.out.println(moneyException);
        } finally {
            System.out.println("Баланс ваших счетов: " + bank);
            System.out.println("Спасибо,что воспользовались услугами банка");
        }
    }
}
