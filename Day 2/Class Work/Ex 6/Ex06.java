import java.util.Scanner;
class Ex06{
	public static void main(String args[]){
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num1=ob.nextInt();
		if(num1%2==0)
		{
			System.out.println("The Number is even Number ");
		}
		else
		{
			System.out.println("The Number is Odd Number ");
		}
	}
}