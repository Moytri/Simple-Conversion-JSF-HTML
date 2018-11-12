package ca.bcit.conversion.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("serial")
@ManagedBean(name = "form")
@SessionScoped
public class ConversionForm implements Serializable {
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
