package testcases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class UnderstandingAssertions {
	
	@Rule
	public ErrorCollector errCollector = new ErrorCollector();
	
	@Test
	public void FriendlistFaceooktest(){
		
		int actual_total_friends=100;
		int expected_total_friends=101; //from xlsx file
		
//		if(actual_total_friends == expected_total_friends){
//			System.out.println("Pass");
//		}else{
//			System.out.println("Fail");
//		}
		
		System.out.println("A");
		try{
			Assert.assertEquals(expected_total_friends, actual_total_friends);
			System.out.println("B");
		}catch(Throwable t){
			System.out.println("Error Encountered");
			//java code - report error
			errCollector.addError(t);
		}
		System.out.println("C");
			
		try{
			Assert.assertEquals("A", "B");
		}catch(Throwable t){
			System.out.println("Error Encountered");
			//java code - report error
			errCollector.addError(t);
		}
		
		Assert.assertTrue("error msg", 4>3);
		
	}
	
	
	

}
