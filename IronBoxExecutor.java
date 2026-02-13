class IronBoxExecutor{
	
	public static void main(String[] args){
		
		double price = IronBox.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = IronBox.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = IronBox.getModelNumber();
		System.out.println("Model number : " + number);
		
		String type = IronBox.getType();
		System.out.println("Type : " + type);
		
		int watt = IronBox.getWattage();
		System.out.println("Wattage : " + watt);
		
		String color = IronBox.getColor();
		System.out.println("Color : " + color);
		
	}
}
