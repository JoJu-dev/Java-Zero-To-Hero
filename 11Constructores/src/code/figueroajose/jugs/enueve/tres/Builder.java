package code.figueroajose.jugs.enueve.tres;

public class Builder {

	String texto = "";
	String url = "";
	String target = "";
    
	public Builder texto(String texto) {
		this.texto = texto;
		return this;
	}

	public Builder url(String url) {
		this.url = url;
		return this;
	}

	public Builder target(String target) {
		this.target = target;
		return this;
	}

	
	public Link build() {
		return new Link(this);
	}
	
}
