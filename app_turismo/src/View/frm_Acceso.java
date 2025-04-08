package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Promotores;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frm_Acceso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDocumento;
	private JPasswordField passwordField;
	Promotores cr = new Promotores();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Acceso frame = new frm_Acceso();
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
	public frm_Acceso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 232, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACCESO DE USUARIO");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblNewLabel.setBounds(134, 11, 200, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblDocumento = new JLabel("DOCUMENTO");
		lblDocumento.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblDocumento.setBounds(38, 67, 87, 35);
		contentPane.add(lblDocumento);
		
		JLabel lblContrasea = new JLabel("CONTRASEÑA");
		lblContrasea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblContrasea.setBounds(26, 124, 99, 35);
		contentPane.add(lblContrasea);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(122, 75, 154, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		JButton btnNewButton = new JButton("INGRESAR");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//ABRIR VISTA DE PROMOTOR
				frm_GUIPromotor ac = new frm_GUIPromotor ();
				ac.setVisible(true);
				try {
					//COMANDO PARA ACCEDER A LAS VISTAS DE LA APP
					cr.Control_Acceso(Integer.parseInt(txtDocumento.getText()),passwordField.getText());
					
				} catch (Exception e2) {
					JOptionPane.showConfirmDialog(null," No has ingresado datos, asegurate de que tus credenciales sean correctas");
				}
				
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4265055_door_exit_get_log_out_icon.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(122, 199, 154, 35);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 132, 158, 20);
		contentPane.add(passwordField);
	}
}
