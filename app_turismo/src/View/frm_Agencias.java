package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencia;
import Model.Clientes;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_Agencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtWeb;
	private JTextField txtCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Agencias frame = new frm_Agencias();
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
	public frm_Agencias() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 267);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 193, 227));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE AGENCIAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(146, 11, 253, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(34, 58, 83, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccin = new JLabel("Dirección");
		lblDireccin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDireccin.setBounds(163, 58, 67, 14);
		contentPane.add(lblDireccin);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCorreo.setBounds(292, 58, 78, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefono.setBounds(34, 120, 83, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblPaginaWeb = new JLabel("Pagina Web");
		lblPaginaWeb.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPaginaWeb.setBounds(163, 120, 83, 14);
		contentPane.add(lblPaginaWeb);
		
		JLabel lblIdCompaia = new JLabel("Id Compañia");
		lblIdCompaia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdCompaia.setBounds(292, 120, 78, 14);
		contentPane.add(lblIdCompaia);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 72, 117, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(137, 72, 117, 20);
		contentPane.add(txtDireccion);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(264, 72, 117, 20);
		contentPane.add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(10, 133, 117, 20);
		contentPane.add(txtTelefono);
		
		txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(137, 133, 117, 20);
		contentPane.add(txtWeb);
		
		JTextField txtIdCompania = new JTextField();
		txtIdCompania.setColumns(10);
		txtIdCompania.setBounds(264, 133, 117, 20);
		contentPane.add(txtIdCompania);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Agencia cr = new  Agencia();
				cr.create(txtNombre.getText(),txtDireccion.getText(),txtCorreo.getText(),Integer.parseInt(txtTelefono.getText()),txtWeb.getText(),Integer.parseInt(txtIdCompania.getText()));
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(264, 194, 106, 23);
		contentPane.add(btnNewButton);
		
		txtCancelar = new JTextField();
		txtCancelar.setHorizontalAlignment(SwingConstants.CENTER);
		txtCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCancelar.setText("CANCELAR");
		txtCancelar.setColumns(10);
		txtCancelar.setBounds(137, 195, 117, 20);
		contentPane.add(txtCancelar);
	}

}
