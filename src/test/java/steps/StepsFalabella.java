package steps;

import pageObject.PageObjectFalabella;
import pageObject.PageObjectGoogle;

public class StepsFalabella {
	
	PageObjectGoogle objPageObjectGoogle;
	PageObjectFalabella objPageObjectFalabella;
	public void abrirNavegador() {
		objPageObjectGoogle.abrirNavegador();
		
	}
	
	
public void buscarGoogle(String cliente) {
	objPageObjectGoogle.ingresarTexto(cliente);
	objPageObjectGoogle.pulsarBotonBusqueda();
	objPageObjectGoogle.seleccionarResultado();
		
	}

public void buscarFalabella(String producto)  {
	objPageObjectFalabella.CierrePopupAviso();
	objPageObjectFalabella.CierrePopupAviso2();
	objPageObjectFalabella.BuscarProducto(producto);
	objPageObjectFalabella.SiguientePagina();
	objPageObjectFalabella.AgregarBolsa();
	objPageObjectFalabella.VerCompraBolsas();
	objPageObjectFalabella.ListaDesplegable();
	objPageObjectFalabella.AsegurarProducto();
	
}
 public void compararPrecios () {
	 objPageObjectFalabella.CompararResultados();
 }


	
	
}

	
	
	

