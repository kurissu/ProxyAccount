public class AccountProxy implements GetAccountData {
    // Allows the user to access getATMState in the
    // Object ATMMachine

    public AccountState getAccountState() {

        Account realAccount = new Account();

        return realAccount.getAccountState();
    }

    // Allows the user to access getCashInMachine
    // in the Object ATMMachine

    public int getCashInAccount() {

        Account realAccount = new Account();

        return realAccount.getCashInAccount();

    }
}
