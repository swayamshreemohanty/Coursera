import java.util.*;

public class Coursera_Alogirthm_Quiz_Assignment 
{
    
    public static void series()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number for the sequence:");
        int N= input.nextInt();

        int variable= -N*N;

        for(int i=1; i<=(3*N);i++)
        {
            System.out.printf("%d ",variable);
            variable=(variable+(2*i))-1;
        }
        input.close();
        //System.out.println("Result is: "+variable);
    }

    public static void main(String[]args)
    {
        series();
    }
}
