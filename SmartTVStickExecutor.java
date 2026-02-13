class SmartTVStickExecutor{
	
	public static void main(String[] args){
		
		double price = SmartTVStick.getPrice();
		System.out.println("The price is : " + price);
		
		String brand = SmartTVStick.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = SmartTVStick.getModelNumber();
		System.out.println("Model : " + number);
		
		String resolution = SmartTVStick.getResolution();
		System.out.println("Resolution : " + resolution);
		
		boolean voice = SmartTVStick.getVoiceSupport();
		System.out.println("Voice support : " + voice);
		
		String connect = SmartTVStick.getConnectivity();
		System.out.println("Connectivity : " + connect);
		
		String color = SmartTVStick.getColor();
		System.out.println("Color : " + color);
		
	}
}
