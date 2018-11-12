package ca.bcit.conversion.jsf;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("serial")
@ManagedBean(name = "form")
@SessionScoped
public class ConversionForm implements Serializable {
	public enum Formulae {
		MILES, KILOMETRES
	};

	private int number;
	private double result;
	private Formulae formulae;
	private String status;
		
	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public double getResult() {
		return result;
	}
		
	public Formulae getFormulae() {
		return formulae;
	}

	public void setFormulae(Formulae formulae) {
		this.formulae = formulae;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Map<String, Formulae> getFormulaeItems() {
		return formulaeItems;
	};
	
	private static Map<String, Formulae> formulaeItems;
	static {
		formulaeItems = new LinkedHashMap<String, Formulae>();
		formulaeItems.put("Miles", Formulae.MILES);				
		formulaeItems.put("Kilometres", Formulae.KILOMETRES);
	}
	

	public void convert() {
		if(formulae.toString() != null && !formulae.toString().isEmpty()) {
			if(formulae.toString().equals("MILES")) {
				result = number * 0.62137;
			}
			else {
				result = number * 1.609344;
			}
			status = "success";
		}
		/*<h:outputText value="#{form.status == 'success' ? form.result : ' '}" style="color:green"/>*/
	}
		
}
