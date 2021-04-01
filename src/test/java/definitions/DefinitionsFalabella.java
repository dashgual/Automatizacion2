package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.StepsFalabella;

public class DefinitionsFalabella {
	@Steps
	StepsFalabella objStepsFalabella;

@Given("^Buscar en Google \"([^\"]*)\"$")
public void buscarEnGoogle(String cliente) {
	objStepsFalabella.abrirNavegador();
	objStepsFalabella.buscarGoogle(cliente);
}

@When("^Buscar en Falabella \"([^\"]*)\"$")
public void buscarEnFalabella(String producto) { 
objStepsFalabella.buscarFalabella(producto);
 
}

@Then("^Comparar precios$")
public void compararPrecios() {
objStepsFalabella.compararPrecios();
}

 
}
	


