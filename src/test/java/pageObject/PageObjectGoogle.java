package pageObject;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https:www.google.com")

public class PageObjectGoogle extends PageObject{
	
	String cuadroBusquedaGoogle = "q";
	String resultado = "//h3[contains(text(),'Lo encontré en Falabella.com')]";
	
 public void abrirNavegador () {
	 this.open();
 }
 
 public void ingresarTexto(String cliente) {
	 element(By.name(cuadroBusquedaGoogle)).sendKeys(cliente);
 }
 
 public void pulsarBotonBusqueda() {
	 element(By.name(cuadroBusquedaGoogle)).submit();
	 
 }
 public void seleccionarResultado() {
	 element(By.xpath(resultado)).click();
 }
}
