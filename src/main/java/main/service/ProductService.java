package main.service;
import java.util.Map;
import main.model.Product;

public class ProductService {

	public static void receive(Product product,int quantity, double cost) {
		product.setQuantity(product.getQuantity() + quantity);
		product.setCost(quantity,cost);
	}
	
	public static void sell(Product product, int quantity, double price) {
		if(quantity <= product.getQuantity()) {
			product.setQuantity(product.getQuantity() - quantity);
			product.setPrice(quantity,price);
			product.setSoldQuantity(product.getSoldQuantity() + quantity);
		} else {
			System.out.println("The quantity is not enough.");
		}
		
	}
	public static int currentStock(Product product) {
		return product.getQuantity();
	}
	
	public static double calculateProfitOrLoss(Product product) {
		double diff;
		double totalCost = 0.0;
		double totalPrice = 0.0;
		int totalQuantity=0;
		double avgCost ;
		for (Map.Entry< Integer, Double> entry : product.getCost().entrySet()) {
		       totalCost += entry.getKey() * entry.getValue();
		       totalQuantity += entry.getKey();
		    }
		avgCost = totalCost/totalQuantity;
		for (Map.Entry< Integer, Double> entry : product.getPrice().entrySet()) {
		       totalPrice += entry.getKey() * (entry.getValue()-avgCost);
		    }
		
		diff = totalPrice;
		
		return diff;
	}
	
	public static double calculateCostOfStock(Product product) {
		double totalCost = 0.0;
		double avgCost ;
		int totalQuantity=0;
		for (Map.Entry< Integer, Double> entry : product.getCost().entrySet()) {
		       totalCost += entry.getKey() * entry.getValue();
		       totalQuantity += entry.getKey();
		    }
		avgCost = totalCost/totalQuantity;
		double unsoldStockCost = avgCost * product.getQuantity();
		return unsoldStockCost;
	}
	
}
