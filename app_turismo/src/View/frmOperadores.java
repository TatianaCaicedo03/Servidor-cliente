package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Operadores;
import Model.Tipomedios;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtApellidos;
	private JTextField txtNumeroDoc;
	private JTextField txtNombres;
	private JTextField txtTipoDoc;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtIdMatricula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmOperadores frame = new frmOperadores();
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
	public frmOperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 202, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE OPERADORES ");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(230, 11, 204, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lbltipodoc = new JLabel("Tipo de documento");
		lbltipodoc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbltipodoc.setBounds(20, 57, 116, 14);
		contentPane.add(lbltipodoc);
		
		JLabel lblNewLabel_1_1 = new JLabel("Numero de documento");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(146, 57, 133, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombres");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(348, 57, 86, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(493, 73, 173, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtNumeroDoc = new JTextField();
		txtNumeroDoc.setColumns(10);
		txtNumeroDoc.setBounds(146, 73, 116, 20);
		contentPane.add(txtNumeroDoc);
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		txtNombres.setBounds(283, 73, 187, 20);
		contentPane.add(txtNombres);
		
		JList list = new JList();
		list.setBounds(41, 54, 1, 1);
		contentPane.add(list);
		
		txtTipoDoc = new JTextField();
		txtTipoDoc.setBounds(20, 73, 86, 20);
		contentPane.add(txtTipoDoc);
		txtTipoDoc.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(533, 57, 133, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 118, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Correo");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(200, 118, 69, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Telefono");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(348, 118, 86, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Matricula del vehiculo");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(520, 118, 133, 14);
		contentPane.add(lblNewLabel_1_5);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(10, 132, 116, 20);
		contentPane.add(txtDireccion);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(146, 132, 133, 20);
		contentPane.add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(307, 132, 127, 20);
		contentPane.add(txtTelefono);
		
		txtIdMatricula = new JTextField();
		txtIdMatricula.setColumns(10);
		txtIdMatricula.setBounds(493, 132, 187, 20);
		contentPane.add(txtIdMatricula);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Operadores cr = new Operadores ();
				cr.create(Integer.parseInt(txtTipoDoc.getText()),Integer.parseInt(txtNumeroDoc.getText()),txtNombres.getText(),txtApellidos.getText(),txtDireccion.getText(),txtCorreo.getText(),txtTelefono.getText(),txtIdMatricula.getText());
				
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(499, 196, 127, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(329, 196, 127, 23);
		contentPane.add(btnCancelar);
	}
}
