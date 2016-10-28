package com.calculatorgui.artifact;

public class Main {

	public static void main(String[] args) {
		Calculator calculat=new Calculator();
		System.out.println(calculat.add(102, 2.4));
		System.out.println(calculat.subtract(102, 2.4));
		System.out.println(calculat.multiply(102, 2.4));
		System.out.println(calculat.divide(102, 0));

	}

}
