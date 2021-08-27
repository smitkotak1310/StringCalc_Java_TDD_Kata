import java.util.Vector;

public class StringCalculator {

	public int Add(String numbers)
	{
		String[] str = numbers.split(",|\n");  
		if(numbers.isEmpty())
		{
			return 0;
		}
		if(numbers.length()==1)
		{

			return StringtoInt(numbers);
		}
		else
		{
			return getSum(str[0],str[1]);
		}
	}
	
	private int getSum(String num1, String num2)
	{
		return Integer.parseInt(num1)+Integer.parseInt(num2);
	}
	
	private boolean isEmpty(String numbers)
	{
		return numbers.isEmpty();
	}
	
	private int StringtoInt(String numbers)
	{
		return Integer.parseInt(numbers);
	}

}
