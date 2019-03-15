//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.junit.BeforeClass;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.stationarybackend.dao.UserCredDao;
//import com.niit.stationarybackend.model.UserCred;
//
//
//
//public class UserCredDaoUnitTestCase {
//
//	static UserCredDao userCredDao;
//	
//	@BeforeClass
//	public static void executeFirst()
//	{
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//		context.scan("com.niit");
//		context.refresh();
//		
//		userCredDao=(UserCredDao)context.getBean("userCredDao");		
//	}
//	
//	
//	@Test
//	public void createUserCredUnitTest()
//	{
//		UserCred userCred=new UserCred();
//		userCred.setU_Emailid("nivi@gmail.com");
//		userCred.setU_Password("nivi");
//		userCred.setU_role("user");
//		userCred.setU_status("xxx");
//		
//		assertTrue("problem in adding the UserCred", userCredDao.createUserCred(userCred));
//	}
//	@Ignore
//	@Test
//	public void updateUserCredUnitTest()
//	{
//		UserCred userCred=userCredDao.selectOneUserCred("nivi@gmail.com");
//		userCred.setU_Emailid("nivipal@gmail.com");
//		userCred.setU_Password("nivi123");
//		userCred.setU_role("user");
//		userCred.setU_status("yyy");
//		
//		assertTrue("problem in updating the UserCred", userCredDao.updateUserCred(userCred));
//		
//	}
//
//	@Ignore
//	@Test
//	public void deleteUserCredUnitTest()
//	{
//		UserCred userCred=userCredDao.selectOneUserCred("nivi@gmail.com");
//		
//		assertTrue("problem in deleting the UserCred", userCredDao.deleteUserCred(userCred));
//	}
//	
//	@Ignore
//	@Test
//	public void selectAllUserCredUnitTest()
//	{
//		
//		List<UserCred> listUserCred=userCredDao.selectAllUserCred();
//		
//		assertTrue("Problem in Listing UserCred ",listUserCred.size()>0);
//		
//		for(UserCred userCred:listUserCred)
//		{
//			System.out.println(userCred.getU_Emailid());
//			System.out.println("\t"+userCred.getU_Password());
//			System.out.println("\t"+userCred.getU_role());
//			System.out.println("\t"+userCred.getU_status());
//			
//		}
//	}
//}
