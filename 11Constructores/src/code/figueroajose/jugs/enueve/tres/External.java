package code.figueroajose.jugs.enueve.tres;

public class External {
	
	private boolean external;
	
	public External(String e) {
		
		if( e == ("/")) {
			this.external = false;
		}else {
			this.external= true;
		}
		
	}
	
	public boolean external() {
		return this.external;
	}

}
