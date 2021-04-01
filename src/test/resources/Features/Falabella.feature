#Author: David Gutiérrez Alvis
#Fecha: 31/03/2021
@tagComparacionPrecios
Feature: Automatización para Banco Falabella Prueba de ingreso 

  @tag1
  Scenario Outline: Comparación de precios Celular
    Given Buscar en Google <cliente>
    When  Buscar en Falabella <producto>
    Then  Comparar precios
    

   Examples: 
      |   cliente   |  producto   |
      | "Falabella" | "Celulares" |
  