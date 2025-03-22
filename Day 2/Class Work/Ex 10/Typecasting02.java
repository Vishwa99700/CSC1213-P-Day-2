public class Typecasting02{
	public static void main(String[] args){
		int num = 5004;
		
		double doubleNum = (double) num;
		
		System.out.println("The value of "+num+ " after converting to the double is " +doubleNum);
		int convertingInt = (int) doubleNum;
		System.out.println("The Value Of " + doubleNum + " after coverting to  the int again is "+convertingInt);
	}
}