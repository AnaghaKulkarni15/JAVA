package com.vehicleinfo;

public class VehicleValidationRule {
	public static final int MIN_PLEVEL;
	static {
		MIN_PLEVEL = 20;
	}
	
	public static void validatepollution(int level) throws PollutionOutOfRangeException {
		if (level > MIN_PLEVEL)
			throw new PollutionOutOfRangeException("Pollution is high...");
		System.out.println("Pollution is low..");
	}
	
	
}
