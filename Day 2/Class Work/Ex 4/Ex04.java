import java.util.Scanner;
class Ex04{
	public static void main(String args[]){
		String fname;
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter Your first Name ");
		fname= sc.nextLine();
		
		System.out.println("Enter Your Last Name ");
		String lname= sc.nextLine();
		
		System.out.println("Enter Your Mark ");
		int mark= sc.nextInt();
		
		System.out.println("Fullname "+fname+" "+lname+ "\n"+"Marks is "+mark);
	}
}