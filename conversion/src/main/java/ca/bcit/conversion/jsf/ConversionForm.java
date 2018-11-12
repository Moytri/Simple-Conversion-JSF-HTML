package ca.bcit.conversion.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "form")
@RequestScoped
public class ConversionForm {
	private double number;
	private double result;
	
	public void setNumber(double number) {
		this.number = number;
	}

	public double getNumber() {
		return number;
	}

	public double getResult() {
		return result;
	}
	
}
