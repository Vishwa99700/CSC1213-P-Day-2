class Ex02{
	public static void main(String args[]){
		String Name, Address,DOB,sex;
		int Age;
		name =args[0];
		Address=args[1];
		DOB=args[2];
		sex=args[3];
		Age=Integer.parseInt(args[4]);
		
		int a=10;
		int b=a=Age;
		
		
		System.out.println("Name : "+Name+"\n"+"Address : "+Address+"\n"+"Date of Birth : "+DOB+"\n"+"Sex : "+sex+"\n"+"Age : "+Age);
	}
}