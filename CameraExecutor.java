class CameraExecutor{
	
	public static void main(String[] args){
		
		double price = Camera.getPrice();
		System.out.println("The price of Camera is : " + price);
		
		String brand = Camera.getBrand();
		System.out.println("Brand : " + brand);
		
		String number = Camera.getModelNumber();
		System.out.println("Model number : " + number);
		
		String resolution = Camera.getResolution();
		System.out.println("Resolution : " + resolution);
		
		boolean wifi = Camera.getWifiSupport();
		System.out.println("Wifi support : " + wifi);
		
		String lens = Camera.getLensType();
		System.out.println("Lens type : " + lens);
		
		String color = Camera.getColor();
		System.out.println("Color : " + color);
		
	}
}
