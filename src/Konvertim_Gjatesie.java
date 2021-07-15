
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Konvertim_Gjatesie {
	JFrame Dritare;
	public JRadioButton Centimeter_I;
	public JRadioButton Meter_I;
	public JRadioButton Dekameter_I;
	public JRadioButton Kilometer_I;
	public JRadioButton Centimeter_O;
	public JRadioButton Meter_O;
	public JRadioButton Dekameter_O;
	public JRadioButton Kilometer_O;
	public JTextField textField_I;
	public JTextField textField_O;

	
	public Konvertim_Gjatesie  (){
		

		
		Dritare = new JFrame();
		Dritare.setResizable(false);
		Dritare.getContentPane().setBackground(new Color(240, 230, 140));
		Dritare.setBounds(100, 100, 485, 333);
		Dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dritare.getContentPane().setLayout(null);
		
		JLabel Label_Konvertues = new JLabel("Konvertues Gjatesie");
		Label_Konvertues.setBounds(0, 0, 469, 26);
		Label_Konvertues.setForeground(new Color(0, 128, 128));
		Label_Konvertues.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		Label_Konvertues.setHorizontalAlignment(SwingConstants.CENTER);
		Dritare.getContentPane().add(Label_Konvertues);
		
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
		
		Centimeter_O = new JRadioButton("Centimeter");
		Centimeter_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Centimeter_O.isSelected())
				{
					Meter_O.setSelected(false);
					Dekameter_O.setSelected(false);
					Kilometer_O.setSelected(false);
						
				}
			}
		});	
		Centimeter_O.setBounds(10, 32, 109, 23);
		panel_Output_Option.add(Centimeter_O);
		
		Meter_O = new JRadioButton("Meter");
		Meter_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Meter_O.isSelected())
				{
					Centimeter_O.setSelected(false);
					Dekameter_O.setSelected(false);
					Kilometer_O.setSelected(false);
						
				}
			}
		});	
		Meter_O.setBounds(9, 58, 109, 23);
		panel_Output_Option.add(Meter_O);
		
		Dekameter_O = new JRadioButton("Dekameter");
		Dekameter_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Dekameter_O.isSelected())
				{
					Meter_O.setSelected(false);
					Centimeter_O.setSelected(false);
					Kilometer_O.setSelected(false);
						
				}
			}
		});	
		Dekameter_O.setBounds(9, 84, 109, 23);
		panel_Output_Option.add(Dekameter_O);
		
		Kilometer_O = new JRadioButton("Kilometer");
		Kilometer_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Kilometer_O.isSelected())
				{
					Meter_O.setSelected(false);
					Dekameter_O.setSelected(false);
					Centimeter_O.setSelected(false);
						
				}
			}
		});	
		Kilometer_O.setBounds(9, 110, 109, 23);
		panel_Output_Option.add(Kilometer_O);
		
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
		
		Centimeter_I = new JRadioButton("Centimeter");
		Centimeter_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Centimeter_I.isSelected())
				{
					Meter_I.setSelected(false);
					Dekameter_I.setSelected(false);
					Kilometer_I.setSelected(false);
						
				}
			}
		});
		Centimeter_I.setBounds(10, 32, 109, 23);
		panel_Input_Option.add(Centimeter_I);
		
		Meter_I = new JRadioButton("Meter");
		Meter_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Meter_I.isSelected())
				{
					Centimeter_I.setSelected(false);
					Dekameter_I.setSelected(false);
					Kilometer_I.setSelected(false);
						
				}
			}
		});
		
		Meter_I.setBounds(9, 58, 109, 23);
		panel_Input_Option.add(Meter_I);
		
		Dekameter_I = new JRadioButton("Dekameter");
		Dekameter_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Dekameter_I.isSelected())
				{
					Meter_I.setSelected(false);
					Centimeter_I.setSelected(false);
					Kilometer_I.setSelected(false);
						
				}
			}
		});
		Dekameter_I.setBounds(9, 84, 109, 23);
		panel_Input_Option.add(Dekameter_I);
		
		Kilometer_I = new JRadioButton("Kilometer");
		Kilometer_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Kilometer_I.isSelected())
				{
					Meter_I.setSelected(false);
					Dekameter_I.setSelected(false);
					Centimeter_I.setSelected(false);
						
				}
			}
		});
		Kilometer_I.setBounds(9, 110, 109, 23);
		panel_Input_Option.add(Kilometer_I);
		
		JButton Buton_Konvertimi = new JButton("KONVERTO");
		Buton_Konvertimi.setBackground(new Color(64, 224, 208));
		Buton_Konvertimi.setForeground(new Color(255, 69, 0));
		Buton_Konvertimi.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				String Temp_Input=textField_I.getText();
				try {                                          
					double vlera_e_inputit = Double.parseDouble(Temp_Input);
					System.out.println(vlera_e_inputit);  
					
//---------------------------------------------------------------------------------------------------------
					textField_O.setText(" "); // per te pastruar vleren e outputit 
					if (Centimeter_I.isSelected() && Centimeter_O.isSelected()) {
						double Temp_Output = vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Centimeter_I.isSelected() && Meter_O.isSelected()) {
						double Temp_Output = 0.01*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Centimeter_I.isSelected() && Dekameter_O.isSelected()) {
						double Temp_Output = 0.001*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					else  if(Centimeter_I.isSelected() && Kilometer_O.isSelected()) {
						double Temp_Output = 0.00001*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
//=============================================================================================================

					if (Meter_I.isSelected() && Centimeter_O.isSelected()) {
						double Temp_Output = 100*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Meter_I.isSelected() && Meter_O.isSelected()) {
						double Temp_Output = vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Meter_I.isSelected() && Dekameter_O.isSelected()) {
						double Temp_Output = 0.1*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					else  if(Meter_I.isSelected() && Kilometer_O.isSelected()) {
						double Temp_Output = 0.001*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
//=============================================================================================================
					if (Dekameter_I.isSelected() && Centimeter_O.isSelected()) {
						double Temp_Output = 1000*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Dekameter_I.isSelected() && Meter_O.isSelected()) {
						double Temp_Output =10*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Dekameter_I.isSelected() && Dekameter_O.isSelected()) {
						double Temp_Output = vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					else  if(Dekameter_I.isSelected() && Kilometer_O.isSelected()) {
						double Temp_Output = 0.01*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
//=============================================================================================================					
					if (Kilometer_I.isSelected() && Centimeter_O.isSelected()) {
						double Temp_Output = 10000*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Kilometer_I.isSelected() && Meter_O.isSelected()) {
						double Temp_Output =1000*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Kilometer_I.isSelected() && Dekameter_O.isSelected()) {
						double Temp_Output = 100*vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					else  if(Kilometer_I.isSelected() && Kilometer_O.isSelected()) {
						double Temp_Output = vlera_e_inputit ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
//=============================================================================================================					
		

					} catch (NumberFormatException a) {  
					    a.printStackTrace();
					    //perballet me errorin numberFormatExeption
					    }
				
			}
		});

		Buton_Konvertimi.setFont(new Font("Georgia", Font.PLAIN, 12));
		Buton_Konvertimi.setBounds(173, 165, 112, 23);
		Dritare.getContentPane().add(Buton_Konvertimi);
		
		textField_O = new JTextField();
		textField_O.setBackground(new Color(127, 255, 212));
		textField_O.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_O.setEditable(false);
		textField_O.setBounds(158, 216, 135, 20);
		Dritare.getContentPane().add(textField_O);
		textField_O.setColumns(10);
		}
	
	public static void main(String[] args) {
	

	}

}
