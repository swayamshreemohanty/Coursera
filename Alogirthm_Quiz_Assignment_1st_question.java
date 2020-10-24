import java.util.Scanner;

public class Alogirthm_Quiz_Assignment_1st_question
{
    public static void sequence ()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter numbers to find the sequence: ");
        int n= input.nextInt();
        int multi=3;
        int length= n+(n+2);
        int sequence=n*3;

        int [] seq= new int[length];
        for(int i=2;i<=length+1;i++)
        {
            System.out.printf("%d ",sequence);
            sequence+=2;
        }
        input.close();
    }
    public static void main(String[]args)
    {
        sequence();
    }

}