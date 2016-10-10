public class BalancedString extends FancyCounter
{
	public static String str;
	FancyCounter counter = new FancyCounter();
	
	
	public BalancedString()
	{
			str = "";
			super.setToZero();
	}
	
	public BalancedString(String s)
	{
		str = s;
		super.setToZero();
	}
	
	public boolean balanced()
	{
		//int unbalancedParenthesis = 0;
		char []charArray = new char[str.length()];
		str.getChars(0,str.length(),charArray,0);
		
		//System.out.println(counter);
		
		for(char character: charArray)
			{
				if(character == '(')
					super.incrementCounter();
					//unbalancedParenthesis++;
				if(character == ')')
					super.decrementCounter();
					//unbalancedParenthesis--;
			}
			
		if(super.counter == 0)
			return true;
		else 
			return false;
			
			
	}
	
}

