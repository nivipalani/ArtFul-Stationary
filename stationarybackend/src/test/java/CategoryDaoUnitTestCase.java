//import static org.junit.Assert.assertTrue;
//
//import java.util.List;
//
//import org.junit.BeforeClass;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.stationarybackend.dao.CategoryDao;
//import com.niit.stationarybackend.model.Category;
//
//public class CategoryDaoUnitTestCase {
//	
//	static CategoryDao categoryDao;
//	
//	@BeforeClass
//	public static void executeFirst()
//	{
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//		context.scan("com.niit");
//		context.refresh();
//		
//		categoryDao=(CategoryDao)context.getBean("categoryDao");		
//	}
//	
//	
//	@Test
//	public void createCategoryUnitTest()
//	{
//		Category category=new Category();
//		category.setCat_Name("Scale");
//		category.setCat_Description("Long Size(15 cm) ");
//		
//		assertTrue("problem in adding the category", categoryDao.createCategory(category));
//	}
//	@Ignore
//	@Test
//	public void updateCategoryUnitTest()
//	{
//		Category category=categoryDao.selectOneCategory(1);
//		category.setCat_Description("Ruled and Unruled notes");
//		
//		assertTrue("problem in updating the category", categoryDao.updateCategory(category));
//		
//	}
//
//	@Ignore 
//	@Test
//	public void deleteCategoryUnitTest()
//	{
//		Category category=categoryDao.selectOneCategory(3);
//		
//		assertTrue("problem in deleting the category", categoryDao.deleteCategory(category));
//	}
//	
//	@Ignore
//	@Test
//	public void selectAllCategoryUnitTest()
//	{
//		List<Category> listCategories=categoryDao.selectAllCategory();
//		
//		assertTrue("Problem in Listing Category ",listCategories.size()>0);
//		
//		for(Category category:listCategories)
//		{
//			System.out.println(category.getCat_Id());
//			System.out.println("\t"+category.getCat_Name());
//			System.out.println("\t"+category.getCat_Description());
//			
//		}
//	}
//	
//	
//	
//	
//	
//}
