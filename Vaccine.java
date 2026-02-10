import java.util.Scanner;
class Vaccine
{
     public static void main(String args[])
     {
        System.out.println("Sana Tasneem Azimudin-2024503007");
        Scanner sc=new Scanner(System.in);
        int age,appno;
        System.out.println("Enter your age:");
        age= sc.nextInt();
        if(age>18 && age<=65)
        {
            System.out.println("Candidate is eligable for the vaccine");
            System.out.println("Enter the appointment number=");
            appno=sc.nextInt();
            if(appno>99||appno<999)
            {
                int lastno=appno%10;
                switch(lastno)
                {
                    case 1:
                           System.out.println("Gift:Pen");
                           break;
                    case 2:
                           System.out.println("Gift: Mask");
                           break;
                    case 3:
                           System.out.println("Gift: Sanitizer");
                           break;
                    default:
                           System.out.println("No gift");
                           break;
                }
            }
            else
            {
                System.out.println("Appointment number is not three digits");
            }
            
        }
        else
        {
            System.out.println("Candidate is not eligible for the vaccine.");
}
}

}



