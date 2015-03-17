package csd.example.rpn.calc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testRpnCalc {
	
	RpnCalc rpnCalc;
	
	@Before
	public void setUp()
	{
		rpnCalc=new RpnCalc();
	}
	@Test
	public void AddWithTwoSameValue()
	{
		assertEquals(4.0, rpnCalc.Calculate("2 2 +"),0.00);
	}
	@Test
	public void AddWithtwoDifferentValue()
	{
		assertEquals(5.0, rpnCalc.Calculate("2 3 +"),0.00);
	}

}
