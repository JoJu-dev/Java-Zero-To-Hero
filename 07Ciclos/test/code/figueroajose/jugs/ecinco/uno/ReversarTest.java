package code.figueroajose.jugs.ecinco.uno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class ReversarTest {

  @Test
  @DisplayName("Caso de prueba Uno \"input - Java\" \"output avaJ\"")
  void casoUno() {
	  
	  assertEquals("avaJ", Reversar.reversar("Java"));
  }
  @Test
  @DisplayName("Caso de prueba Dos \"input - java is fun\" \"output nuf si fun\"")
  void casoDos() {
	  
	  assertEquals("nuf si avaJ", Reversar.reversar("Java is fun"));
	  
  }
	  
  }
	

