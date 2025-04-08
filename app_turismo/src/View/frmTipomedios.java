package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tipomedios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class frmTipomedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtObservacion;
	private JTextField txtNombre;
	private JTextField txtMedios;
	Tipomedios cr = new Tipomedios ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipomedios frame = new frmTipomedios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmTipomedios() {
		setBackground(new Color(185, 173, 209));
		setTitle("Tipo Medios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 255);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(185, 173, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(198, 64, 0, 0);
		contentPane.add(list);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(20, 50, 85, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Observacion");
		lblNewLabel_1.setBounds(20, 102, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		txtObservacion = new JTextField();
		txtObservacion.setBounds(86, 95, 112, 28);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		 btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290866_documents_download_download files_file_files_icon.png"));
		 btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			
			
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtNombre.getText(),txtObservacion.getText());
			}
		});
		btnRegistrar.setBounds(10, 156, 164, 44);
		contentPane.add(btnRegistrar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(73, 47, 125, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(342, 0, 15, 200);
		contentPane.add(separator);
		
		JLabel lblRegistroDeTipo = new JLabel("REGISTRO DE TIPO DE MEDIOS");
		lblRegistroDeTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRegistroDeTipo.setBounds(20, 11, 274, 25);
		contentPane.add(lblRegistroDeTipo);
		
		JLabel lblNewLabel_1_10 = new JLabel("OPCIONES DE REGISTROS EXISTENTES");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_10.setBounds(434, 16, 230, 14);
		contentPane.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID MEDIOS");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(431, 65, 92, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtMedios = new JTextField();
		txtMedios.setColumns(10);
		txtMedios.setBounds(548, 62, 52, 20);
		contentPane.add(txtMedios);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290850_clean_delete_garbage_recycle bin_trash_icon.png"));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtMedios.getText()));
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(367, 102, 128, 45);
		contentPane.add(btnDelete);
		
		
		JButton btnNewButton_3 = new JButton("BUSCAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Read(Integer.parseInt(txtMedios.getText()), txtNombre, txtObservacion);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(526, 102, 146, 45);
		contentPane.add(btnNewButton_3); 
		
		JButton btnUpdate = new JButton("ACTUALIZAR");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(txtMedios.getText()),txtNombre.getText(),txtObservacion.getText());
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\592600_arrow_cycle_interface_update_icon.png"));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.setBounds(428, 154, 172, 48);
		contentPane.add(btnUpdate);
	}
}
