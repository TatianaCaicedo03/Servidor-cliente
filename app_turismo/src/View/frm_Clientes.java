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
		setBounds(100, 100, 626, 331);
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
		lblNewLabel_1.setBounds(442, 21, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo Documento");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 62, 99, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("N° Documento");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(168, 65, 99, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Nombres");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(349, 65, 104, 14);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Apellidos");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_2.setBounds(523, 62, 77, 14);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel EPS = new JLabel("EPS");
		EPS.setFont(new Font("Tahoma", Font.BOLD, 11));
		EPS.setBounds(10, 122, 85, 14);
		contentPane.add(EPS);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Alergias");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(168, 122, 77, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Fecha Nacimiento");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_3.setBounds(349, 122, 92, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Correo");
		lblNewLabel_1_1_4.setToolTipText("");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_4.setBounds(523, 122, 77, 14);
		contentPane.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Estado Civil");
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_5.setBounds(10, 174, 99, 14);
		contentPane.add(lblNewLabel_1_1_5);
		
		txttipodocumento = new JTextField();
		txttipodocumento.setBounds(9, 76, 35, 20);
		contentPane.add(txttipodocumento);
		txttipodocumento.setColumns(10);
		
		txtdocumento = new JTextField();
		txtdocumento.setColumns(10);
		txtdocumento.setBounds(151, 76, 135, 20);
		contentPane.add(txtdocumento);
		
		txtnombres = new JTextField();
		txtnombres.setColumns(10);
		txtnombres.setBounds(317, 76, 136, 20);
		contentPane.add(txtnombres);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(487, 76, 113, 20);
		contentPane.add(txtApellidos);
		
		txtEps = new JTextField();
		txtEps.setColumns(10);
		txtEps.setBounds(10, 134, 113, 20);
		contentPane.add(txtEps);
		
		txtAlergias = new JTextField();
		txtAlergias.setColumns(10);
		txtAlergias.setBounds(151, 134, 135, 20);
		contentPane.add(txtAlergias);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setToolTipText("AA/MM/DD");
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(317, 134, 136, 20);
		contentPane.add(txtFechaNacimiento);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(487, 134, 113, 20);
		contentPane.add(txtCorreo);
		
		txtEstadoCivil = new JTextField();
		txtEstadoCivil.setColumns(10);
		txtEstadoCivil.setBounds(10, 188, 113, 20);
		contentPane.add(txtEstadoCivil);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				Clientes cr = new Clientes ();
				cr.create(Integer.parseInt(txtid.getText()),Integer.parseInt(txttipodocumento.getText()),Integer.parseInt(txtdocumento.getText()),txtnombres.getText(),txtApellidos.getText(),txtEps.getText(),txtAlergias.getText(),txtFechaNacimiento.getText(),txtCorreo.getText(),txtEstadoCivil.getText(),txtTelefono.getText());
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(501, 221, 99, 31);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(381, 221, 99, 31);
		contentPane.add(btnCancelar);
		
		txtid = new JTextField();
		txtid.setBounds(514, 18, 35, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(174, 174, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(154, 188, 113, 20);
		contentPane.add(txtTelefono);
	}
}
