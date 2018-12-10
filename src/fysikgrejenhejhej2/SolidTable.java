package fysikgrejenhejhej2;

public enum SolidTable {

	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	ALUMINIUM(2.70, 0.90, 660, 397),
	ZINK(7.13, 0.39, 420, 117),
	LEAD(11.3, 0.13, 327, 24.7),
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double meltEntalpy;
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}

	
}