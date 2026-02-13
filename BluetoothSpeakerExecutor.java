class BluetoothSpeakerExecutor{
	
	public static void main(String[] args){
		
		double price = BluetoothSpeaker.getPrice();
		System.out.println("The price of speaker is : " + price);
		
		String brand = BluetoothSpeaker.getBrand();
		System.out.println("The brand is : " + brand);
		
		String number = BluetoothSpeaker.getModelNumber();
		System.out.println("The model number is : " + number);
		
		String name = BluetoothSpeaker.getModelName();
		System.out.println("The model name is : " + name);
		
		String power = BluetoothSpeaker.getOutputPower();
		System.out.println("The output power is : " + power);
		
		String battery = BluetoothSpeaker.getBatteryLife();
		System.out.println("The battery life is : " + battery);
		
		boolean waterproof = BluetoothSpeaker.getWaterProof();
		System.out.println("Waterproof support : " + waterproof);
		
		String connect = BluetoothSpeaker.getConnectivity();
		System.out.println("Connectivity type : " + connect);
		
		String color = BluetoothSpeaker.getColor();
		System.out.println("Color : " + color);
		
	}
}
