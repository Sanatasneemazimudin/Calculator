import java.util.Scanner;
class Bank
{
    static int totalAccounts = 0;
    int accountNumber;
    float balance;
    float deposit;
    int amount;
    Bank(float balance, int accountNumber) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(int amount)
    {
        deposit = balance + amount;
    }

    void display() 
    {
        System.out.println("The Total accounts created are: " + totalAccounts);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Deposit: " + deposit);
    }
    public static void main(String[] args) 
    {
        System.out.println("Sana Tasneem Azimudin-2024503007");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of accounts:");
        totalAccounts = s.nextInt();
        for (int i = 0; i < totalAccounts; i++)
        {
            float balance;
            int accountNumber;
            int amoo;
            System.out.println("Enter the Account number:");
            accountNumber = sc.nextInt();
            System.out.println("Enter the Balance:");
            balance = sc.nextFloat();
            System.out.println("Enter amount:");
            amoo = sc.nextInt();
            Bank obj = new Bank(balance, accountNumber);
            obj.deposit(amoo);
            obj.display();
        }

    }
}

