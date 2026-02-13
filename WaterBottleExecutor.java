class WaterBottleExecutor{
	
	public static void main(String[] args){
		
		double price = WaterBottle.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = WaterBottle.getBrand();
		System.out.println("Brand : " + brand);
		
		String capacity = WaterBottle.getCapacity();
		System.out.println("Capacity : " + capacity);
		
		String material = WaterBottle.getMaterial();
		System.out.println("Material : " + material);
		
		String color = WaterBottle.getColor();
		System.out.println("Color : " + color);
		
	}
}
