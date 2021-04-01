package pageObject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.ibm.icu.impl.duration.TimeUnit;

import net.serenitybdd.core.pages.PageObject;

public class PageObjectFalabella extends PageObject {
	
	public void bajarPantallaHastaSiguientePagina() {
		WebElement objWebElement =element(By.xpath(btnSiguientePagina));
		((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", objWebElement);
	}
	
	String btnCierrePopup1 = "//div[@id='fake-close']";
	String btnCierrePopup2 = "//a[@id='acc-alert-deny']";
	String txtBusquedaProducto = "//body/div[@id='__next']/nav[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
	String btnSiguientePagina = "//button[@id='testId-pagination-bottom-arrow-right']";
	String btnAgregarBolsa= "//button[@id='testId-Pod-action-prod10900029']"; 
	String btnVerBolsaCompras= "//a[@id='linkButton']";
	String listaDesplegable="//body/div[1]/main[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/a[1]";
	String opcionAsegurarProducto="//a[contains(text(),'Gold Protection $ 538.900')]";
	String precioFinal ="//body/div[@id='__next']/div[1]/div[2]/div[3]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ol[1]/li[2]/div[1]/span[1]";
	String precioProteccion ="//span[contains(text(),'Gold Protection ')]";
	String precioFinalResumen = "(//span[contains(text(),'Sub-total productos')]//following::span)[1]";
	String valorPrecioFinal = "";
	String valorProteccion = "";
	String valorprecioFinalResumen= "";
	
	
public void CierrePopupAviso() {
	 element(By.xpath(btnCierrePopup1)).click();
}

public void CierrePopupAviso2() {
	element(By.xpath(btnCierrePopup2)).click();
}

public void BuscarProducto(String producto) {
	element(By.xpath(txtBusquedaProducto)).sendKeys(producto + Keys.ENTER);
}

public void SiguientePagina() {
	element(By.xpath(btnSiguientePagina)).click();
	
}
public void AgregarBolsa() {
	element(By.xpath(btnAgregarBolsa)).click();
	valorPrecioFinal= element(By.xpath(precioFinal)).getText();
	valorProteccion=element(By.xpath(precioProteccion)).getText();
	System.out.println("Total equipo :"  + valorPrecioFinal);
	System.out.println("Total proteccion :" + valorProteccion);
	
   
  
}
public void VerCompraBolsas() {
	element(By.xpath(btnVerBolsaCompras)).click();
	 
	
}
public void ListaDesplegable() {
	element(By.xpath(listaDesplegable)).click();
	
}
public void AsegurarProducto() {
	element(By.xpath(opcionAsegurarProducto)).click();
	
}

public void CompararResultados() {
	
	String valuePrecioFinal = valorPrecioFinal.split(" ")[1];
	String valueProteFinal = valorProteccion.split(" ")[3];
	String t=valuePrecioFinal.replaceAll("[-+^.]*", "");
	String ts=valueProteFinal.replaceAll("[-+^.]*", "");
	waitFor(3).seconds();
	System.out.println("Total Resumen :" +  element(By.xpath(precioFinalResumen)).getText());
	int totalr= Integer.parseInt((element(By.xpath(precioFinalResumen)).getText()).split(" ")[1].replaceAll("[-+^.]*", ""));
	
	int  f=Integer.parseInt(t);
	int  p=Integer.parseInt(ts);  
	int numero1=f+p;
	System.out.println("Total Compra:"+valuePrecioFinal+ "+"+valueProteFinal+"="+numero1);
	assertTrue("Los valores no son iguales", totalr==numero1);

	
}

}
