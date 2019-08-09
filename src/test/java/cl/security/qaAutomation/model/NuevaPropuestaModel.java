package cl.security.qaAutomation.model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NuevaPropuestaModel {
	
	@FindBy(how = How.ID, using = "username") 
	private WebElement username;
	
	@FindBy(how = How.ID, using = "password") 
	private WebElement password;
	
	@FindBy(how = How.CLASS_NAME, using = "btn-action") 
	private WebElement btnEntrar;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'#/propuestas/nueva')]")
	private WebElement btnNuevaPropuesta;
	
	@FindBy(how = How.CLASS_NAME, using = "input-default")
	private WebElement txtNuevaPropuesta;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'next')]") 
	private WebElement btnSiguiente;
		
	@FindBy(how = How.ID, using = "nombre") 
	private WebElement txtNombreCliente;
	
	@FindBy(how = How.ID, using = "edad") 
	private WebElement txtEdadCliente;
	
	@FindBy(how = How.ID, using = "rut") 
	private WebElement txtRutCliente;
	
	@FindBy(how = How.ID, using = "dropdownCoberturas") 
	private WebElement selectCobertura;
	
	@FindBy(how = How.CLASS_NAME, using = "dropdown-menu") 
	private WebElement selectValueCobertura;
	
	//opciones de covertura: precio, uf/años, años
	@FindBy(how = How.XPATH, using = "//input[contains(@class,'ember-view') and contains(@type,'number')]") 
	private List<WebElement> listCoverturaOpciones;
	
	@FindBy(how = How.CLASS_NAME, using = "error-buttons") 
	private List<WebElement> listErrorButton;
	
	@FindBy(how = How.ID, using = "dropdownSourceTypes")
	private WebElement btnTipoCustionario;
	
	public WebElement getTxtRutCliente() {
		return txtRutCliente;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnEntrar() {
		return btnEntrar;
	}

	public WebElement getBtnNuevaPropuesta() {
		return btnNuevaPropuesta;
	}

	public WebElement getTxtNuevaPropuesta() {
		return txtNuevaPropuesta;
	}

	public WebElement getBtnSiguiente() {
		return btnSiguiente;
	}

	public WebElement getTxtNombreCliente() {
		return txtNombreCliente;
	}

	public WebElement getTxtEdadCliente() {
		return txtEdadCliente;
	}

	public WebElement getSelectCobertura() {
		return selectCobertura;
	}

	public WebElement getSelectValueCobertura() {
		return selectValueCobertura;
	}

	public List<WebElement> getListCoverturaOpciones() {
		return listCoverturaOpciones;
	}

	public List<WebElement> getListErrorButton() {
		return listErrorButton;
	}

	public WebElement getBtnTipoCustionario() {
		return btnTipoCustionario;
	}

	
	//Busqueda en imagen 'Lupa' o solo con enter  sin ID
//	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[4]/div[1]/form/div/input")
//	private WebElement homeBtnBuscar;
}
