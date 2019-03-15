//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.junit.BeforeClass;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.stationarybackend.dao.UserDao;
//import com.niit.stationarybackend.model.User;
//
//
//public class UserDaoUnitTestCase {
//
//	static UserDao userDao;
//	
//	@BeforeClass
//	public static void executeFirst()
//	{
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//		context.scan("com.niit");
//		context.refresh();
//		
//		userDao=(UserDao)context.getBean("userDao");		
//	}
//	
//	@Ignore
//	@Test
//	public void createUserUnitTest()
//	{
//		User user=new User();
//		user.setU_Name("Nivetha");
//		user.setU_Emailid("nivi@gmail.com");
//		user.setU_password("nivi");
//		user.setU_Phonenumber("9597238269");
//		System.out.println("inserted successfully");
//	
//		
//		assertTrue("problem in adding the User", userDao.createUser(user));
//	}
//	@Ignore
//	@Test
//	public void updateUserUnitTest()
//	{
//		User user=userDao.selectOneUser(7);
//		user.setU_Name("Nivetha Palanisamy");
//		user.setU_Emailid("nivi1519@gmail.com");
//		user.setU_password("nivinivi");
//		user.setU_Phonenumber("9597238269");
//		assertTrue("problem in updating the User", userDao.updateUser(user));
//		
//	}
//
//	
//	@Test
//	public void deleteUserUnitTest()
//	{
//		User user=userDao.selectOneUser(7);
//		
//		assertTrue("problem in deleting the User", userDao.deleteUser(user));
//	}
//	
//	@Ignore
//	@Test
//	public void selectAllUserUnitTest()
//	{
//		List<User> listUser=userDao.selectAllUser();
//		
//		assertTrue("Problem in Listing User ",listUser.size()>0);
//		
//		for(User user:listUser)
//		{
//			System.out.println(user.getU_Name());
//			System.out.println("\t"+user.getU_Phonenumber());
//			System.out.println("\t"+user.getU_Emailid());
//			System.out.println("\t"+user.getU_password());
//			
//			
//		}
//	}
//
//}
