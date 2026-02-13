class MixerGrinderExecutor{
	
	public static void main(String[] args){
		
		double price = MixerGrinder.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = MixerGrinder.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = MixerGrinder.getModelNumber();
		System.out.println("Model : " + number);
		
		String watt = MixerGrinder.getWattage();
		System.out.println("Wattage : " + watt);
		
		int jars = MixerGrinder.getNoOfJars();
		System.out.println("Number of jars : " + jars);
		
		boolean protect = MixerGrinder.getOverloadProtection();
		System.out.println("Overload protection : " + protect);
		
		String color = MixerGrinder.getColor();
		System.out.println("Color : " + color);
		
	}
}
