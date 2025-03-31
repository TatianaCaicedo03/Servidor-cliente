package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotores;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frm_Promotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipoDoc;
	private JTextField txtNumeroDoc;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDireccion;
	private JTextField txtCorreoper;
	private JTextField txtCorreoCorp;
	private JTextField txtFechaNac;
	private JTextField txtTelefono;
	private JTextField txtIdAgencia;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Promotores frame = new frm_Promotores();
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
	public frm_Promotores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 193, 227));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE PROMOTOTRES TURISTICOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(69, 11, 274, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("tipo documento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(59, 43, 91, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("N° Documento");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(180, 43, 91, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombres");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(327, 43, 91, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Telefono");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(244, 150, 91, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Apellidos");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(10, 99, 91, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Direccion");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(127, 99, 91, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Correo personal");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_6.setBounds(252, 99, 91, 14);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("ID Agencia");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_7.setBounds(20, 194, 91, 14);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Correo Laboral");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_8.setBounds(10, 150, 91, 14);
		contentPane.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Fecha Naciemiento");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_9.setBounds(127, 150, 107, 14);
		contentPane.add(lblNewLabel_1_9);
		
		txtTipoDoc = new JTextField();
		txtTipoDoc.setBounds(59, 57, 91, 20);
		contentPane.add(txtTipoDoc);
		txtTipoDoc.setColumns(10);
		
		txtNumeroDoc = new JTextField();
		txtNumeroDoc.setColumns(10);
		txtNumeroDoc.setBounds(177, 57, 129, 20);
		contentPane.add(txtNumeroDoc);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(323, 57, 120, 20);
		contentPane.add(txtNombre);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(10, 113, 107, 20);
		contentPane.add(txtApellidos);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(127, 113, 107, 20);
		contentPane.add(txtDireccion);
		
		txtCorreoper = new JTextField();
		txtCorreoper.setColumns(10);
		txtCorreoper.setBounds(252, 113, 107, 20);
		contentPane.add(txtCorreoper);
		
		txtCorreoCorp = new JTextField();
		txtCorreoCorp.setColumns(10);
		txtCorreoCorp.setBounds(10, 163, 107, 20);
		contentPane.add(txtCorreoCorp);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(127, 163, 107, 20);
		contentPane.add(txtFechaNac);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(244, 163, 107, 20);
		contentPane.add(txtTelefono);
		
		txtIdAgencia = new JTextField();
		txtIdAgencia.setColumns(10);
		txtIdAgencia.setBounds(10, 208, 107, 20);
		contentPane.add(txtIdAgencia);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Promotores cr= new Promotores(Integer.parseInt(txtId.getText()),Integer.parseInt(txtTipoDoc.getText()),Integer.parseInt(txtNumeroDoc.getText()),txtNombre.getText(),txtApellidos.getText(),txtDireccion.getText(),txtCorreoper.getText(),txtCorreoCorp.getText(),txtFechaNac.getText(),txtTelefono.getText(),Integer.parseInt(txtIdAgencia.getText()));
			cr.Create(Integer.parseInt(txtId.getText()),Integer.parseInt(txtTipoDoc.getText()),Integer.parseInt(txtNumeroDoc.getText()),txtNombre.getText(),txtApellidos.getText(),txtDireccion.getText(),txtCorreoper.getText(),txtCorreoCorp.getText(),txtFechaNac.getText(),txtTelefono.getText(),Integer.parseInt(txtIdAgencia.getText()));
				
				
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(304, 227, 98, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(196, 227, 98, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 40, 69, 20);
		contentPane.add(lblNewLabel_2);
		
		txtId = new JTextField();
		txtId.setBounds(10, 57, 37, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
	}

}
