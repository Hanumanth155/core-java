class HeadphonesExecutor{
	
	public static void main(String[] args){
		
		double price = Headphones.getPrice();
		System.out.println("The price of Headphones is : " + price);
		
		String brand = Headphones.getBrand();
		System.out.println("The brand is : " + brand);
		
		String number = Headphones.getModelNumber();
		System.out.println("The model number is : " + number);
		
		String type = Headphones.getType();
		System.out.println("The type is : " + type);
		
		boolean wireless = Headphones.getWireless();
		System.out.println("Wireless support : " + wireless);
		
		String battery = Headphones.getBatteryLife();
		System.out.println("Battery life : " + battery);
		
		String color = Headphones.getColor();
		System.out.println("Color : " + color);
		
	}
}
