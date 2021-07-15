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
public class Konvertim_Peshe {
	JFrame Dritare;
	public JRadioButton Gram_I;
	public JRadioButton Kilogram_I;
	public JRadioButton Paund_I;
	public JRadioButton Ton_I;
	public JRadioButton Gram_O;
	public JRadioButton Kilogram_O;
	public JRadioButton Paund_O;
	public JRadioButton Ton_O;
	public JTextField textField_I;
	public JTextField textField_O;
	
	public  Konvertim_Peshe (){

		
		Dritare = new JFrame();
		Dritare.setResizable(false);
		Dritare.getContentPane().setBackground(new Color(240, 230, 140));
		Dritare.setBounds(100, 100, 485, 333);
		Dritare.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dritare.getContentPane().setLayout(null);
		
		JLabel lblKonvertuesPeshe = new JLabel("Konvertues Peshe");
		lblKonvertuesPeshe.setBounds(0, 0, 469, 26);
		lblKonvertuesPeshe.setForeground(new Color(0, 128, 128));
		lblKonvertuesPeshe.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblKonvertuesPeshe.setHorizontalAlignment(SwingConstants.CENTER);
		Dritare.getContentPane().add(lblKonvertuesPeshe);
		
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
		
		Gram_O = new JRadioButton("Gram");
		Gram_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Gram_O.isSelected())
				{
					Kilogram_O.setSelected(false);
					Paund_O.setSelected(false);
					Ton_O.setSelected(false);
						
				}
			}
		});	
		Gram_O.setBounds(10, 32, 109, 23);
		panel_Output_Option.add(Gram_O);
		
		Kilogram_O = new JRadioButton("Kilogram");
		Kilogram_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Kilogram_O.isSelected())
				{
					Gram_O.setSelected(false);
					Paund_O.setSelected(false);
					Ton_O.setSelected(false);
						
				}
			}
		});	
		Kilogram_O.setBounds(9, 58, 109, 23);
		panel_Output_Option.add(Kilogram_O);
		
		Paund_O = new JRadioButton("Paund");
		Paund_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Paund_O.isSelected())
				{
					Kilogram_O.setSelected(false);
					Gram_O.setSelected(false);
					Ton_O.setSelected(false);
						
				}
			}
		});	
		Paund_O.setBounds(9, 84, 109, 23);
		panel_Output_Option.add(Paund_O);
		
		Ton_O = new JRadioButton("Ton");
		Ton_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Ton_O.isSelected())
				{
					Kilogram_O.setSelected(false);
					Paund_O.setSelected(false);
					Gram_O.setSelected(false);
						
				}
			}
		});	
		Ton_O.setBounds(9, 110, 109, 23);
		panel_Output_Option.add(Ton_O);
		
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
		
		Gram_I = new JRadioButton("Gram");
		Gram_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Gram_I.isSelected())
				{
					Kilogram_I.setSelected(false);
					Paund_I.setSelected(false);
					Ton_I.setSelected(false);
						
				}
			}
		});
		Gram_I.setBounds(10, 32, 109, 23);
		panel_Input_Option.add(Gram_I);
		
		Kilogram_I = new JRadioButton("Kilogram");
		Kilogram_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Kilogram_I.isSelected())
				{
					Gram_I.setSelected(false);
					Paund_I.setSelected(false);
					Ton_I.setSelected(false);
						
				}
			}
		});
		
		Kilogram_I.setBounds(9, 58, 109, 23);
		panel_Input_Option.add(Kilogram_I);
		
		Paund_I = new JRadioButton("Paund");
		Paund_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Paund_I.isSelected())
				{
					Kilogram_I.setSelected(false);
					Gram_I.setSelected(false);
					Ton_I.setSelected(false);
						
				}
			}
		});
		Paund_I.setBounds(9, 84, 109, 23);
		panel_Input_Option.add(Paund_I);
		
		Ton_I = new JRadioButton("Ton");
		Ton_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Ton_I.isSelected())
				{
					Kilogram_I.setSelected(false);
					Paund_I.setSelected(false);
					Gram_I.setSelected(false);
						
				}
			}
		});
		Ton_I.setBounds(9, 110, 109, 23);
		panel_Input_Option.add(Ton_I);
		
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
					if (Gram_I.isSelected() && Gram_O.isSelected()) {
						double Temp_Output = x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Gram_I.isSelected() && Kilogram_O.isSelected()) {
						double Temp_Output = 0.001*x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Gram_I.isSelected() && Paund_O.isSelected()) {
						double Temp_Output = x/454 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					else  if(Gram_I.isSelected() && Ton_O.isSelected()) {
						double Temp_Output =x/1000000 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
//=============================================================================================================

					if (Kilogram_I.isSelected() && Gram_O.isSelected()) {
						double Temp_Output = 1000*x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Kilogram_I.isSelected() && Kilogram_O.isSelected()) {
						double Temp_Output = x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Kilogram_I.isSelected() && Paund_O.isSelected()) {
						double Temp_Output = 2.205*x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					else  if(Kilogram_I.isSelected() && Ton_O.isSelected()) {
						double Temp_Output = x/1000 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
//=============================================================================================================
					if (Paund_I.isSelected() && Gram_O.isSelected()) {
						double Temp_Output = 454*x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Paund_I.isSelected() && Kilogram_O.isSelected()) {
						double Temp_Output =x/2.205 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Paund_I.isSelected() && Paund_O.isSelected()) {
						double Temp_Output = x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					else  if(Paund_I.isSelected() && Ton_O.isSelected()) {
						double Temp_Output = x/2205 ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
//=============================================================================================================					
					if (Ton_I.isSelected() && Gram_O.isSelected()) {
						double Temp_Output = 1000000*x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
						
					}
					else  if(Ton_I.isSelected() && Kilogram_O.isSelected()) {
						double Temp_Output =1000*x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					else  if(Ton_I.isSelected() && Paund_O.isSelected()) {
						double Temp_Output = 2205*x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
					
					else  if(Ton_I.isSelected() && Ton_O.isSelected()) {
						double Temp_Output = x ;
						String Final_Output=String.valueOf(Temp_Output);
						textField_O.setText(Final_Output);
					}
//=============================================================================================================					
										
					

					} catch (NumberFormatException a) {  
					    a.printStackTrace();
					    // perballet me errorin numberformatexeption
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
