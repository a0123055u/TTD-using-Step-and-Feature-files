package src.test.java;
import static org.junit.Assert.*;



import org.junit.Test;
public class RpnCalTest {
	RpnCalculator rpnCalculator = new RpnCalculator();

//	@Test
//	public void test() {
//	//fail("Not yet implemented");
//		
//		
//	}
	String string = "1,2,3,+";
	@Test
	public void testRpnCalculator1(){

	//given:
	String string1 = "2,3,4,+,-";

	//when:
	double result = rpnCalculator.simpleAdd(string1);

	//then:
	assertEquals(result,-5,0.0);

	}

	@Test
	public void testRpnCalculator2(){

	//given:
	String string2 = "2,3,4,*,-";


	//when:
	double result = rpnCalculator.simpleAdd(string2);

	//then:
	assertEquals(result, -10,0.0);

	}

	@Test
	public void testRpnCalculator3(){

	//given:
	String string2 = "2,8,4,/,+";


	//when:
	double result = rpnCalculator.simpleAdd(string2);

	//then:
	assertEquals(result, 4,0);

	}

	@Test
	public void testRpnCalculator4(){

	//given:
	String string2 = "20,2,5,*,/";


	//when:
	double result = rpnCalculator.simpleAdd(string2);

	//then:
	assertEquals(2.0,result,0.0);

	}
	

}


