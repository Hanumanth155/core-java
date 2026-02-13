class MouseExecutor{
	
	public static void main(String[] args){
		
		double price = Mouse.getPrice();
		System.out.println("The price of Mouse is : " + price);
		
		String brand = Mouse.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = Mouse.getModelNumber();
		System.out.println("Model number : " + number);
		
		String type = Mouse.getType();
		System.out.println("Type : " + type);
		
		boolean wireless = Mouse.getWireless();
		System.out.println("Wireless support : " + wireless);
		
		String color = Mouse.getColor();
		System.out.println("Color : " + color);
		
	}
}
