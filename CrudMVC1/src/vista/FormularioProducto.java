package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormularioProducto extends JFrame {

	private JPanel contentPane;
	
	public JTextField txtCodigo;
	public JTextField txtNombre;
	public JTextField txtPrecio;
	public JTextField txtCantidad;
	public JTextField txtId;
	
	public JButton btnGuardar;
	public JButton btnModificar;
	public JButton btnEliminar;
	public JButton btnLimpiar;
	public JButton btnBuscar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioProducto frame = new FormularioProducto();
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
	public FormularioProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(24, 63, 63, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(26, 98, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precio");
		lblNewLabel_2.setBounds(29, 136, 58, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cantidad");
		lblNewLabel_3.setBounds(24, 170, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(122, 60, 112, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(122, 94, 112, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(122, 133, 112, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(122, 179, 112, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(24, 236, 89, 23);
		contentPane.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(122, 236, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(236, 236, 89, 23);
		contentPane.add(btnEliminar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(344, 236, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(344, 59, 89, 23);
		contentPane.add(btnBuscar);
		
		txtId = new JTextField();
		txtId.setBounds(344, 95, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
	}
	
}
