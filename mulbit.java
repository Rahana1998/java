import java.util.Scanner;
class multibitwise
{
    public static void main(String[]args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        n=s.nextInt();
        int mul=n<<2;
        System.out.println("Answer: "+mul);
    }
}