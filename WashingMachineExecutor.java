class WashingMachineExecutor{
	
	public static void main(String[] args){
		
		double price = WashingMachine.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = WashingMachine.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = WashingMachine.getModelNumber();
		System.out.println("Model number : " + number);
		
		String type = WashingMachine.getType();
		System.out.println("Type : " + type);
		
		String capacity = WashingMachine.getCapacity();
		System.out.println("Capacity : " + capacity);
		
		int rating = WashingMachine.getStarRating();
		System.out.println("Star rating : " + rating);
		
		boolean inverter = WashingMachine.getInverterTechnology();
		System.out.println("Inverter Technology : " + inverter);
		
		String color = WashingMachine.getColor();
		System.out.println("Color : " + color);
		
	}
}
