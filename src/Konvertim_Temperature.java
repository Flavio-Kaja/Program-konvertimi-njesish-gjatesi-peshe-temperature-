import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Konvertim_Temperature {

	JFrame Dritare;
	public JRadioButton Celsius_I;
	public JRadioButton Fahrenheit_I;
	public JRadioButton Kelvin_I;
	public JRadioButton Celsius_O;
	public JRadioButton Fahrenheit_O;
	public JRadioButton Kelvin_O;
	public JTextField textField_I;
	public JTextField textField_O;
	
	
	public Konvertim_Temperature () { 
		Dritare = new JFrame();
		Dritare.setResizable(false);
		Dritare.getContentPane().setBackground(new Color(240, 230, 140));
		Dritare.setBounds(100, 100, 485, 333);
		Dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dritare.getContentPane().setLayout(null);
		
		JLabel label_KonvertuesTemp = new JLabel("Konvertues Temperature");
		label_KonvertuesTemp.setBounds(0, 0, 469, 26);
		label_KonvertuesTemp.setForeground(new Color(0, 128, 128));
		label_KonvertuesTemp.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		label_KonvertuesTemp.setHorizontalAlignment(SwingConstants.CENTER);
		Dritare.getContentPane().add(label_KonvertuesTemp);
		
		JPanel panel_Output_Option = new JPanel();
		panel_Output_Option.setBorder(UIManager.getBorder("FormattedTextField.border"));
		panel_Output_Option.setBackground(new Color(240, 230, 140));
		panel_Output_Option.setLayout(null);
		panel_Output_Option.setBounds(318, 62, 128, 152);
		Dritare.getContentPane().add(panel_Output_Option);
		
		JLabel Type_Of_Output_Label = new JLabel("Tipi  i Outputit :");
		Type_Of_Output_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Type_Of_Output_Label.setForeground(new Color(220, 20, 60));
		Type_Of_Output_Label.setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		Type_Of_Output_Label.setBackground(Color.WHITE);
		Type_Of_Output_Label.setBounds(10, 11, 108, 14);
		panel_Output_Option.add(Type_Of_Output_Label);
		
		Celsius_O = new JRadioButton("Celsius");
		Celsius_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Celsius_O.isSelected())
				{
					Fahrenheit_O.setSelected(false);
					Kelvin_O.setSelected(false);
					
				}
			}
		});	
		Celsius_O.setBounds(10, 32, 109, 23);
		panel_Output_Option.add(Celsius_O);
		
		Fahrenheit_O = new JRadioButton("Fahrenheit");
		Fahrenheit_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Fahrenheit_O.isSelected())
				{
					Celsius_O.setSelected(false);
					Kelvin_O.setSelected(false);
					
				}
			}
		});	
		Fahrenheit_O.setBounds(9, 58, 109, 23);
		panel_Output_Option.add(Fahrenheit_O);
		
		Kelvin_O = new JRadioButton("Kelvin");
		Kelvin_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Kelvin_O.isSelected())
				{
					Fahrenheit_O.setSelected(false);
					Celsius_O.setSelected(false);
					
						
				}
			}
		});	
		Kelvin_O.setBounds(9, 84, 109, 23);
		panel_Output_Option.add(Kelvin_O);
		
		JPanel panel_Input = new JPanel();
		panel_Input.setBorder(UIManager.getBorder("FormattedTextField.border"));
		panel_Input.setBackground(new Color(240, 230, 140));
		panel_Input.setBounds(165, 62, 128, 91);
		Dritare.getContentPane().add(panel_Input);
		
		JLabel Input_Label = new JLabel("Inputi :");
		Input_Label.setFont(new Font("Berlin Sans FB", Font.PLAIN, 14));
		Input_Label.setForeground(new Color(0, 139, 139));
		panel_Input.add(Input_Label);
		
		textField_I = new JTextField();
		textField_I.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_I.setText("0");
		panel_Input.add(textField_I);
		textField_I.setColumns(10);
		
		JPanel panel_Input_Option = new JPanel();
		panel_Input_Option.setBorder(UIManager.getBorder("FormattedTextField.border"));
		panel_Input_Option.setLayout(null);
		panel_Input_Option.setBackground(new Color(240, 230, 140));
		panel_Input_Option.setBounds(10, 62, 128, 152);
		Dritare.getContentPane().add(panel_Input_Option);
		
		JLabel Type_Of_Input_Label = new JLabel("Tipi  i Inputit :");
		Type_Of_Input_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Type_Of_Input_Label.setForeground(new Color(220, 20, 60));
		Type_Of_Input_Label.setFont(new Font("Berlin Sans FB", Font.PLAIN, 12));
		Type_Of_Input_Label.setBackground(Color.WHITE);
		Type_Of_Input_Label.setBounds(10, 11, 79, 14);
		panel_Input_Option.add(Type_Of_Input_Label);
		
		Celsius_I = new JRadioButton("Celsius");
		Celsius_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Celsius_I.isSelected())
				{
					Fahrenheit_I.setSelected(false);
					Kelvin_I.setSelected(false);
					
				}
			}
		});
		Celsius_I.setBounds(10, 32, 109, 23);
		panel_Input_Option.add(Celsius_I);
		
		Fahrenheit_I = new JRadioButton("Fahrenheit");
		Fahrenheit_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Fahrenheit_I.isSelected())
				{
					Celsius_I.setSelected(false);
					Kelvin_I.setSelected(false);
				}
			}
		});
		
		Fahrenheit_I.setBounds(9, 58, 109, 23);
		panel_Input_Option.add(Fahrenheit_I);
		
		Kelvin_I = new JRadioButton("Kelvin");
		Kelvin_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Kelvin_I.isSelected())
				{
					Fahrenheit_I.setSelected(false);
					Celsius_I.setSelected(false);
				}
			}
		});
		Kelvin_I.setBounds(9, 84, 109, 23);
		panel_Input_Option.add(Kelvin_I);
		
		JButton Butoni_Konverto = new JButton("KONVERTO");
		Butoni_Konverto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String Temp_Input=textField_I.getText();
				try {                                         
					double x = Double.parseDouble(Temp_Input);
					System.out.println(x);  
					
//---------------------------------------------------------------------------------------------------------
					textField_O.setText(" "); // per te pastruar vleren e outputit 
					if (Celsius_I.isSelected() && Celsius_O.isSelected()) {
						double Temp_Output = x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Celsius_I.isSelected() && Fahrenheit_O.isSelected()) {
						double Temp_Output = (x*9/5)+32 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Celsius_I.isSelected() && Kelvin_O.isSelected()) {
						double Temp_Output = x+273.15 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					
//=============================================================================================================

					if (Fahrenheit_I.isSelected() && Celsius_O.isSelected()) {
						double Temp_Output = (x-32)*5/9 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Fahrenheit_I.isSelected() && Fahrenheit_O.isSelected()) {
						double Temp_Output = x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Fahrenheit_I.isSelected() && Kelvin_O.isSelected()) {
						double Temp_Output = ((x-32)*5/9)+273.15;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					
//=============================================================================================================
					if (Kelvin_I.isSelected() && Celsius_O.isSelected()) {
						double Temp_Output = x-273.15 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Kelvin_I.isSelected() && Fahrenheit_O.isSelected()) {
						double Temp_Output =( x-273.15)*9/5 +32 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Kelvin_I.isSelected() && Kelvin_O.isSelected()) {
						double Temp_Output = x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					

					} catch (NumberFormatException a) {  
					    a.printStackTrace();
					    // perballet me errorin numberFormatExeption
					}
				
			}
		});
		Butoni_Konverto.setBackground(new Color(64, 224, 208));
		Butoni_Konverto.setForeground(new Color(255, 69, 0));
		Butoni_Konverto.setFont(new Font("Georgia", Font.PLAIN, 12));
		Butoni_Konverto.setBounds(173, 165, 112, 23);
		Dritare.getContentPane().add(Butoni_Konverto);
		
		textField_O = new JTextField();
		textField_O.setBackground(new Color(127, 255, 212));
		textField_O.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_O.setEditable(false);
		textField_O.setBounds(158, 216, 135, 20);
		Dritare.getContentPane().add(textField_O);
		textField_O.setColumns(10);
		
	
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
