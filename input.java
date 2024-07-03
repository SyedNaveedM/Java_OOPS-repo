//Here the name afte public class is the name of the file without the java extension
//We use PascalConvention for classes
//We use camelCaseConvention for functions
import java.util.Scanner;
public class input
{
    //Public here is a access modifier which means that the methods can be accessed from anywhere
    //Static allows us to use a function within a class without creating an object of it
    //Void is the return type
    //main is the entry point for our program
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=sc.nextInt();
        System.out.println(2*a);
        
    }
}