public class HasPin implements AccountState {

    Account account;

    public HasPin(Account newATMMachine){

        account = newATMMachine;

    }

    public void insertCard() {

        System.out.println("You already entered a card");

    }

    public void ejectCard() {

        System.out.println("Your card is ejected");
        account.setAccountState(account.getNoCardState());

    }

    public void requestCash(int cashToWithdraw) {

        if(cashToWithdraw > account.cashInAccount){

            System.out.println("You don't have that much cash available");
            System.out.println("Your card is ejected");
            account.setAccountState(account.getNoCardState());

        } else {

            System.out.println(cashToWithdraw + " is provided by the machine");
            account.setCashInAccount(account.cashInAccount - cashToWithdraw);

            System.out.println("Your card is ejected");
            account.setAccountState(account.getNoCardState());

            if(account.cashInAccount <= 0){

                account.setAccountState(account.getNoCashState());

            }
        }
    }

    public void insertPin(int pinEntered) {

        System.out.println("You already entered a PIN");

    }
}
