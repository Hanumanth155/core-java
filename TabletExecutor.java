class TabletExecutor{
	
	public static void main(String[] args){
		
		double price = Tablet.getPrice();
		System.out.println("The price of Tablet is : " + price);
		
		String brand = Tablet.getBrand();
		System.out.println("The brand is : " + brand);
		
		String number = Tablet.getModelNumber();
		System.out.println("The model number is : " + number);
		
		String size = Tablet.getDisplaySize();
		System.out.println("The display size is : " + size);
		
		String ram = Tablet.getRAM();
		System.out.println("The RAM is : " + ram);
		
		String storage = Tablet.getStorage();
		System.out.println("The storage is : " + storage);
		
		String battery = Tablet.getBatteryCapacity();
		System.out.println("Battery capacity : " + battery);
		
		String color = Tablet.getColor();
		System.out.println("Color : " + color);
		
	}
}
