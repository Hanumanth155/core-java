class WaterPurifierExecutor{
	
	public static void main(String[] args){
		
		double price = WaterPurifier.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = WaterPurifier.getBrand();
		System.out.println("Brand : " + brand);
		
		String type = WaterPurifier.getPurificationType();
		System.out.println("Purification type : " + type);
		
		String capacity = WaterPurifier.getCapacity();
		System.out.println("Capacity : " + capacity);
		
		boolean shutoff = WaterPurifier.getAutoShutOff();
		System.out.println("Auto shut off : " + shutoff);
		
		String color = WaterPurifier.getColor();
		System.out.println("Color : " + color);
		
	}
}
