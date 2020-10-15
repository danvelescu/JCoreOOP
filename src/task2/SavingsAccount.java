package task2;

public class SavingsAccount {
    private static float annualInterestRate;
    private float saveBalance;

    SavingsAccount(float saveBalance){
        this.saveBalance = saveBalance;
    }

    public float getSaveBalance() {
        return saveBalance;
    }

    public void setSaveBalance(float saveBalance) {
        this.saveBalance = saveBalance;
    }

    public void setAnnualInterestRate(float nr) {
        annualInterestRate = nr;
    }

    public float getInterest() {
        return annualInterestRate;
    }

    public static void calculateMonthlyInterest(SavingsAccount sv) {
        sv.saveBalance = (sv.saveBalance*sv.getInterest())/12;
    }
}
