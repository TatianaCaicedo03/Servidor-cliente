package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Companias;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class frm_Companias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRazonSoc;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtFechacreac;
	private JTextField txtWeb;
	Companias cr = new Companias ();
	private JTextField txtIDCompañia;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Companias frame = new frm_Companias();
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
	public frm_Companias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 193, 227));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE COMPAÑIAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(128, 11, 184, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Razón Social");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 52, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dirección");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(152, 52, 78, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(301, 52, 78, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Telefono");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 109, 78, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Fecha de Creación");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(152, 109, 104, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Pagina Web");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(301, 109, 78, 14);
		contentPane.add(lblNewLabel_1_5);
		
		txtRazonSoc = new JTextField();
		txtRazonSoc.setBounds(10, 65, 122, 20);
		contentPane.add(txtRazonSoc);
		txtRazonSoc.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(152, 65, 122, 20);
		contentPane.add(txtDireccion);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(301, 65, 122, 20);
		contentPane.add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(10, 123, 122, 20);
		contentPane.add(txtTelefono);
		
		txtFechacreac = new JTextField();
		txtFechacreac.setToolTipText("AA/MM/DD");
		txtFechacreac.setColumns(10);
		txtFechacreac.setBounds(152, 123, 122, 20);
		contentPane.add(txtFechacreac);
		
		txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(301, 123, 122, 20);
		contentPane.add(txtWeb);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290866_documents_download_download files_file_files_icon.png"));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//CREATE
				cr.create(txtRazonSoc.getText(),txtDireccion.getText(),txtCorreo.getText(),txtTelefono.getText(),txtFechacreac.getText(),txtWeb.getText());
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(270, 210, 153, 45);
		contentPane.add(btnRegistrar);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(433, 0, 15, 233);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID COMPAÑIA");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(444, 52, 92, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtIDCompañia = new JTextField();
		txtIDCompañia.setColumns(10);
		txtIDCompañia.setBounds(532, 49, 52, 20);
		contentPane.add(txtIDCompañia);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290850_clean_delete_garbage_recycle bin_trash_icon.png"));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//DELETE
				cr.delete(Integer.parseInt(txtIDCompañia.getText()));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(640, 207, 141, 48);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_6 = new JLabel("OPCIONES");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_6.setBounds(444, 11, 186, 14);
		contentPane.add(lblNewLabel_1_6);
	
	JButton btnNewButton_3 = new JButton("BUSCAR");
	btnNewButton_3.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			//READ
			cr.Read(Integer.parseInt(txtIDCompañia.getText()), txtRazonSoc, txtDireccion, txtCorreo, txtTelefono, txtFechacreac, txtWeb);
		}
	});
	btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
	btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
	btnNewButton_3.setBounds(621, 51, 153, 48);
	contentPane.add(btnNewButton_3); 
	
	JButton btnUpdate = new JButton("ACTUALIZAR");
	btnUpdate.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			//UPDATE
			cr.Update(Integer.parseInt(txtIDCompañia.getText()),txtRazonSoc.getText(),txtDireccion.getText(),txtCorreo.getText(),txtTelefono.getText(),txtFechacreac.getText(),txtWeb.getText());
		}
	});
	btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\592600_arrow_cycle_interface_update_icon.png"));
	btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
	btnUpdate.setBounds(602, 123, 172, 48);
	contentPane.add(btnUpdate);
}
}
