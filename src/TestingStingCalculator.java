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
	
	
}
