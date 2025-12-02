package code.figueroajose.jugs.enueve.uno;

public class Fraccion {

	private int numerador;
	private int denominador;
	private int MCM;
	private int MCD;
	private int numeradorReducido = 0;
	private int denominadorReducido = 0;

	
	public Fraccion(int numerador, Denominador d) {
		MCM = MCM(numerador, d.denominador());
		MCD = MCD(numerador, d.denominador());
		
		numeradorReducido = numerador / MCD;
		denominadorReducido = d.denominador() / MCD;

		if (denominador >= 1 && numerador >= 0) {
			this.numerador = numeradorReducido;
			this.denominador = d.denominador();
		} else {
			this.numerador = numeradorReducido * (-1);
			this.denominador = denominadorReducido * (-1);

		}
	}
	
	 public Fraccion(int numerador) {
		this(numerador,new Denominador(1));	
			
	}

	
	public Fraccion(int numerador, int d) {
		this(numerador, new Denominador(d));
	}

	public int numerador() {
		return this.numerador;
	}

	public int denominador() {
		return this.denominador;
	}

	public Fraccion sumar(Fraccion that) {
		var mcm = Aritmética.mcm(this.denominador, that.denominador);
		var nuevoDenominador = (this.numerador * (mcm / this.denominador))
				+ (that.numerador * (mcm / that.denominador));
		return new Fraccion(nuevoDenominador, mcm);
	}

	public Fraccion restar(Fraccion that) {
		var mcm = Aritmética.mcm(this.denominador, that.denominador);
		var NuevoDenominador = (this.numerador * (mcm / this.denominador))
				- (that.numerador * (mcm / that.denominador));
		return new Fraccion(NuevoDenominador, mcm);
	}

	public Fraccion multiplicar(Fraccion that) {
		var nuevoNumerador = this.numerador * that.numerador;
		var nuevoDenominador = this.denominador * that.denominador;
		return new Fraccion(nuevoNumerador, nuevoDenominador);
	}

	public Fraccion dividir(Fraccion that) {
		var nuevoNumerador = MCD(this.numerador, that.denominador);
		var nuevoDenominador = MCD(this.denominador, that.numerador);

		return new Fraccion(nuevoNumerador, nuevoDenominador);
	}

	private static int MCM(int numerador, int denominador) {

		return Aritmética.mcm(Math.abs(numerador), Math.abs(denominador));

	}

	private static int MCD(int numerador, int denominador) {
		return Aritmética.mcd(Math.abs(numerador), Math.abs(denominador));
	}

	public boolean equals(Object obj) {
		return obj instanceof Fraccion f && this.numerador == f.numerador && this.denominador == f.denominador;
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + this.numerador + ", denominador=" + this.denominador + ", MCM=" + MCM + ", MCD="
				+ MCD + "]";
	}

}
