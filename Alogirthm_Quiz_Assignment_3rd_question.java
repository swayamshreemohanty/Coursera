import java.util.*;

public class Alogirthm_Quiz_Assignment_3rd_question
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
    }

    public static void main(String[]args)
    {
        series();
    }
}
