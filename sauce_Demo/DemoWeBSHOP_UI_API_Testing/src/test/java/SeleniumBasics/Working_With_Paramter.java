package SeleniumBasics;

import org.testng.annotations.Test;

public class Working_With_Paramter {
	int a=5;
	int b=7;
	int sum;
	
	@Test
	public void add() {
		sum=a+b;
		System.out.println("Sum"+sum);
		
	}
}

