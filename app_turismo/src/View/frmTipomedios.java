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
		setBounds(100, 100, 507, 228);
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
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			
			
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtNombre.getText(),txtObservacion.getText());
			}
		});
		btnRegistrar.setBounds(34, 155, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(147, 155, 89, 23);
		contentPane.add(btnCancelar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(73, 47, 125, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(246, 0, 15, 189);
		contentPane.add(separator);
		
		JLabel lblRegistroDeTipo = new JLabel("REGISTRO DE TIPO DE MEDIOS");
		lblRegistroDeTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRegistroDeTipo.setBounds(20, 11, 274, 25);
		contentPane.add(lblRegistroDeTipo);
		
		JLabel lblNewLabel_1_10 = new JLabel("ELIMINAR REGISTRO EXISTENTE");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_10.setBounds(268, 16, 186, 14);
		contentPane.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID MEDIOS");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(271, 75, 92, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtMedios = new JTextField();
		txtMedios.setColumns(10);
		txtMedios.setBounds(356, 72, 52, 20);
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
		btnDelete.setBounds(295, 112, 128, 45);
		contentPane.add(btnDelete);
	}
}
