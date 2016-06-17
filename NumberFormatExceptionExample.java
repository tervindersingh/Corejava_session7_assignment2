public class NumberFormatExceptionExample
{
	public static void main(String args[])
	{
		try
		{
		String str="Hello";
		int num=Integer.parseInt(str);
		System.out.println("Number is "+num);
		}
		catch (NumberFormatException e)
		{
		System.out.println("Text can not be converted into number");
		}
		finally
		{
		System.out.println("We have implemented exception to check whether we are doing right type casting");
		}
 	
	}
}
		