package main.driver;
import main.model.Product;
import main.service.ProductService;


public class Driver {
	
	public static void main(String[] args) {
		Product apple = new Product(12345);
		ProductService.receive(apple, 8, 1);
		ProductService.receive(apple, 2, 3.5);
		ProductService.sell(apple, 2, 2.5);
		ProductService.sell(apple, 4, 3);
		ProductService.sell(apple, 6, 3);
		
		System.out.println(apple.getCost());
		System.out.println(apple.getPrice());
		System.out.println("Quantity in stock: "+apple.getQuantity());
		System.out.println("Profit of selling "
				+apple.getSoldQuantity()+" units is $"
				+ProductService.calculateProfitOrLoss(apple));
		System.out.println("Cost of remaining "
				+apple.getQuantity()+" units is $"
				+ProductService.calculateCostOfStock(apple));
	}

}
