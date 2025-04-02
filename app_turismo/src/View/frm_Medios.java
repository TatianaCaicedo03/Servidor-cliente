package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Medios;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class frm_Medios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JTextField txtIDMedios;
	private JTextField txtMedio;
	Medios cr = new Medios ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Medios frame = new frm_Medios();
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
	public frm_Medios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 325);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 194, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE MEDIOS INFORMACION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(11, 11, 216, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 76, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Observacion");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(130, 76, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ID Tipo Medios");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(86, 128, 93, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(9, 88, 111, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(127, 88, 111, 20);
		contentPane.add(txtObservacion);
		
		txtIDMedios = new JTextField();
		txtIDMedios.setColumns(10);
		txtIDMedios.setBounds(81, 153, 111, 20);
		contentPane.add(txtIDMedios);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290866_documents_download_download files_file_files_icon.png"));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					
					cr.create(txtNombre.getText(),txtObservacion.getText(),Integer.parseInt(txtIDMedios.getText()));
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(11, 225, 159, 50);
		contentPane.add(btnRegistrar);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(359, 11, 15, 276);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1_10 = new JLabel("ELIMINAR REGISTRO EXISTENTE");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_10.setBounds(366, 26, 186, 14);
		contentPane.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID MEDIO");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(408, 79, 92, 39);
		contentPane.add(lblNewLabel_2_1);
		
		txtMedio = new JTextField();
		txtMedio.setColumns(10);
		txtMedio.setBounds(407, 111, 52, 20);
		contentPane.add(txtMedio);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290850_clean_delete_garbage_recycle bin_trash_icon.png"));
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtMedio.getText()));
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(371, 161, 129, 50);
		contentPane.add(btnDelete);
		
		JButton btnNewButton_2 = new JButton("CANCELAR");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9027292_cancel_icon.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(197, 224, 148, 53);
		contentPane.add(btnNewButton_2);
	}

}
