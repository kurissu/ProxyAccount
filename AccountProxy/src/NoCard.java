public class NoCard implements AccountState {

    Account account;

    public NoCard(Account newAccountMachine){

        account = newAccountMachine;

    }

    public void insertCard() {

        System.out.println("Please enter your pin");
        account.setAccountState(account.getYesCardState());

    }

    public void ejectCard() {

        System.out.println("You didn't enter a card");

    }

    public void requestCash(int cashToWithdraw) {

        System.out.println("You have not entered your card");

    }

    public void insertPin(int pinEntered) {

        System.out.println("You have not entered your card");

    }
}
