class SmartphoneExecutor{
	
	public static void main(String[] args){
		
		double price = Smartphone.getPrice();
		System.out.println("The price of Smartphone is : " + price);
		
		String brand = Smartphone.getBrand();
		System.out.println("The brand of Smartphone is : " + brand);
		
		String number = Smartphone.getModelNumber();
		System.out.println("The model number is : " + number);
		
		String name = Smartphone.getModelName();
		System.out.println("The model name is : " + name);
		
		String size = Smartphone.getDisplaySize();
		System.out.println("The display size is : " + size);
		
		String processor = Smartphone.getProcessor();
		System.out.println("The processor is : " + processor);
		
		String ram = Smartphone.getRAM();
		System.out.println("The RAM is : " + ram);
		
		String storage = Smartphone.getStorage();
		System.out.println("The storage is : " + storage);
		
		String battery = Smartphone.getBatteryCapacity();
		System.out.println("The battery capacity is : " + battery);
		
		String color = Smartphone.getColor();
		System.out.println("The color is : " + color);
		
	}
}
