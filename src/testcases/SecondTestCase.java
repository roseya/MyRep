package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTestCase {
// can search for Junit 4 annotations to learn(annotations methods are only in Junit 4 not in Junit3)
//	@Test
//	@Ignore
//	@After
//	@Before
//	@BeforeClass
//	@AfterClass
	
	public static boolean checkLogin(){
		return false;
		//true - success
		
	}
	
	
	@BeforeClass //have to be static, execute before the whole tests
	public static void beginning(){

		System.out.println("*********************beginning**********************");
//		Assume.assumeTrue(checkLogin());  //false - skip all the tests in this file

	}
	
	@AfterClass  //have to be static, execute after the whole tests
	public static void ending(){
		System.out.println("*********************ending**********************");
	}
	
	
	@Before   //execute before each test
	public void openBrowser(){
//		open browser - selenium
		System.out.println("opening the browser");

	}
	
	
	@After //execute after each test
	public void closeBrowser(){
//		close the browser - selenium
		System.out.println("closing the browser");

	}
	
	@Test 
	public void sendEmialTest(){
		System.out.println("Testing Sending email");
	
	}
	
	@Test 
	public void sendMessageTest(){
		System.out.println("Testing Sending Message");
	}
	
	


}
