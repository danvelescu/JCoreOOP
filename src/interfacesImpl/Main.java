package interfacesImpl;

public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.setAnnualInterestRate(4);

        saver1.calculateMonthlyInterest(saver1);
        saver1.calculateMonthlyInterest(saver2);

        System.out.println(saver1.getSaveBalance());
        System.out.println(saver2.getSaveBalance());

        saver1.setAnnualInterestRate(5);

        saver1.calculateMonthlyInterest(saver1);
        saver1.calculateMonthlyInterest(saver2);

        System.out.println(saver1.getSaveBalance());
        System.out.println(saver2.getSaveBalance());

    }
}
