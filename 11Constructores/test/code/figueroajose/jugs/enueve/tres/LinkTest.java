package code.figueroajose.jugs.enueve.tres;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinkTest {

	@Test
	void casoPruebaUno() {
		var java = Link.de("Get Java", "https://www.java.com/en/");
		assertAll(
				() -> assertEquals("Get Java", java.texto()),
				() -> assertEquals("https://www.java.com/en/", java.url()));
	}

	@Test
	void casoPruebaDos() {
		var javaUrl = Link.de("https://www.java.com/en/");
		assertAll(
				() -> assertEquals("https://www.java.com/en/", javaUrl.texto()),
				() -> assertEquals("https://www.java.com/en/", javaUrl.url())
				);
	}
	
	@Test
	void cadoPruebaTres() {
		var internalNews = Link.de("/en/news");
		 assertEquals("", internalNews.target());
	}

	
	@Test 
	void casoPruebaCuatro(){
		 var javaNewsLink = Link.de("https://dev.java/news/");
		 assertEquals("_blank", javaNewsLink.target());
	}
}