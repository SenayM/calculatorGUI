package com.calculatorgui.artifact;

import javax.swing.JOptionPane;

public class Calculator {

	public double add(double firstno, double secondno){
		return firstno+secondno;
	}
	public double subtract(double firstno, double secondno){
		return firstno-secondno;
	}
	public double multiply(double firstno, double secondno){
		return firstno*secondno;
	}
	public double divide(double firstno, double secondno){
		double result=firstno/secondno;
		if (Double.isInfinite(result)){
			JOptionPane.showMessageDialog(null, "Division by zero","Error Message",JOptionPane.ERROR_MESSAGE);
			return -1111.1111;
		}
		return result; 
	}
}
