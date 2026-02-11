class HeaterExecutor{


	public static void main (String[] heaterstatus){
		
		boolean heater = Heater.controlHeat();
		
		System.out.println("The Heater is currently turned On : "+heater);
	}
	
}