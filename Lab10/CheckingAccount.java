package Git.Gitee.javalab.Lab10;

/**
 * Task #1 2.
 * Create a new class called CheckingAccount that extends BankAccount.
 */
public class CheckingAccount extends BankAccount {
    /**
     * Task #1 3.
     * It should contain a static constant FEE that represents the cost of clearing one
     * check. Set it equal to 15 cents.
     */
    private static double FEE = 0.15;

    /**
     * Task #1 4.
     * Write a constructor that takes a name and an initial amount as parameters. It
     * should call the constructor for the superclass. It should initialize accountNumber
     * to be the current value in accountNumber concatenated with –10 (All checking
     * accounts at this bank are identified by the extension –10). There can be only one
     * checking account for each account number. Remember since accountNumber is a
     * private member in BankAccount, it must be changed through a mutator method.
     */
    public CheckingAccount(String name, double amount) {
        /**
         * It
         * should call the constructor for the superclass
         */
        super(name, amount);
        /**
         *  It should initialize accountNumber
         *  to be the current value in accountNumber concatenated with –10 (All checking
         *  accounts at this bank are identified by the extension –10)
         */
        setAccountNumber(numberOfAccounts + "-10");

    }

    /**
     * Task # 1. 5
     * 5. Write a new instance method, withdraw, that overrides the withdraw method in
     * the superclass. This method should take the amount to withdraw, add to it the fee
     * for check clearing, and call the withdraw method from the superclass. Remember
     * that to override the method, it must have the same method heading. Notice that
     * the withdraw method from the superclass returns true or false depending if it was
     * able to complete the withdrawal or not. The method that overrides it must also
     * return the same true or false that was returned from the call to the withdraw
     * method from the superclass
     */
    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + FEE);
    }
}
