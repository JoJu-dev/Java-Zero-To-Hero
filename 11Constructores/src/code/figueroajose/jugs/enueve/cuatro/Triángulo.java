package code.figueroajose.jugs.enueve.cuatro;

public class Triángulo {

	private Longitud a;
	private Longitud b;
	private Longitud c;
	private Ángulo gamma;
	private Ángulo alfa;
	private Ángulo beta;

	Triángulo(TriánguloBuilder build) {
		this.a = build.a;
		this.b = build.b;
		this.c = build.c;
		this.gamma = build.gamma;
		this.alfa = build.alfa;
		this.beta = build.beta;
	}

	public Longitud a() {
		return this.a;
	}

	public Longitud b() {
		return this.b;
	}

	public Longitud c() {
		return this.c;
	}
	
	public Ángulo gamma() {
		return this.gamma;
	}
	
	public Ángulo alfa() {
		return this.alfa;
	}
	
	public Ángulo beta() {
		return this.beta;
	}
	
}
