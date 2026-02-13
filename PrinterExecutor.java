class PrinterExecutor{
	
	public static void main(String[] args){
		
		double price = Printer.getPrice();
		System.out.println("The price of Printer is : " + price);
		
		String brand = Printer.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = Printer.getModelNumber();
		System.out.println("Model number : " + number);
		
		String type = Printer.getType();
		System.out.println("Type : " + type);
		
		boolean wifi = Printer.getWifiSupport();
		System.out.println("Wifi support : " + wifi);
		
		String color = Printer.getColor();
		System.out.println("Color : " + color);
		
	}
}
