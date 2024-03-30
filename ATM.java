import java.util.Scanner;

public class ATM {
    private int pin;
    private double balance;
    private boolean exit;

    public ATM (int a){
        this.pin = a;
        this.balance = 0;
        this.exit = false;
    }

    public int choices(Scanner scanner){
        System.out.println("Please Enter What Do You Want To Do : 1 for withdrawal, 2 for deposit, 3 for balance check");
        int choice = scanner.nextInt();
        return choice;
    }

    public void withdrawal(Scanner scanner){
        System.out.println("Please Enter the amount:");
        int n = scanner.nextInt();
        this.balance -= n;
    }

    public void deposit(Scanner scanner){
        System.out.println("Please Enter the amount:");
        int n = scanner.nextInt();
        this.balance += n;
    }

    public void check(){
        System.out.println("The amount of Balance in your account" +"\""+this.pin+"\""+"currently is:" + this.balance);
    }

    public void setExit(Scanner scanner){
        System.out.println("Please Enter Whether you want to exit: true or false");
        this.exit = scanner.nextBoolean();
    }

    public boolean getExit(){
        return this.exit;
    }




    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your Pin/User Name:");
        int pin = scanner.nextInt(); 

        ATM user1 = new ATM(pin);
        boolean exit = user1.getExit();
        while (exit == false){
            int choice = user1.choices(scanner);
            if (choice == 1 ){
                user1.withdrawal(scanner);
            } else if (choice == 2){
                user1.deposit(scanner);
            } else if (choice == 3){
                user1.check();
            }
            user1.setExit(scanner);
            exit = user1.getExit();
        }
        scanner.close();
    }
}
