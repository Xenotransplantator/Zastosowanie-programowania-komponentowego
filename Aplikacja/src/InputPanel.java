// import ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.JColorChooser;
import java.io.*;
import java.beans.*;
import javax.swing.border.TitledBorder;

public class InputPanel extends JPanel{
	private OutputPanel out;
	public TitledBorder titledBorder=BorderFactory.createTitledBorder("Input panel");
	public JLabel inSys=new JLabel("Input system: ");
	public JLabel inNum=new JLabel("Input number: ");
	public JButton btnConvert;
	public InputPanel(OutputPanel out){
		super(new GridLayout(0,1));
		this.out=out;
		JPanel dataInput = new JPanel(new GridLayout(2,0));		
		setBorder(titledBorder);
		dataInput.add(inSys);
		String[] systems = { "BIN (2)", "OCT (8)", "HEX (16)" };
		JComboBox systemsList = new JComboBox(systems);
		systemsList.setSelectedIndex(0);
		dataInput.add(systemsList);
		dataInput.add(inNum);
		JTextField inputNumber = new JTextField();
		dataInput.add(inputNumber);
		add(dataInput);
		btnConvert = new JButton("Convert");
		add(btnConvert);
		btnConvert.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String x = systemsList.getSelectedItem().toString();
				String n = inputNumber.getText();
				switch(x){
					case "BIN (2)":
						if(n.matches("[0-1]+")){
							if(n.length()>31){
								JOptionPane.showMessageDialog(null, Lang.t("er1",NumberSystemsConverterApp.lang), Lang.t("er1t",NumberSystemsConverterApp.lang), JOptionPane.ERROR_MESSAGE);
							} else {
								out.convert(Integer.parseInt(n, 2));
							}
						} else {
							JOptionPane.showMessageDialog(null, Lang.t("er2",NumberSystemsConverterApp.lang), Lang.t("er2t",NumberSystemsConverterApp.lang), JOptionPane.ERROR_MESSAGE);
						}
						break;
					case "OCT (8)":
						if(inputNumber.getText().matches("[0-7]+")){
							if(n.length()>11 || n.length()==10 && n.matches("[2-7][0-7]+")){
								JOptionPane.showMessageDialog(null, Lang.t("er1",NumberSystemsConverterApp.lang), Lang.t("er1t",NumberSystemsConverterApp.lang), JOptionPane.ERROR_MESSAGE);
							} else {
								out.convert(Integer.parseInt(inputNumber.getText(), 8));
							}
						} else {
							JOptionPane.showMessageDialog(null, Lang.t("er3",NumberSystemsConverterApp.lang), Lang.t("er2t",NumberSystemsConverterApp.lang), JOptionPane.ERROR_MESSAGE);
						}
						break;
					case "HEX (16)":
						if(inputNumber.getText().matches("[0-9A-Fa-f]+")){
							if(n.length()>8 || n.length()==8 && n.matches("[8-9A-Fa-f][0-9A-Fa-f]+")){
								JOptionPane.showMessageDialog(null, Lang.t("er1",NumberSystemsConverterApp.lang), Lang.t("er1t",NumberSystemsConverterApp.lang), JOptionPane.ERROR_MESSAGE);
							} else {
								out.convert(Integer.parseInt(inputNumber.getText(), 16));
							}
						} else {
							JOptionPane.showMessageDialog(null, Lang.t("er4",NumberSystemsConverterApp.lang), Lang.t("er2t",NumberSystemsConverterApp.lang), JOptionPane.ERROR_MESSAGE);
						}
						break;
				}
			}
		});
	}
}