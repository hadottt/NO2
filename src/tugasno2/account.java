package tugasno2;

public class account {
    private String id;
    private String name;
    private int balance;

    public account(String id, String name){
        this.id = id;
        this.name = name;

    }

    public account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return(this.id);

    }

    public String getName(){
        return (this.name);
    }

    public int getBalance(){
        return(this.balance);
    }

    public int credit(int amount){
        this.balance += amount;
        return (this.balance);
    }

    public int debit(int amount){
        if (amount > this.balance){
            return 0;
        }
        else {
            this.balance -= amount;
            return(this.balance);
        }
    }

    public int transferTo(account akun, int amount){
        if (amount > this.balance){
            return(this.balance);
        }
        else {
            this.balance -= amount;
            akun.balance+= amount;
            return(this.balance);
        }
    }

    public String toString(){
        return("Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]");

    }



}
