package task2;

public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.setAnnualInterestRate(4);

        Save.calculateMonthlyInterest(saver1);
        Save.calculateMonthlyInterest(saver2);

        System.out.println(saver1.getSaveBalance());
        System.out.println(saver2.getSaveBalance());

        saver1.setAnnualInterestRate(5);

        Save.calculateMonthlyInterest(saver1);
        Save.calculateMonthlyInterest(saver2);

        System.out.println(saver1.getSaveBalance());
        System.out.println(saver2.getSaveBalance());

    }
}
