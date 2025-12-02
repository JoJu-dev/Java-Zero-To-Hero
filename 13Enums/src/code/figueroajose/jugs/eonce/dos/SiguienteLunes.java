package code.figueroajose.jugs.eonce.dos;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class SiguienteLunes {
	
	private LocalDate fecha;
	
	public SiguienteLunes(LocalDate fecha) {
		this.fecha = siguienteLunes(fecha);
	}
	
	public LocalDate fecha() {
		return this.fecha;
	}
	
	 public static LocalDate siguienteLunes(LocalDate fecha) {
		var fechaActual = fecha.getDayOfWeek().getValue();
		var diasHastaLunes = (DayOfWeek.SUNDAY.getValue() - fechaActual) + 1;
		
		return (fechaActual == 1) ? fecha.plusDays(0) : fecha.plusDays(diasHastaLunes);
	}

	
	
}
