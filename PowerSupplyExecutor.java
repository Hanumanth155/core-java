class PowerSupplyExecutor{
	
	public static void main(String[] args){
		
		double price = PowerSupply.getPrice();
		System.out.println("The price of Power Supply is : " + price);
		
		String brand = PowerSupply.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = PowerSupply.getModelNumber();
		System.out.println("Model number : " + number);
		
		String watt = PowerSupply.getWattage();
		System.out.println("Wattage : " + watt);
		
		boolean modular = PowerSupply.getModular();
		System.out.println("Modular : " + modular);
		
		String cert = PowerSupply.getCertification();
		System.out.println("Certification : " + cert);
		
		String color = PowerSupply.getColor();
		System.out.println("Color : " + color);
		
	}
}
