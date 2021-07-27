public class TestAccount {
    public static void main(String[] args){

        Account account = new Account();

        account.insertCard();

        account.ejectCard();

        account.insertCard();

        account.insertPin(1234);

        account.requestCash(2000);

        account.insertCard();

        account.insertPin(1234);

        // NEW STUFF : Proxy Design Pattern Code
        // The interface limits access to just the methods you want
        // made accessible

        GetAccountData realAccount = new Account();

        GetAccountData AccountProxy = new AccountProxy();

        System.out.println("\nCurrent ATM State " + AccountProxy.getAccountState());

        System.out.println("\nCash in ATM Machine $" + AccountProxy.getCashInAccount());

        // The user can't perform this action because ATMProxy doesn't
        // have access to that potentially harmful method
        // atmProxy.setCashInMachine(10000);

    }
}
