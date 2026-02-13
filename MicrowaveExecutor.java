class MicrowaveExecutor{
	
	public static void main(String[] args){
		
		double price = Microwave.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = Microwave.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = Microwave.getModelNumber();
		System.out.println("Model number : " + number);
		
		String capacity = Microwave.getCapacity();
		System.out.println("Capacity : " + capacity);
		
		String type = Microwave.getType();
		System.out.println("Type : " + type);
		
		int power = Microwave.getPower();
		System.out.println("Power : " + power + "W");
		
		String color = Microwave.getColor();
		System.out.println("Color : " + color);
		
	}
}
