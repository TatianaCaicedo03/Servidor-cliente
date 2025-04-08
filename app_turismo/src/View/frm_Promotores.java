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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

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
	private JTextField txtIDPromotor;
	Promotores cr = new Promotores();

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
		setBounds(100, 100, 877, 294);
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
		lblNewLabel_1_5.setBounds(180, 99, 91, 14);
		contentPane.add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("Correo personal");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_6.setBounds(327, 99, 91, 14);
		contentPane.add(lblNewLabel_1_6);

		JLabel lblNewLabel_1_7 = new JLabel("ID Agencia");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_7.setBounds(361, 150, 91, 14);
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
		txtApellidos.setBounds(10, 113, 160, 20);
		contentPane.add(txtApellidos);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(180, 113, 126, 20);
		contentPane.add(txtDireccion);

		txtCorreoper = new JTextField();
		txtCorreoper.setColumns(10);
		txtCorreoper.setBounds(327, 113, 116, 20);
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
		txtIdAgencia.setBounds(361, 163, 69, 20);
		contentPane.add(txtIdAgencia);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// CREATE
				cr.Create(Integer.parseInt(txtId.getText()), Integer.parseInt(txtTipoDoc.getText()),
						Integer.parseInt(txtNumeroDoc.getText()), txtNombre.getText(), txtApellidos.getText(),
						txtDireccion.getText(), txtCorreoper.getText(), txtCorreoCorp.getText(), txtFechaNac.getText(),
						txtTelefono.getText(), Integer.parseInt(txtIdAgencia.getText()));

			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(222, 227, 113, 23);
		contentPane.add(btnRegistrar);

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(102, 227, 98, 23);
		contentPane.add(btnCancelar);

		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 40, 69, 20);
		contentPane.add(lblNewLabel_2);

		txtId = new JTextField();
		txtId.setBounds(10, 57, 37, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(462, 11, 15, 233);
		contentPane.add(separator);

		JLabel lblNewLabel_1_10 = new JLabel("OPCIONES DE REGISTROS  EXISTENTES");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_10.setBounds(512, 16, 230, 14);
		contentPane.add(lblNewLabel_1_10);

		JLabel lblNewLabel_2_1 = new JLabel("ID PROMOTOR");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(522, 60, 92, 14);
		contentPane.add(lblNewLabel_2_1);

		txtIDPromotor = new JTextField();
		txtIDPromotor.setColumns(10);
		txtIDPromotor.setBounds(536, 82, 52, 20);
		contentPane.add(txtIDPromotor);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\Downloads\\2290850_clean_delete_garbage_recycle bin_trash_icon.png"));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// DELETE
				cr.delete(Integer.parseInt(txtIDPromotor.getText()));
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(699, 131, 129, 52);
		contentPane.add(btnDelete);

		JButton btnNewButton_3 = new JButton("BUSCAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// READ
				cr.Read(Integer.parseInt(txtIDPromotor.getText()), txtTipoDoc, txtNumeroDoc, txtNombre, txtApellidos,
						txtDireccion, txtCorreoper, txtCorreoCorp, txtFechaNac, txtTelefono, txtIdAgencia);
			}
		});
		btnNewButton_3.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(489, 133, 153, 48);
		contentPane.add(btnNewButton_3);

		JButton btnUpdate = new JButton("ACTUALIZAR");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//UPDATE
				cr.Update(Integer.parseInt(txtId.getText()), Integer.parseInt(txtTipoDoc.getText()),
						Integer.parseInt(txtNumeroDoc.getText()), txtNombre.getText(), txtApellidos.getText(),
						txtDireccion.getText(), txtCorreoper.getText(), txtCorreoCorp.getText(), txtFechaNac.getText(),
						txtTelefono.getText(), Integer.parseInt(txtIdAgencia.getText()));
			}
		});
		btnUpdate
				.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\592600_arrow_cycle_interface_update_icon.png"));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.setBounds(487, 192, 172, 48);
		contentPane.add(btnUpdate);

	}

}
