package Shivam_Maven.CRM;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login1Test {
	@Test
	public void getuser() {
		System.out.println(" Login1Test TC -- gtuser function");
	}
	
	@Test
	public void setuser() {
		System.out.println(" Login1Test TC -- SetUser function");
	}
	@BeforeSuite
	public void setPro() {
		System.out.println(" *** This is Before Suite Tag *** ");
	}
}
