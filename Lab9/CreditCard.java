package Git.Gitee.javalab.Lab9;

public class CreditCard {
    /**
     * Task #3 1.
     * It should
     * have data fields that include an owner of type Person, a balance of type Money,
     * and a creditLimit of type Money.
     */
    private Money balance;
    private Money creditLimit;
    private Person owner;

    /**
     * Task #3 2.
     * It should have a constructor that has two parameters, a Person to initialize the
     * owner and a Money value to initialize the creditLimit. The balance can be
     * initialized to a Money value of zero. Remember you are passing in objects (pass
     * by reference), so you have passed in the address to an object. If you want your
     * CreditCard to have its own creditLimit and balance, you should create a new
     * object of each using the copy constructor in the Money class.
     *
     * @param newCardHolder
     * @param limit
     */
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = limit;
        // The balance can be
        //initialized to a Money value of zero
        if (this.balance == null) {
            this.balance = new Money(0.0);
        }
    }

    /**
     * It should have accessor methods to get the balance and the available credit. Since
     * these are objects (pass by reference), we don’t want to create an insecure credit
     * card by passing out addresses to components in our credit card, so we must return
     * a new object with the same values. Again, use the copy constructor to create a
     * new object of type money that can be returned.
     */
    public Money getBalance() {
        return new Money(this.balance);
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    /**
     * Task #3 4
     * It should have an accessor method to get the information about the owner, but in
     * the form of a String that can be printed out. This can be done by calling the
     * toString method for the owner (who is a Person).
     *
     * @return string
     */
    public String getPersonals() {
        return owner.toString();
    }

    /**
     * Task #3 5. It should have a method that will charge to the credit card by adding the amount
     * of Money in the parameter to the balance if it will not exceed the credit limit. If
     * the credit limit will be exceeded, the amount should not be added, and an error
     * message can be printed to the console.
     */
    public void charge(Money amount) {
        if (this.creditLimit.compareTo(this.balance.add(amount)) > 0) {
            balance = this.balance.add(amount);
        } else {
            System.out.println("Exceeds credit limit");
            System.exit(0);
        }
    }

    /**
     * Task #3 6. It should have a method that will make a payment on the credit card by
     * subtracting the amount of Money in the parameter from the balance.
     */
    public void payment(Money amount) {
        this.balance.subtract(amount);
    }
}
