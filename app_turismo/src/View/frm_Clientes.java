package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.Operadores;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class frm_Clientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txttipodocumento;
	private JTextField txtdocumento;
	private JTextField txtnombres;
	private JTextField txtApellidos;
	private JTextField txtEps;
	private JTextField txtAlergias;
	private JTextField txtFechaNacimiento;
	private JTextField txtCorreo;
	private JTextField txtEstadoCivil;
	private JTextField txtid;
	private JTextField txtTelefono;
	private JTextField txtID;
	Clientes cr = new Clientes ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Clientes frame = new frm_Clientes();
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
	public frm_Clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(203, 194, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE CLIENTES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(208, 0, 200, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID CLIENTE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 21, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo Documento");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 62, 85, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("N° Documento");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(105, 65, 99, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Nombres");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(247, 62, 104, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Apellidos");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2.setBounds(408, 62, 77, 14);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel EPS = new JLabel("EPS");
		EPS.setFont(new Font("Tahoma", Font.BOLD, 11));
		EPS.setBounds(10, 109, 85, 14);
		contentPane.add(EPS);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Alergias");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(106, 109, 77, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Fecha Nacimiento");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_3.setBounds(421, 109, 113, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Correo");
		lblNewLabel_1_1_4.setToolTipText("");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_4.setBounds(10, 160, 77, 14);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Estado Civil");
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_5.setBounds(245, 109, 99, 14);
		contentPane.add(lblNewLabel_1_1_5);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(9, 76, 35, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setColumns(10);
		txtdocumento.setBounds(96, 76, 135, 20);
		contentPane.add(txtdocumento);
		
		txtnombres = new JTextField();
		txtnombres.setColumns(10);
		txtnombres.setBounds(247, 78, 136, 20);
		contentPane.add(txtnombres);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(399, 76, 135, 20);
		contentPane.add(txtApellidos);
		
		txtEps = new JTextField();
		txtEps.setColumns(10);
		txtEps.setBounds(10, 129, 77, 20);
		contentPane.add(txtEps);
		
		txtAlergias = new JTextField();
		txtAlergias.setColumns(10);
		txtAlergias.setBounds(96, 129, 135, 20);
		contentPane.add(txtAlergias);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setToolTipText("AA/MM/DD");
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(430, 129, 91, 20);
		contentPane.add(txtFechaNacimiento);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(10, 174, 113, 20);
		contentPane.add(txtCorreo);
		
		txtEstadoCivil = new JTextField();
		txtEstadoCivil.setColumns(10);
		txtEstadoCivil.setBounds(242, 129, 85, 20);
		contentPane.add(txtEstadoCivil);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290866_documents_download_download files_file_files_icon.png"));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				cr.create(Integer.parseInt(txtid.getText()),Integer.parseInt(txttipodocumento.getText()),Integer.parseInt(txtdocumento.getText()),txtnombres.getText(),txtApellidos.getText(),txtEps.getText(),txtAlergias.getText(),txtFechaNacimiento.getText(),txtCorreo.getText(),txtEstadoCivil.getText(),txtTelefono.getText());
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(357, 170, 164, 45);
		contentPane.add(btnRegistrar);
		
		txtid = new JTextField();
		txtid.setBounds(90, 15, 35, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(337, 109, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(337, 129, 85, 20);
		contentPane.add(txtTelefono);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 226, 543, 31);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID CLIENTE");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(96, 304, 92, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(165, 301, 83, 20);
		contentPane.add(txtID);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290850_clean_delete_garbage_recycle bin_trash_icon.png"));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtID.getText()));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(300, 284, 137, 54);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("ELIMINAR REGISTRO EXISTENTE");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(165, 243, 186, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnNewButton_2 = new JButton("CANCELAR");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9027292_cancel_icon.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(165, 166, 148, 49);
		contentPane.add(btnNewButton_2);
	}
}
