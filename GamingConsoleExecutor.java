class GamingConsoleExecutor{
	
	public static void main(String[] args){
		
		double price = GamingConsole.getPrice();
		System.out.println("The price of Gaming Console is : " + price);
		
		String brand = GamingConsole.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = GamingConsole.getModelNumber();
		System.out.println("Model : " + number);
		
		String storage = GamingConsole.getStorage();
		System.out.println("Storage : " + storage);
		
		boolean support = GamingConsole.get4KSupport();
		System.out.println("4K support : " + support);
		
		String color = GamingConsole.getColor();
		System.out.println("Color : " + color);
		
	}
}
