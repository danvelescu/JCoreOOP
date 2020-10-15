package task2;

public interface Save {


     static void calculateMonthlyInterest(SavingsAccount sv) {
        sv.setSaveBalance((sv.getSaveBalance()*sv.getInterest())/12);
    }
}
