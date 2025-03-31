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

public class frmTipomedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtObservacion;
	private JTextField txtNombre;

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
		lblNewLabel.setBounds(65, 39, 85, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Observacion");
		lblNewLabel_1.setBounds(249, 39, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		txtObservacion = new JTextField();
		txtObservacion.setBounds(198, 61, 184, 23);
		contentPane.add(txtObservacion);
		txtObservacion.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			
			
			public void mouseClicked(MouseEvent e) {
				Tipomedios cr = new Tipomedios ();
				cr.create(txtNombre.getText(),txtObservacion.getText());
			}
		});
		btnRegistrar.setBounds(392, 155, 89, 23);
		contentPane.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(275, 155, 89, 23);
		contentPane.add(btnCancelar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(43, 62, 107, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
	}
}
