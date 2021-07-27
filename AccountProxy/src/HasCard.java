public class HasCard implements AccountState {

    Account account;

    public HasCard(Account newATMMachine){

        account = newATMMachine;

    }

    public void insertCard() {

        System.out.println("You can only insert one card at a time");

    }

    public void ejectCard() {

        System.out.println("Your card is ejected");
        account.setAccountState(account.getNoCardState());

    }

    public void requestCash(int cashToWithdraw) {

        System.out.println("You have not entered your PIN");


    }

    public void insertPin(int pinEntered) {

        if(pinEntered == 1234){

            System.out.println("You entered the correct PIN");
            account.correctPinEntered = true;
            account.setAccountState(account.getHasPin());

        } else {

            System.out.println("You entered the wrong PIN");
            account.correctPinEntered = false;
            System.out.println("Your card is ejected");
            account.setAccountState(account.getNoCardState());

        }
    }
}
