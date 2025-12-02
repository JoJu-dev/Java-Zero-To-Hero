package code.figueroajose.jugs.enueve.tres;

public class Link {

	private final String texto;
	private final String url;
	//private final External external;
	private final String target;

	
	Link(Builder build) {
		this.texto = build.texto;
		this.url = build.url;
		this.target = build.target;
		
	}

	public static Link de(String texto, String url) {
		return new Builder()
				.texto(texto)
				.url(url)
				.target(external(url))
				.build();

	}

	public static Link de(String url) {
		return new Builder()
				   .texto(url)
				   .url(url)
				   .target(external(url))
				   .build();

	}

	public String texto() {
		return this.texto;
	}

	public String url() {
		return this.url;
	}

	public String target() {
		return this.target;
	}
	
	
	private static String external(String url) {
	
	     
		return  relativo(url)=='/' ? "" : "_blank"; 
	}

	private static Character relativo(String enlace) {
		var comienza = enlace.charAt(0);
		return comienza;
	}

}
