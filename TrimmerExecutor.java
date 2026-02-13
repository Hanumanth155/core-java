class TrimmerExecutor{
	
	public static void main(String[] args){
		
		double price = Trimmer.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = Trimmer.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = Trimmer.getModelNumber();
		System.out.println("Model number : " + number);
		
		String runtime = Trimmer.getBatteryRuntime();
		System.out.println("Battery runtime : " + runtime);
		
		boolean waterproof = Trimmer.getWaterproof();
		System.out.println("Waterproof : " + waterproof);
		
		String color = Trimmer.getColor();
		System.out.println("Color : " + color);
		
	}
}
