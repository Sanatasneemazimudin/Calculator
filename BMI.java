import java.lang.*;
import java.util.Scanner;
class BMI
{
      public static void main(String[] args)
      { 
             System.out.println("Sana Tasneem Azimudin-2024503007");
             Scanner s=new Scanner(System.in);
             double kgs,mtrs;
             System.out.println("Enter your weight(in kgs) and height (in meter):");
             kgs=s.nextDouble();
             mtrs=s.nextDouble();
             double bmi=kgs/(mtrs*mtrs);
             if(18.5<=bmi&&bmi<25)
             {
               System.out.println("Your Body mass index is normal.");
               System.out.println("Weight:"+kgs+"kgs");
               System.out.println("Height:"+mtrs+"meters");
             }
             else
             { 
                 System.out.println("Your Body mass index is not normal.");
                 System.out.println("Weight:"+kgs+"kgs");
                 System.out.println("Height:"+mtrs+"meters");
             }
      }
}  
     








