package com.calculatorgui.artifact;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {

	private JFrame frmMyCalculator;
	Calculator calculate=new Calculator();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frmMyCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyCalculator = new JFrame();
		frmMyCalculator.setTitle("My Calculator");
		frmMyCalculator.setBounds(100, 100, 450, 300);
		frmMyCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyCalculator.getContentPane().setLayout(null);
		
		JLabel lblFristNumber = new JLabel("Frist Number");
		lblFristNumber.setBounds(46, 36, 69, 14);
		frmMyCalculator.getContentPane().add(lblFristNumber);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setBounds(46, 79, 69, 14);
		frmMyCalculator.getContentPane().add(lblSecondNumber);
		
		final JTextArea txtfirstno = new JTextArea();
		txtfirstno.setBounds(160, 31, 90, 22);
		frmMyCalculator.getContentPane().add(txtfirstno);
		
		final JTextArea txtsecondno = new JTextArea();
		txtsecondno.setBounds(160, 74, 90, 22);
		frmMyCalculator.getContentPane().add(txtsecondno);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(46, 131, 69, 14);
		frmMyCalculator.getContentPane().add(lblResult);
		
		final JLabel lblActualResult = new JLabel("");
		lblActualResult.setBounds(160, 131, 90, 14);
		frmMyCalculator.getContentPane().add(lblActualResult);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked Addition");
				double result =calculate.add(Double.valueOf(txtfirstno.getText()), Double.valueOf(txtsecondno.getText()));
				lblActualResult.setText( String.valueOf(result));
			}
		});
		btnAdd.setBounds(94, 188, 41, 23);
		frmMyCalculator.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked Subtraction");
				double result =calculate.subtract(Double.valueOf(txtfirstno.getText()), Double.valueOf(txtsecondno.getText()));
				lblActualResult.setText( String.valueOf(result));
			}
		});
		btnSubtract.setBounds(142, 188, 41, 23);
		frmMyCalculator.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked Multiplication");
				double result =calculate.multiply(Double.valueOf(txtfirstno.getText()), Double.valueOf(txtsecondno.getText()));
				lblActualResult.setText( String.valueOf(result));
			}
		});
		btnMultiply.setBounds(193, 188, 41, 23);
		frmMyCalculator.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked Division");
				double result =calculate.divide(Double.valueOf(txtfirstno.getText()), Double.valueOf(txtsecondno.getText()));
				lblActualResult.setText( String.valueOf(result));
			}
		});
		btnDivide.setBounds(244, 188, 41, 23);
		frmMyCalculator.getContentPane().add(btnDivide);
	}
}
