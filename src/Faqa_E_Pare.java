import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//Per Kte projekt esht perdorur java version 8

	
public class Faqa_E_Pare {
	private JFrame Dritarja_Menu;
	
	public Faqa_E_Pare () {
		Dritarja_Menu = new JFrame();
		Dritarja_Menu.setTitle("Menu");
		Dritarja_Menu.setBackground(new Color(255, 255, 255));
		Dritarja_Menu.getContentPane().setBackground(new Color(255, 215, 0));
		Dritarja_Menu.getContentPane().setLayout(null);
		
		JPanel Paneli_I_Titullit = new JPanel();
		Paneli_I_Titullit.setBorder(UIManager.getBorder("ComboBox.border"));
		Paneli_I_Titullit.setBackground(new Color(255, 140, 0));
		Paneli_I_Titullit.setBounds(10, 11, 414, 33);
		Dritarja_Menu.getContentPane().add(Paneli_I_Titullit);
		
		JLabel Label_Titull = new JLabel("Konvertues");
		Paneli_I_Titullit.add(Label_Titull);

		Label_Titull.setForeground(new Color(25, 25, 112));
		Label_Titull.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		Label_Titull.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel Paneli_I_Butonave = new JPanel();
		Paneli_I_Butonave.setBounds(10, 157, 414, 33);
		Dritarja_Menu.getContentPane().add(Paneli_I_Butonave);
		
		JButton Butoni_Temperature = new JButton("Temperature");
		 Butoni_Temperature.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {   //kur klikohet butoni hapet faqja e gjatesise
					Konvertim_Temperature window = new Konvertim_Temperature();
					window.Dritare.setVisible(true);
				}
			});
		Butoni_Temperature.setForeground(new Color(0, 0, 0));
		Butoni_Temperature.setBackground(new Color(0, 191, 255));
		Paneli_I_Butonave.add(Butoni_Temperature);
		
		JButton Butoni_Gjatesi = new JButton("Gjatesi");
        Butoni_Gjatesi.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {   //kur klikohet butoni hapet faqja e gjatesise
				Konvertim_Gjatesie window = new Konvertim_Gjatesie();
				window.Dritare.setVisible(true);
			}
		});
		Butoni_Gjatesi.setBackground(new Color(0, 191, 255));
		Paneli_I_Butonave.add(Butoni_Gjatesi);
		
		JButton Butoni_Peshe = new JButton("Peshe  ");
        Butoni_Peshe.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {   //kur klikohet butoni hapet faqja  e peshes
				Konvertim_Peshe window = new Konvertim_Peshe();
				window.Dritare.setVisible(true);
			}
		});
		Butoni_Peshe.setBackground(new Color(0, 191, 255));
		Paneli_I_Butonave.add(Butoni_Peshe);
		
		Dritarja_Menu.setBounds(100, 100, 450, 300);
		Dritarja_Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faqa_E_Pare faqa = new Faqa_E_Pare();
		faqa.Dritarja_Menu.setVisible(true);	

	}

	}
	
