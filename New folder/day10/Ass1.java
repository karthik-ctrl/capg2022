package account1.lambda;
@FunctionalInterface
interface checkNumberType
{
	 public  int checkNumberType(int number);
	 
	 
}


public class Ass1 {
	public static boolean NumberTypeisOdd(int n)
	{
		if(n%2==0) {
			System.out.println(n+"is not odd");
			return false;
		}
			
		else
			{
			System.out.println(n+"is odd");return true;
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkNumberType c1=(n)->
		{
			
		return n;
		
		};
		System.out.println(NumberTypeisOdd(c1.checkNumberType(77)));
	
		
		
		
		
	}

}
