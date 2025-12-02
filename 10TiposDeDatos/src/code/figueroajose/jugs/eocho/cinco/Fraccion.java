package code.figueroajose.jugs.eocho.cinco;

public class Fraccion {

	private int numerador;
	private int denominador;
	private int MCM;
	private int MCD;
	private int numeradorReducido = 0;
	private int denominadorReducido = 0;

	Fraccion(int numerador, int denominador) {
		MCM = MCM(numerador, denominador);
		MCD = MCD(numerador, denominador);
		
		numeradorReducido = numerador / MCD;
		denominadorReducido = denominador / MCD;

		if (denominador >= 0 && numerador >= 0) {
			this.numerador = numeradorReducido;
			this.denominador = denominadorReducido;
		} else {
			this.numerador = numeradorReducido * (-1);
			this.denominador = denominadorReducido * (-1);

		}
	}

	public int numerador() {
		return this.numerador;
	}

	public int denominador() {
		return this.denominador;
	}

	public Fraccion sumar(Fraccion that) {
		var mcm = Aritmética.mcm(this.denominador, that.denominador);
		var NuevoDenominador = (this.numerador * (mcm / this.denominador))
				+ (that.numerador * (mcm / that.denominador));
		return new Fraccion(NuevoDenominador, mcm);
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

	private int MCM(int numerador, int denominador) {

		return Aritmética.mcm(Math.abs(numerador), Math.abs(denominador));

	}

	private int MCD(int numerador, int denominador) {
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
