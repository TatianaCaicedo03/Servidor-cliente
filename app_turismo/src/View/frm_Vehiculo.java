package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Vehiculos;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class frm_Vehiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtPuestos;
	private JTextField txtModelo;
	private JTextField txtNumeroMotor;
	private JTextField txtCategoria;
	private JTextField txtIdTipoTrans;
	private JTextField txtIdMatricula;
	Vehiculos  cr = new Vehiculos  ();	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Vehiculo frame = new frm_Vehiculo();
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
	public frm_Vehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 340);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 194, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE VEHICULOS ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(122, 11, 145, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(40, 48, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(171, 48, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Puestos");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(277, 48, 75, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Modelo");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(40, 121, 75, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Numero Motor");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(155, 121, 112, 14);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Categoria");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(277, 121, 75, 14);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("ID  tipo Transporte");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_6.setBounds(40, 179, 107, 14);
		contentPane.add(lblNewLabel_1_6);
		
		JButton btnRegistrar = new JButton("REGISTAR");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290866_documents_download_download files_file_files_icon.png"));
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtMatricula.getText(), txtMarca.getText(),Integer.parseInt(txtPuestos.getText()),txtModelo.getText(),Integer.parseInt(txtNumeroMotor.getText()),txtCategoria.getText(),Integer.parseInt(txtIdTipoTrans.getText()));
			}
		});
		btnRegistrar.setBounds(215, 249, 152, 41);
		contentPane.add(btnRegistrar);
		
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(29, 61, 86, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(146, 61, 121, 20);
		contentPane.add(txtMarca);
		
		txtPuestos = new JTextField();
		txtPuestos.setColumns(10);
		txtPuestos.setBounds(277, 61, 86, 20);
		contentPane.add(txtPuestos);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(29, 133, 107, 20);
		contentPane.add(txtModelo);
		
		txtNumeroMotor = new JTextField();
		txtNumeroMotor.setColumns(10);
		txtNumeroMotor.setBounds(146, 133, 86, 20);
		contentPane.add(txtNumeroMotor);
		
		txtCategoria = new JTextField();
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(277, 133, 86, 20);
		contentPane.add(txtCategoria);
		
		txtIdTipoTrans = new JTextField();
		txtIdTipoTrans.setColumns(10);
		txtIdTipoTrans.setBounds(50, 195, 86, 20);
		contentPane.add(txtIdTipoTrans);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(390, 0, 15, 261);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("MATRICULA");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(460, 64, 92, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtIdMatricula = new JTextField();
		txtIdMatricula.setColumns(10);
		txtIdMatricula.setBounds(470, 78, 52, 20);
		contentPane.add(txtIdMatricula);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290850_clean_delete_garbage_recycle bin_trash_icon.png"));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(txtIdMatricula.getText());
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(592, 177, 137, 57);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_10_1 = new JLabel("ELIMINAR REGISTRO EXISTENTE");
		lblNewLabel_1_10_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_10_1.setBounds(397, 11, 186, 14);
		contentPane.add(lblNewLabel_1_10_1);
		
		
		JButton btnNewButton_3 = new JButton("BUSCAR");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Read(txtIdMatricula.getText(), txtMarca, txtPuestos, txtModelo, txtNumeroMotor, txtCategoria, txtIdTipoTrans);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(592, 48, 153, 48);
		contentPane.add(btnNewButton_3); 
		
		
		JButton btnUpdate = new JButton("ACTUALIZAR");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(txtMatricula.getText(), txtMarca.getText(),Integer.parseInt(txtPuestos.getText()),txtModelo.getText(),Integer.parseInt(txtNumeroMotor.getText()),txtCategoria.getText(),Integer.parseInt(txtIdTipoTrans.getText()));
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\592600_arrow_cycle_interface_update_icon.png"));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.setBounds(592, 119, 172, 48);
		contentPane.add(btnUpdate);
		
		
		
		
		
		
	}

}
