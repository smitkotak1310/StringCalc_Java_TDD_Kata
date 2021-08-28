import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestingStingCalculator {
	
	StringCalculator strcalc = new StringCalculator();
	
	@Test
	public void zeroOnEmpty()
	{
		assertEquals(0,strcalc.Add(""));
	}
	
	@Test
	public void returnSumOnTwoArgsDelimitedByComma()
	{
		assertEquals(3, strcalc.Add("1,2"));
	}
	
	@Test
	public void handleunknown()
	{
		assertEquals(45, strcalc.Add("1,2,3,4,5,6,7,8,9"));
	}
	
	@Test
	public void newLineAsValidDelimiter()
	{
		assertEquals(6,strcalc.Add("1\n2,3"));
	}
	
	@Test
	public void allowCustomDelimeterinsideString()
	{
		assertEquals(3, strcalc.Add("//;\n1;2"));
	}
	
	
}
