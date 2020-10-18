package task2;

public interface Save {


     static void calculateMonthlyInterest(SavingsAccount sv) {
        sv.addSaveBalance((sv.getSaveBalance()*sv.getInterest())/12);
    }
}
