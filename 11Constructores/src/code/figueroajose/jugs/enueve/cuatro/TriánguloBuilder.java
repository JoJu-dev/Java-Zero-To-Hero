package code.figueroajose.jugs.enueve.cuatro;

public class TriánguloBuilder {
	
	Longitud a;
	Longitud b;
	Longitud c;
	Ángulo gamma;
	Ángulo alfa;
	Ángulo beta;

	
	public  TriánguloBuilder(Longitud a, Longitud b, Longitud c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.gamma = Geometria.leyCosenos(a, b, c);
		this.alfa = Geometria.leyCosenos(a, b, c);
		this.beta = Geometria.tercerÁngulo(alfa,gamma);
		
	}
	
	public  TriánguloBuilder(Longitud a, Ángulo gamma, Longitud c) {
		this.a = a;
		this.b= Geometria.leyCosenos(a, c, gamma);
		this.c = c;
		this.gamma = gamma;
		this.alfa = Geometria.leySenos(a, c, gamma);
		this.beta = Geometria.tercerÁngulo(gamma, alfa);
	}
	
	public TriánguloBuilder(Ángulo alfa, Longitud c, Ángulo beta) {
		this.alfa = alfa;
		this.beta = beta;
		this.gamma = Geometria.tercerÁngulo(alfa, beta);
		this.a = Geometria.leySenos(c, alfa, gamma);
		this.b = Geometria.leySenos(c, alfa, gamma);
		this.c = Geometria.leySenos(c, alfa, gamma);
	}
	
	
	
	public TriánguloBuilder a(Longitud a) {
		this.a = a;
		return this;
	}
	
	public TriánguloBuilder b (Longitud b) {
		this.b = b;
		return this;
	}
	
	public TriánguloBuilder c(Longitud c) {
		this.c = c;
		return this;
	}
	
	public TriánguloBuilder gamma(Ángulo gamma) {
		this.gamma = gamma;
		return this;
	}
	
	public TriánguloBuilder alfa(Ángulo alfa) {
		this.alfa = alfa;
		return this;
	}
	
	public TriánguloBuilder beta(Ángulo beta) {
		this.beta = beta;
		return this;
	}
	
	public Triángulo build() {
		return new Triángulo(this);
	}
}
