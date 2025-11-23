package by.java.homework.task16;

public class Account {
    //    . Создать класс счёт (Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double). Выполнить переопределение equals и hashcode по двум полям (id и номер счёта), так как логически, эти поля будут уникальными для каждого счёта.

    private int id;
    private String  number;
    private String currency;
    private double amount;

    public Account(int id, String number, String currency, double amount) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "\nAccount{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Account account = (Account) o;
        if (id == account.getId() && number.equals(account.getNumber())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = id + number.hashCode();
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
