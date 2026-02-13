class PowerBankExecutor{
	
	public static void main(String[] args){
		
		double price = PowerBank.getPrice();
		System.out.println("The price of powerbank is : " +price);
		
		String brand = PowerBank.getBrand();
		System.out.println("The brand of powerbank is : " +brand);
		
		String number = PowerBank.getModelNumber();
		System.out.println("The Model Number of powerbank is : " +number);
		
		String name = PowerBank.getModelName();
		System.out.println("The Model Name of powerbank is : " +name);
		
		String devices[] = PowerBank.getSuitableDevices();
		System.out.println("The Suitable Devices are:");
        for (String device : devices) {
            System.out.println(device);
        }
		
		int ports = PowerBank.getSupportPorts();
		System.out.println("The number of ports are : " +ports);
		
		boolean cable = PowerBank.getChargingCableAvailable();
		System.out.println("The charging cable is available : " +cable);
		
		String batteryType = PowerBank.getBatteryType();
		System.out.println("The Power Bank Battery type is : " + batteryType);
		
		String chargerType = PowerBank.getChargerType();
		System.out.println("The Power Bank Charger type is : " +chargerType);
		
		String capacity = PowerBank.getBatteryCap();
		System.out.println("The Power Bank Battery Capacity is : " +capacity);
		
		String color = PowerBank.getColor();
		System.out.println("The Power Bank Color is : " +color);
		
		String power = PowerBank.getPowerOutput();
		System.out.println("The Power Bank power is : " +power);
		
		String connector = PowerBank.getConnector();
		System.out.println("The type of connector is : " +connector);
		
		
	}
}