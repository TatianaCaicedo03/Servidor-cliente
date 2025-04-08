package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Tipomedios;
import Model.Tipotransporte;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class frmTipotransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservacion;
	private JTextField txtIDTransporte;
	Tipotransporte cr = new Tipotransporte ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipotransporte frame = new frmTipotransporte();
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
	public frmTipotransporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 285);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(198, 184, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 49, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Observacion");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 88, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(65, 46, 146, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtObservacion = new JTextField();
		txtObservacion.setBounds(88, 77, 123, 36);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JButton btnRegistar = new JButton("REGISTRAR");
		btnRegistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290866_documents_download_download files_file_files_icon.png"));
		btnRegistar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.create(txtNombre.getText(),txtObservacion.getText());
			}
				
				
			
		});
		btnRegistar.setBounds(54, 149, 157, 47);
		contentPane.add(btnRegistar);
		
		JLabel lblNewLabel_2 = new JLabel("TIPO DE TRANSPORTE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(41, 11, 198, 14);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(284, 0, 15, 235);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1_10 = new JLabel("OPCIONES DE REGISTROS  EXISTENTES");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_10.setBounds(319, 11, 255, 14);
		contentPane.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID TIPO TRANSPORTE");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(309, 49, 135, 14);
		contentPane.add(lblNewLabel_2_1);
		
		txtIDTransporte = new JTextField();
		txtIDTransporte.setColumns(10);
		txtIDTransporte.setBounds(441, 46, 52, 20);
		contentPane.add(txtIDTransporte);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290850_clean_delete_garbage_recycle bin_trash_icon.png"));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIDTransporte.getText()));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(309, 73, 125, 45);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_3 = new JButton("BUSCAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Read(Integer.parseInt(txtIDTransporte.getText()), txtNombre, txtObservacion);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(309, 129, 146, 45);
		contentPane.add(btnNewButton_3); 
		
		
		JButton btnUpdate = new JButton("ACTUALIZAR");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(txtIDTransporte.getText()),txtNombre.getText(),txtObservacion.getText());
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\592600_arrow_cycle_interface_update_icon.png"));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.setBounds(309, 187, 172, 48);
		contentPane.add(btnUpdate);
		
		
		
		
	}
}
