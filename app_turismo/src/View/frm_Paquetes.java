package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Paquete;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_Paquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIDDestino;
	private JTextField txtIDOrigen;
	private JTextField txtFechaVenta;
	private JTextField txtHoraVenta;
	private JTextField txtHoraSalida;
	private JTextField txtFechaEjec;
	private JTextField txtObservacion;
	private JTextField txtIDPromotor;
	private JTextField txtIDCliente;
	private JTextField txtIdOperador;
	private JTextField txtMedio;
	private JTextField txtPrecio;
	private JTextField txtIDVehiculo;
	private JTextField txtCodigoVenta;
	Paquete cr = new Paquete();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Paquetes frame = new frm_Paquetes();
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
	public frm_Paquetes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 197, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("REGISTRO  DEL PAQUETE TURISTICO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(101, 11, 217, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ID Destino");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(21, 62, 104, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("ID Origen");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(144, 62, 104, 14);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Fecha de Venta");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(258, 62, 104, 14);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hora de Venta");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1.setBounds(10, 117, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("Hora de  Salida");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_2.setBounds(114, 117, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_2);

		JLabel lblNewLabel_1_1_1_3 = new JLabel("Fecha de Ejecucion ");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_3.setBounds(245, 117, 114, 14);
		contentPane.add(lblNewLabel_1_1_1_3);

		JLabel lblNewLabel_1_1_1_4 = new JLabel("Observacion");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_4.setBounds(10, 161, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_4);

		JLabel lblNewLabel_1_1_1_5 = new JLabel("ID Promotor");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_5.setBounds(124, 161, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_5);

		JLabel lblNewLabel_1_1_1_5_1 = new JLabel("ID Cliente");
		lblNewLabel_1_1_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_5_1.setBounds(264, 161, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_5_1);

		JLabel lblNewLabel_1_1_1_5_2 = new JLabel("ID Operador");
		lblNewLabel_1_1_1_5_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_5_2.setBounds(10, 215, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_5_2);

		JLabel lblNewLabel_1_1_1_5_3 = new JLabel("ID Medio");
		lblNewLabel_1_1_1_5_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_5_3.setBounds(124, 215, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_5_3);

		JLabel lblNewLabel_1_1_1_5_4 = new JLabel("Precio");
		lblNewLabel_1_1_1_5_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_5_4.setBounds(264, 215, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_5_4);

		JLabel lblNewLabel_1_1_1_5_5 = new JLabel("ID Vehiculo");
		lblNewLabel_1_1_1_5_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_5_5.setBounds(10, 259, 104, 14);
		contentPane.add(lblNewLabel_1_1_1_5_5);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\2290866_documents_download_download files_file_files_icon.png"));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// CREATE
				cr.create(Integer.parseInt(txtIDDestino.getText()), Integer.parseInt(txtIDOrigen.getText()),
						txtFechaVenta.getText(), txtHoraVenta.getText(), txtHoraSalida.getText(),
						txtFechaEjec.getText(), txtObservacion.getText(), Integer.parseInt(txtIDPromotor.getText()),
						Integer.parseInt(txtIDCliente.getText()), Integer.parseInt(txtIdOperador.getText()),
						Integer.parseInt(txtMedio.getText()), txtPrecio.getText(), txtIDVehiculo.getText());

			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRegistrar.setBounds(213, 278, 149, 41);
		contentPane.add(btnRegistrar);

		txtIDDestino = new JTextField();
		txtIDDestino.setBounds(10, 75, 104, 20);
		contentPane.add(txtIDDestino);
		txtIDDestino.setColumns(10);

		txtIDOrigen = new JTextField();
		txtIDOrigen.setColumns(10);
		txtIDOrigen.setBounds(127, 75, 104, 20);
		contentPane.add(txtIDOrigen);

		txtFechaVenta = new JTextField();
		txtFechaVenta.setColumns(10);
		txtFechaVenta.setBounds(258, 75, 86, 20);
		contentPane.add(txtFechaVenta);

		txtHoraVenta = new JTextField();
		txtHoraVenta.setColumns(10);
		txtHoraVenta.setBounds(10, 130, 86, 20);
		contentPane.add(txtHoraVenta);

		txtHoraSalida = new JTextField();
		txtHoraSalida.setColumns(10);
		txtHoraSalida.setBounds(114, 130, 86, 20);
		contentPane.add(txtHoraSalida);

		txtFechaEjec = new JTextField();
		txtFechaEjec.setColumns(10);
		txtFechaEjec.setBounds(254, 130, 86, 20);
		contentPane.add(txtFechaEjec);

		txtObservacion = new JTextField();
		txtObservacion.setColumns(10);
		txtObservacion.setBounds(10, 173, 86, 34);
		contentPane.add(txtObservacion);

		txtIDPromotor = new JTextField();
		txtIDPromotor.setColumns(10);
		txtIDPromotor.setBounds(114, 180, 86, 20);
		contentPane.add(txtIDPromotor);

		txtIDCliente = new JTextField();
		txtIDCliente.setColumns(10);
		txtIDCliente.setBounds(254, 180, 86, 20);
		contentPane.add(txtIDCliente);

		txtIdOperador = new JTextField();
		txtIdOperador.setColumns(10);
		txtIdOperador.setBounds(10, 228, 86, 20);
		contentPane.add(txtIdOperador);

		txtMedio = new JTextField();
		txtMedio.setColumns(10);
		txtMedio.setBounds(114, 228, 86, 20);
		contentPane.add(txtMedio);

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(254, 228, 86, 20);
		contentPane.add(txtPrecio);

		txtIDVehiculo = new JTextField();
		txtIDVehiculo.setColumns(10);
		txtIDVehiculo.setBounds(10, 273, 86, 20);
		contentPane.add(txtIDVehiculo);

		JLabel lblNewLabel_2 = new JLabel("CODIGO DE VENTA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(430, 90, 119, 14);
		contentPane.add(lblNewLabel_2);

		txtCodigoVenta = new JTextField();
		txtCodigoVenta.setBounds(552, 87, 86, 20);
		contentPane.add(txtCodigoVenta);
		txtCodigoVenta.setColumns(10);

		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\Downloads\\2290850_clean_delete_garbage_recycle bin_trash_icon.png"));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// DELETE
				cr.delete(Integer.parseInt(txtCodigoVenta.getText()));
			}
		});
		btnNewButton.setBounds(552, 273, 135, 50);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1_2 = new JLabel("OPCIONES DE  REGISTROS  EXISTENTES");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(428, 44, 269, 14);
		contentPane.add(lblNewLabel_1_2);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(372, 0, 15, 337);
		contentPane.add(separator);

		JButton btnNewButton_3 = new JButton("BUSCAR");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// READ
				cr.Read(Integer.parseInt(txtCodigoVenta.getText()), txtIDDestino, txtIDOrigen, txtFechaVenta,
						txtHoraVenta, txtHoraSalida, txtFechaEjec, txtObservacion, txtIDPromotor, txtIDCliente,
						txtIdOperador, txtMedio, txtPrecio, txtIDVehiculo);
			}
		});
		btnNewButton_3.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\613531_find_glass_magnifying_search_zoom_icon.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(552, 130, 153, 48);
		contentPane.add(btnNewButton_3);
		
		
		JButton btnUpdate = new JButton("ACTUALIZAR");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.Update(Integer.parseInt(txtCodigoVenta.getText()),Integer.parseInt(txtIDDestino.getText()), Integer.parseInt(txtIDOrigen.getText()),
						txtFechaVenta.getText(), txtHoraVenta.getText(), txtHoraSalida.getText(),
						txtFechaEjec.getText(), txtObservacion.getText(), Integer.parseInt(txtIDPromotor.getText()),
						Integer.parseInt(txtIDCliente.getText()), Integer.parseInt(txtIdOperador.getText()),
						Integer.parseInt(txtMedio.getText()), txtPrecio.getText(), txtIDVehiculo.getText());
			}
		});
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\592600_arrow_cycle_interface_update_icon.png"));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.setBounds(540, 198, 172, 48);
		contentPane.add(btnUpdate);
	
		
		
		

	}
}
