package driver;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.model.Product;
import main.service.ProductService;


public class TestProduct {
	
	@Test
	@DisplayName("Testing product setter")
	public void testSetter()
	{
		Product prod = new Product(123450);
		prod.setCost(10, 100.0);
		assertEquals(100.0, prod.getCost().get(10));
	}
	
	@Test
	@DisplayName("Testing cost of stock")
	public void testCalculateCostOfStock()
	{
		Product prod = new Product(123450);
		
		prod.setCost(10, 100.0);
		prod.setPrice(10, 1000.0);
		prod.setQuantity(10);
		prod.setSoldQuantity(10);
	
		assertEquals(1000.0, ProductService.calculateCostOfStock(prod));
		
	}
	
	@Test
	@DisplayName("Testing Profit or Loss")
	public void testProfitOrLoss()
	{
		Product prod = new Product(123450);
		
		prod.setCost(10, 100.0);
		prod.setPrice(10, 1000.0);
		prod.setQuantity(10);
		prod.setSoldQuantity(10);
		
		assertEquals(9000.0, ProductService.calculateProfitOrLoss(prod));
	}
	
	@Test
	@DisplayName("Testing current stock")
	public void testCurrentStock()
	{
		Product prod = new Product(123450);
		
		prod.setQuantity(10);
		
		assertEquals(10, ProductService.currentStock(prod));
	}
	
	@Test
	@DisplayName("Test set price")
	public void testSetPrice()
	{
		Product prod = new Product(123450);
		
		prod.setPrice(10, 100.0);
		
		assertEquals(100.0, prod.getPrice().get(10));
	}

}
