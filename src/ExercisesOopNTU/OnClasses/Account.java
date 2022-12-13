package ExercisesOopNTU.OnClasses;

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    private int amount;


    public Account(String id, String name){
        this.id     = id;
        this.name   = name;
    }

    public Account(String id, String name, int balance){
        this.id         = id;
        this.name       = name;
        this.balance    = balance;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        balance = getBalance() + amount;
            return balance;
    }

    public int debit(int amount){
        if(amount <= balance){
            balance = balance - amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
            return balance;
    }

    public int transferTo(Account account, int amount){
        if (amount <= getBalance()){
            account.balance = account.getBalance() + amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString(){
        return "Account[id="+ getId() + ", name="+ getName() + ", name="+ getBalance() +"]";
    }


}
