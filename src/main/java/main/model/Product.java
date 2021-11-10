package main.model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Product {
	private int sku;
	private int quantity;
	private Map<Integer,Double> cost = new HashMap<>();
	private Map<Integer,Double> price = new HashMap<>();
	int soldQuantity;
	public int getSoldQuantity() {
		return soldQuantity;
	}
	public void setSoldQuantity(int soldQuantity) {
		this.soldQuantity = soldQuantity;
	}
	public Product(int sku) {
		super();
		this.sku = sku;
	}
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Map<Integer,Double> getCost() {
		return cost;
	}
	public void setCost(int quantity,double cost) {
		this.cost.put(quantity,cost);
	}
	public Map<Integer,Double> getPrice() {
		return price;
	}
	public void setPrice(int quantity,double price) {
		this.price.put(quantity,price);
	}
}
