//
//
//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.junit.BeforeClass;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.stationarybackend.dao.CategoryDao;
//import com.niit.stationarybackend.dao.ProductDao;
//import com.niit.stationarybackend.model.Category;
//import com.niit.stationarybackend.model.Product;
//
//
//
//public class ProductDaoUnitTestCase {
//
//	static ProductDao productDao;
//	
//	@BeforeClass
//	public static void executeFirst()
//	{
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//		context.scan("com.niit");
//		context.refresh();
//		
//		productDao=(ProductDao)context.getBean("productDao");		
//	}
//	
//	@Ignore
//	@Test
//	public void createProductUnitTest()
//	{
//		Product product=new Product();
//		product.setProd_name("ClassMate Note");
//		product.setProd_description("80 pages");
//		//product.setCategory(Category);
//		product.setProd_price(20.00f);
//		product.setProd_quantity(10);
//		
//		
//		assertTrue("problem in adding the Product", productDao.createProduct(product));
//	}
//	@Ignore
//	@Test
//	public void updateProductUnitTest()
//	{
//		Product product=productDao.selectOneProduct(8);
//		product.setProd_name("ClassMate Note");
//		product.setProd_description("120 pages");
//		//product.setCategory(Category);
//		product.setProd_price(40.00f);
//		product.setProd_quantity(15);
//		
//		assertTrue("problem in updating the Product", productDao.updateProduct(product));
//		
//	}
//
//	@Ignore
//	@Test
//	public void deleteProductyUnitTest()
//	{
//		Product product=productDao.selectOneProduct(3);
//		
//		assertTrue("problem in deleting the Product", productDao.deleteProduct(product));
//	}
//	
//	
//	@Test
//	public void selectAllProductUnitTest()
//	{
//		List<Product> listProducts=productDao.selectAllProduct();
//		
//		assertTrue("Problem in Listing Product ",listProducts.size()>0);
//		
//		for(Product product:listProducts)
//		{
//			System.out.println(product.getProd_name());
//			System.out.println("\t"+product.getCategory());
//			System.out.println(product.getProd_description());
//			System.out.println("\t"+product.getProd_price());
//			System.out.println("\t"+product.getProd_quantity());
//			
//		}
//	}
//
//}
