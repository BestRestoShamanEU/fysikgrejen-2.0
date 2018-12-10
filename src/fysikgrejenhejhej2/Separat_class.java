package fysikgrejenhejhej2;

public class Separat_class {

	public static void main(String[] args) {
	
		System.out.println("Svar på fråga 1: " + PhysicsLab.volumeToMass(SolidTable.IRON, 0.08) + "kg" );
		
		System.out.println("Svar på fråga 2: " + PhysicsLab.svtDistance(2.8, 60*60) + "m" );
		
		System.out.println("Svar på fråga 3: " + PhysicsLab.heat(FluidTable.H20, PhysicsLab.volumeToMass(FluidTable.H20, 0.005), 1) + "J");
		
		System.out.println("Svar på fråga 4: " + (PhysicsLab.pressureUnderWater(100) + PhysicsLab.p_0));
		
		System.out.println("Svar på fråga 5: " + (PhysicsLab.velocityToHeight(50/3.6) + 1.8));
		
		System.out.println("Svar på fråga 6: " + PhysicsLab.power(PhysicsLab.work(PhysicsLab.force(740, 100/4.4), PhysicsLab.distance(100/4.4, 4.4)) , 4.4));
		
		System.out.println(PhysicsLab.power(PhysicsLab.work(740 * 100 / 4.4 , 100 / 4.4 * 4.4 * 4.4 / 2.0) , 4.4));
		
		double v0 = 0;
		double v = 100;
		double time = 4.4;
		double mass = 740;
		double acceleration = (v-v0)/time;
		double distance = v0 + acceleration*time*time/2.0;
		double force = mass * acceleration;
		double work = PhysicsLab.work(force,distance);
		double power = PhysicsLab.power(work,time);
		System.out.println(power);
		
		
		double height= 10.0;
		int bounces = 0;
		while (height > 0.5) {
		    double energy = PhysicsLab.kineticEnergy(0.2, PhysicsLab.fallSpeed(height)) * 0.99;
		    double velocity = Math.sqrt(energy*2/0.2);
		    height = PhysicsLab.velocityToHeight(velocity);
		    bounces++;
		}
		System.out.println("Svar på fråga 7: " + bounces);
		
		
		//Vad är din potentiella energi om du väger 100 och står på den högsta våningen av Eiffeltornet som är 280m upp?
		
		
		
	}
	
	
	
}
