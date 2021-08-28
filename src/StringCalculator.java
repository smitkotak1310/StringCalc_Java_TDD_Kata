import java.util.Vector;

public class StringCalculator {

	public int Add(String numbers)
	{
		
		String[] str = numbers.split(",");
		String delimiter = ",";
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
			
			if (numbers.matches("//(.*)\n(.*)")) 
			{
                delimiter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }
			String[] numList = split(numbers, delimiter + "|\n");
            return getSum(numList);
		}
	}
	
	private String[] split(String numbers, String div) {
        return numbers.split(div);
    }
	
	private int getSum(String[] num)
	{
		int totalsum = 0;
        for (String number : num) 
        {
        	
	           totalsum += StringtoInt(number);
	    }


	        return totalsum;
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
