class MonitorExecutor{
	
	public static void main(String[] args){
		
		double price = Monitor.getPrice();
		System.out.println("The price of Monitor is : " + price);
		
		String brand = Monitor.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = Monitor.getModelNumber();
		System.out.println("Model number : " + number);
		
		String size = Monitor.getScreenSize();
		System.out.println("Screen size : " + size);
		
		String resolution = Monitor.getResolution();
		System.out.println("Resolution : " + resolution);
		
		boolean hdmi = Monitor.getHDMISupport();
		System.out.println("HDMI support : " + hdmi);
		
		String color = Monitor.getColor();
		System.out.println("Color : " + color);
		
	}
}
