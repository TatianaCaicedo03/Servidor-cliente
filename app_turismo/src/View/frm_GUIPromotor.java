package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class frm_GUIPromotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_GUIPromotor frame = new frm_GUIPromotor();
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
	public frm_GUIPromotor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(228, 224, 248));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCompañia = new JButton("");
		btnCompañia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCompañia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7538718_building_government_politics_icon.png"));
		btnCompañia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_Companias ac = new frm_Companias ();
				ac.setVisible(true);
			}
		});
		btnCompañia.setToolTipText("COMPAÑIAS");
		btnCompañia.setBounds(36, 63, 89, 57);
		contentPane.add(btnCompañia);
		
		JButton btnAgencia = new JButton("");
		btnAgencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_Agencias ac = new frm_Agencias ();
				ac.setVisible(true);
			}
		});
		btnAgencia.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\7538690_building_business_office_icon.png"));
		btnAgencia.setToolTipText("AGENCIAS");
		btnAgencia.setBounds(226, 65, 89, 55);
		contentPane.add(btnAgencia);
		
		JButton btnPaquetes = new JButton("");
		btnPaquetes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3512625_citizenship_document_identity_passport_tourist_icon.png"));
		btnPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_Paquetes ac = new frm_Paquetes();
				ac.setVisible(true);
			}
		});
		btnPaquetes.setToolTipText("PAQUETES");
		btnPaquetes.setBounds(36, 169, 89, 48);
		contentPane.add(btnPaquetes);
		
		JButton btnOperadores = new JButton("");
		btnOperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				frmOperadores ac = new frmOperadores();
				ac.setVisible(true);
			}
		});
		btnOperadores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3099498_pilot_man_icon.png"));
		btnOperadores.setToolTipText("OPERADORES");
		btnOperadores.setBounds(427, 162, 89, 55);
		contentPane.add(btnOperadores);
		
		JButton btnPromotores = new JButton("");
		btnPromotores.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2620496_employee_job_seeker_unemployee_work_icon.png"));
		btnPromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_Promotores ac = new 	frm_Promotores ();
				ac.setVisible(true);
			}
		});
		btnPromotores.setToolTipText("PROMOTORES");
		btnPromotores.setBounds(427, 65, 89, 55);
		contentPane.add(btnPromotores);
		
		JButton btnClientes = new JButton("");
		btnClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_Clientes ac = new frm_Clientes ();
				ac.setVisible(true);
			}
		});
		btnClientes.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2620524_cv_employee_job_seeker_unemployee_icon.png"));
		btnClientes.setToolTipText("CLIENTES");
		btnClientes.setBounds(226, 162, 89, 55);
		contentPane.add(btnClientes);
		
		JButton btnVehiculos = new JButton("");
		btnVehiculos.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3363563_cab_car_taxi_taxicab_icon.png"));
		btnVehiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_Vehiculo ac = new frm_Vehiculo ();
				ac.setVisible(true);
			}
		});
		btnVehiculos.setToolTipText("VEHICULOS");
		btnVehiculos.setBounds(36, 261, 89, 57);
		contentPane.add(btnVehiculos);
		
		JButton btntipoVehiculo = new JButton("");
		btntipoVehiculo.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\5978787_airplane_corona_coronavirus_plane_travel_icon.png"));
		btntipoVehiculo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTipotransporte ac = new frmTipotransporte ();
				ac.setVisible(true);
			}
		});
		btntipoVehiculo.setToolTipText("TIPO VEHICULOS");
		btntipoVehiculo.setBounds(226, 261, 89, 57);
		contentPane.add(btntipoVehiculo);
		
		JLabel lblNewLabel = new JLabel("CONTROL DE ACCESOS A  REGISTROS DE  EMPRESA TUSRISTICA");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 11));
		lblNewLabel.setBounds(116, 11, 352, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnTipoMedios = new JButton("");
		btnTipoMedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\3709726_customer_internet_olnine_service_website_icon.png"));
		btnTipoMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmTipomedios ac = new frmTipomedios ();
				ac.setVisible(true);
			}
		});
		btnTipoMedios.setToolTipText("TIPO MEDIOS");
		btnTipoMedios.setBounds(427, 261, 89, 57);
		contentPane.add(btnTipoMedios);
		
		JButton btnMedios = new JButton("");
		btnMedios.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\4023884_internet_mobile_smartphone_icon.png"));
		btnMedios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_Medios ac = new frm_Medios ();
				ac.setVisible(true);
			}
			
		});
		btnMedios.setToolTipText("MEDIOS");
		btnMedios.setBounds(36, 353, 89, 48);
		contentPane.add(btnMedios);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("SALIR");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9027340_exit_icon.png"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frm_Acceso ac = new frm_Acceso ();
				ac.setVisible(true);
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(463, 379, 68, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("COMPAÑIAS");
		lblNewLabel_1.setBounds(46, 121, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("AGENCIAS");
		lblNewLabel_1_1.setBounds(236, 121, 68, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PROMOTORES");
		lblNewLabel_1_1_1.setBounds(437, 121, 79, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("PAQUETES");
		lblNewLabel_2.setBounds(46, 224, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("CLIENTES");
		lblNewLabel_2_1.setBounds(236, 224, 79, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("OPERADORES");
		lblNewLabel_2_2.setBounds(437, 224, 94, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("VEHICULOS");
		lblNewLabel_2_3.setBounds(46, 317, 79, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("TIPO TRANSPORTE");
		lblNewLabel_2_4.setBounds(226, 317, 108, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("MEDIOS");
		lblNewLabel_2_5.setBounds(46, 408, 79, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("TIPO MEDIOS");
		lblNewLabel_2_6.setBounds(437, 317, 79, 14);
		contentPane.add(lblNewLabel_2_6);
	}
}
