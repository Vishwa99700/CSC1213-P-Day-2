import java.util.Scanner;
class Ex05{
	public static void main(String args[]){
		String fname;
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter Your first Name ");
		fname= sc.nextLine();
		
		System.out.println("Enter Your Last Name ");
		String lname= sc.nextLine();
		
		System.out.println("Enter Registation Number ");
		String Regno= sc.nextLine();
		
		System.out.println("Enter Your Mark ");
		int mark= sc.nextInt();
		
		System.out.println("Enter Your Age ");
		int age= sc.nextInt();
		
		System.out.println("Enter Your Sex ");
		char sex= sc.next().charAt(0);
		
		System.out.println("Enter Your Mobile Number ");
		long num= sc.nextLong();
		
		System.out.println("Enter Your GPA ");
		double gpa= sc.nextDouble();
		
		System.out.println("Fullname "+fname+" "+lname+ "\n"+ "Registation Number "+Regno+ "\n"+"Marks is "+mark+"\n"+"Age is "+age+"\n"+"SEX is "+sex+ "\n"+
		"Mobile Number "+num+"\n"+"GPA "+gpa);
	}
}