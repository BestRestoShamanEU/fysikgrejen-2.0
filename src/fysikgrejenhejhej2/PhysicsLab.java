package fysikgrejenhejhej2;

public class PhysicsLab {
	
	public static final double g_swe = 9.82;
	
	public static final double G = 6.6740831E-11;
	
	public static final double R = 8.314462175;
	
	public static final double p_0 = 101300;
	
	public static final double c = 299792458;
	
	
 public static void main(String[] args) {
	
	 
	 
}
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celcius = (fahrenheit -32) * 5.0 / 9.0;
		return celcius;
	}

	public static double kelvinToCelsius(double kelvin) {
		double celcius = kelvin -273.15; 
		return celcius;
	}

	public static double fluidPressure(FluidTable fluid, double deep) {
		double pressure = fluid.density * g_swe * deep;
		return pressure;
		
	}
	
	public static double pressureUnderWater(double deep) {
		double pressure = FluidTable.WATER.density * g_swe * deep;
		return pressure;
	}

	public static double kineticEnergy(double mass, double velocity) {
		double energy = mass * velocity * velocity /2.0;
		return energy;
	}
	
	public static double potentialEnergy(double mass, double height) {
		double energy = mass * g_swe * height;
		return energy;
	}
	
	public static double fallSpeed(double height) {
		double speed = Math.sqrt(2* g_swe * height);
		return speed;
	}
	
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}
	
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		double mass = volume * fluid.density;
		return mass;
	}
	
	public static double volumeToMass(GasTable gas, double volume) {
		double mass = volume * gas.density;
		return mass;
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		double mass = volume * solid.density;
		return mass;
	}
	
	public static double svtVelocity(double distance, double time) {
		double velocity = distance / time;
		return velocity;
	}
	
	public static double svtDistance(double velocity, double time) {
		double distance = time * velocity; 
		return distance;
	}
	
	public static double svtTime(double distance, double velocity) {
	double time = distance / velocity;
	return time;
	}
	
	public static double work(double force, double distance) {
		double work = force * distance;
		return work;
		
	}
	
	public static double power(double work, double time) {
		double power = work / time;
		return power;
		
	}
	
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double energy = solid.heatCapacity * mass * deltaT;
		return energy;
		
	}
	
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		double energy = fluid.heatCapacity * mass * deltaT;
		return energy;
		
	}
	
	public static double heat(GasTable gas, double mass, double deltaT) {
		double energy = gas.heatCapacity * mass * deltaT;
		return energy;
		
	}
	
	public static double velocityToHeight(double velocity) {
		double height = velocity * velocity / g_swe / 2.0;
		return height;
	}
	
	public static double force(double mass, double acceleration) {
	double force = mass*acceleration;
	return force;
	}
	
	public static double distance(double acceleration, double time) {
		double distance = acceleration * time * time /2.0;
		return distance;
	}
	
}


