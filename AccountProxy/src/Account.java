public class Account implements GetAccountData {
    AccountState hasCard;
    AccountState noCard;
    AccountState hasCorrectPin;
    AccountState AccountOutOfMoney;

    AccountState accountState;
    int cashInAccount = 2000;
    boolean correctPinEntered = false;

    public Account() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        AccountOutOfMoney = new HasCard(this);

        accountState = noCard;

        if (cashInAccount < 0) {

            accountState = AccountOutOfMoney;

        }
    }
    void setAccountState(AccountState newAccountState){

        accountState = newAccountState;

    }

    public void setCashInAccount(int newCashInAccount){

        cashInAccount = newCashInAccount;

    }

    public void insertCard(){

        accountState.insertCard();

    }

    public void ejectCard() {

        accountState.ejectCard();

    }

    public void requestCash(int cashToWithdraw) {

        accountState.requestCash(cashToWithdraw);

    }

    public void insertPin(int pinEntered){

        accountState.insertPin(pinEntered);

    }

    public AccountState getYesCardState() { return hasCard; }
    public AccountState getNoCardState() { return noCard; }
    public AccountState getHasPin() { return hasCorrectPin; }
    public AccountState getNoCashState() { return AccountOutOfMoney; }

//    @Override
//    public BankState getBankState() {
//        return null;
//    }
//
//    @Override
//    public int getCashInMachine() {
//        return 0;
//    }

    // NEW STUFF
    @Override
    public AccountState getAccountState() { return accountState; }
    @Override
    public int getCashInAccount() { return cashInAccount; }
}
