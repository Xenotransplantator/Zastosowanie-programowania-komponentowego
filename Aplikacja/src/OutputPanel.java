// import ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.JColorChooser;
import java.io.*;
import java.beans.*;
import java.util.ArrayList;
import javax.swing.border.TitledBorder;

public class OutputPanel extends JPanel{
	private JLabel binOut;
	private ArrayList<LedBit> ledBits;
	private JLabel octOut;
	private JLabel hexOut;
	public TitledBorder tb1=BorderFactory.createTitledBorder("Output panel");
	public TitledBorder tb2=BorderFactory.createTitledBorder("Binary");
	public TitledBorder tb3=BorderFactory.createTitledBorder("Binary (LED)");
	public TitledBorder tb4=BorderFactory.createTitledBorder("Octal");
	public TitledBorder tb5=BorderFactory.createTitledBorder("Hexadecimal");
	public OutputPanel(){
		super(new GridLayout(0,1));
		setBorder(tb1);
		JPanel binOutPanel = new JPanel(); binOutPanel.setBorder(tb2); add(binOutPanel);
		GridLayout layoutLED = new GridLayout(1,8); layoutLED.setHgap(10);
		JPanel binOutLEDPanel = new JPanel(layoutLED); binOutLEDPanel.setBorder(tb3); add(binOutLEDPanel);
		JPanel octOutPanel = new JPanel(); octOutPanel.setBorder(tb4); add(octOutPanel);
		JPanel hexOutPanel = new JPanel(); hexOutPanel.setBorder(tb5); add(hexOutPanel);
		
		binOut = new JLabel("");
		binOutPanel.add(binOut);

		octOut = new JLabel("");
		octOutPanel.add(octOut);

		hexOut = new JLabel("");
		hexOutPanel.add(hexOut);

		ledBits = new ArrayList<LedBit>();
		for(int i=0;i<32;i++) ledBits.add(new LedBit());
		
		for(int i=0;i<8;i++){
			JPanel ledGroup = new JPanel(new GridLayout(1,4));
			for(int j=0;j<4;j++){
				ledGroup.add(ledBits.get(i*4+j));
			}
			binOutLEDPanel.add(ledGroup);
		}
	}
	public void convert(int n){
		String bin = Integer.toBinaryString(n);
		String binSpace = "";
		while(bin.length()<32) bin="0"+bin;
		for(int i=0;i<32;i++){
			ledBits.get(i).setState(bin.charAt(i)=='1');
			binSpace+=bin.charAt(i);
			if((i+1)%4==0) binSpace+=" ";
		}
		binOut.setText(binSpace);
		String oct = Integer.toOctalString(n);
		while(oct.length()<12) oct="0"+oct;
		String octSpace = "";
		for(int i=0;i<12;i++){
			octSpace+=oct.charAt(i);
			if((i+1)%3==0) octSpace+=" ";
		}
		octOut.setText(octSpace);
		String hex = Integer.toHexString(n).toUpperCase();
		while(hex.length()<8) hex="0"+hex;
		hexOut.setText(hex.substring(0,4)+" "+hex.substring(4,8));
	}
	public Color getLEDsColor(){
		return ledBits.get(0).getColor();
	}
	public void setLEDsColor(Color c){
		for(int i=0;i<32;i++){
			ledBits.get(i).setColor(c);
		}
	}
	public Color getBinTextColor(){
		return binOut.getForeground();
	}
	public void setBinTextColor(Color c){
		binOut.setForeground(c);
	}
	public Color getOctTextColor(){
		return octOut.getForeground();
	}
	public void setOctTextColor(Color c){
		octOut.setForeground(c);
	}
	public Color getHexTextColor(){
		return hexOut.getForeground();
	}
	public void setHexTextColor(Color c){
		hexOut.setForeground(c);
	}
	public void toggleLEDSize(){
		for(int i=0;i<32;i++){
			ledBits.get(i).setSizeState(!ledBits.get(i).getSizeState());
		}
	}
}