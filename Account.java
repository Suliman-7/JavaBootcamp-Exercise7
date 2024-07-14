public class Account {

    private String id;
    private String name;
    private int balance = 0;


    public Account(String id, String name) {

        this.id = id;
        this.name = name;

    }


    public Account(String id, String name, int balance) {

        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }



    public int credit(int amount) {
        this.balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if( this.balance >= amount ) {
            this.balance -= amount;
            return balance;
        }else
            System.out.println("Insufficient balance");
            return balance;
    }

    public int transferTo(Account another, int amount) {
        if( this.balance >= amount ) {
            this.balance -= amount;
            another.credit(amount);
            return balance;

        }else{
            System.out.println("Insufficient balance");
            return balance;
        }
    }

    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }








}
