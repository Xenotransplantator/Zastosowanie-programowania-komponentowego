// import ;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberSystemsConverterApp extends JFrame{
	private InputPanel inputPanel;
	private OutputPanel outputPanel;
	private Color binTextColor = Color.decode("#000000");
	private Color octTextColor = Color.decode("#000000");
	private Color hexTextColor = Color.decode("#000000");
	public static String lang="en";
	private JMenu settings;
	private JMenuItem binColor;
	private JMenuItem inputColor;
	private JMenuItem outputColor;
	private JMenuItem lblBinColor;
	private JMenuItem lblOctColor;
	private JMenuItem lblHexColor;
	private JMenuItem lblSizeState;
	private JMenuItem lblLangPolish;
	private JMenuItem lblLangEnglish;

	public NumberSystemsConverterApp(){
		super(Lang.t("title","en"));
		init();
		outputPanel = new OutputPanel();
		inputPanel = new InputPanel(outputPanel);
		add(inputPanel);
		add(outputPanel);
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		settings = new JMenu(Lang.t("settings","en"));
		settings.setMnemonic('S');
		jmb.add(settings);
		binColor = new JMenuItem(Lang.t("op1","en"));
		binColor.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				outputPanel.setLEDsColor(JColorChooser.showDialog(null,"Pick color for LEDs", outputPanel.getLEDsColor()));
	        }  
	    });
		settings.add(binColor);
		inputColor = new JMenuItem(Lang.t("op2","en"));
		inputColor.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				inputPanel.setBackground(JColorChooser.showDialog(null,"Pick color for input panel", inputPanel.getBackground()));
	        }  
	    });
		settings.add(inputColor);
		outputColor = new JMenuItem(Lang.t("op3","en"));
		outputColor.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				outputPanel.setBackground(JColorChooser.showDialog(null,"Pick color for output panel", outputPanel.getBackground()));
	        }  
	    });
		settings.add(outputColor);
		lblBinColor = new JMenuItem(Lang.t("op4","en"));
		lblBinColor.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				outputPanel.setBinTextColor(JColorChooser.showDialog(null,"Pick color for binary output", outputPanel.getBinTextColor()));
	        }  
	    });
		settings.add(lblBinColor);
		lblOctColor = new JMenuItem(Lang.t("op5","en"));
		lblOctColor.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				outputPanel.setOctTextColor(JColorChooser.showDialog(null,"Pick color for octal output", outputPanel.getOctTextColor()));
	        }  
	    });
		settings.add(lblOctColor);
		lblHexColor = new JMenuItem(Lang.t("op6","en"));
		lblHexColor.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				outputPanel.setHexTextColor(JColorChooser.showDialog(null,"Pick color for hexadecimal output", outputPanel.getHexTextColor()));
	        }  
	    });
		settings.add(lblHexColor);
		lblSizeState = new JMenuItem(Lang.t("op7","en"));
		lblSizeState.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				outputPanel.toggleLEDSize();
	        }  
	    });
		settings.add(lblSizeState);
		lblLangPolish = new JMenuItem(Lang.t("op8","en"));
		lblLangPolish.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				lang="pl";
				refreshLang();
	        }  
	    });
		settings.add(lblLangPolish);
		lblLangEnglish = new JMenuItem(Lang.t("op9","en"));
		lblLangEnglish.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				lang="en";
				refreshLang();
	        }  
	    });
		settings.add(lblLangEnglish);

	}

	public void refreshLang(){
		setTitle(Lang.t("title",lang));
		settings.setText(Lang.t("settings",lang));
		binColor.setText(Lang.t("op1",lang));
		inputColor.setText(Lang.t("op2",lang));
		outputColor.setText(Lang.t("op3",lang));
		lblBinColor.setText(Lang.t("op4",lang));
		lblOctColor.setText(Lang.t("op5",lang));
		lblHexColor.setText(Lang.t("op6",lang));
		lblSizeState.setText(Lang.t("op7",lang));
		lblLangPolish.setText(Lang.t("op8",lang));
		lblLangEnglish.setText(Lang.t("op9",lang));
		repaint();
		inputPanel.titledBorder.setTitle(Lang.t("in1",lang));
		inputPanel.inSys.setText(Lang.t("in2",lang));
		inputPanel.inNum.setText(Lang.t("in3",lang));
		inputPanel.btnConvert.setText(Lang.t("in4",lang));
		inputPanel.repaint();
		outputPanel.tb1.setTitle(Lang.t("out1",lang));
		outputPanel.tb2.setTitle(Lang.t("out2",lang));
		outputPanel.tb3.setTitle(Lang.t("out3",lang));
		outputPanel.tb4.setTitle(Lang.t("out4",lang));
		outputPanel.tb5.setTitle(Lang.t("out5",lang));
		outputPanel.repaint();
		
	}

	private void init(){
		setLayout(new GridLayout(2,0));
		setPreferredSize(new Dimension(650,466));
		setMinimumSize(new Dimension(650,466));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
		setVisible(true);
	}

	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new NumberSystemsConverterApp();
			}
		});
	}
}