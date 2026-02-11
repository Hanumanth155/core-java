class Heater{
	
	static boolean heatedMode ; 
	
	static boolean controlHeat(){
		
		if(heatedMode == false){
			heatedMode = true;
			System.out.println("The Heater is turned on ..");
		}else{
			heatedMode = false;
			System.out.println("The Heater is turned off ..");
		}
		
		return heatedMode;
	}
	
}