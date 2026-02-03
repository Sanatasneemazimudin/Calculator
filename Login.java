import java.util.Scanner;
class Login 
{
     public static void main(String args[]) 
     {
        System.out.println("Sana Tasneem Azimudin=2024503007");
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("How many times are you going to login in?");
        int log = s.nextInt();
        for (int i = 0; i < log; i++) 
        {
            System.out.println("Are you the admin?(y/n):");
            char admininput = s.next().charAt(0);
            if (admininput == 'y' || admininput == 'Y') 
            {
                System.out.println("The Password is P");
                System.out.println("Enter the password:");
                char pass = s.next().charAt(0);
                if (pass == 'p' || pass == 'P') 
                {
                    System.out.println("Login successful!");
                } 
                else 
                {
                    count++;
                    System.out.println("Login unsuccessful.");
                }
            }
            else 
            {
                System.out.println("Enter the password:");
                char pass = s.next().charAt(0);
                if ((admininput == 'n' || admininput == 'N') && !(pass == 'p' || pass == 'P')) 
                {
                    System.out.println("Login unsuccessful");
                    count++;
                }
            }
        }
        System.out.println("Number of failed login attempts:"+count);
     }
}






