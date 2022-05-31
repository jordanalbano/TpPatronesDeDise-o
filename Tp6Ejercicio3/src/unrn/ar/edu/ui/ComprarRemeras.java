package unrn.ar.edu.ui;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import unrn.ar.edu.modelo.ExcepcionPorCantidadDeRemeras;
import unrn.ar.edu.modelo.ExcepcionPorCantidadIncorrecta;
import unrn.ar.edu.modelo.ExcepcionPorEmailInvalido;
import unrn.ar.edu.modelo.ExcepcionPorNoIndicarCantidad;
import unrn.ar.edu.modelo.ExcepcionPorNoIndicarEmail;
import unrn.ar.edu.modelo.RepositorioVentasEntrada;

public class ComprarRemeras extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8702872166457112204L;
	private RepositorioVentasEntrada registroVenta;
	private JPanel contentPane;
	private JTextField tfCantidadDeRemeras;
	private JTextField tfEmail;
	private ArrayList<Integer> idRemera;

	public ComprarRemeras(RepositorioVentasEntrada repo) {
		this.registroVenta = repo;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.idRemera = new ArrayList<Integer>();
		tfCantidadDeRemeras = new JTextField("");
		tfCantidadDeRemeras.setBounds(148, 13, 160, 22);
		contentPane.add(tfCantidadDeRemeras);
		tfCantidadDeRemeras.setColumns(10);

		tfEmail = new JTextField("");
		tfEmail.setBounds(148, 53, 160, 22);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);

		JLabel cantidadRemeras = new JLabel("CantidadRemeras");
		cantidadRemeras.setBounds(33, 17, 105, 14);
		contentPane.add(cantidadRemeras);

		JLabel lbEmail = new JLabel("Email");
		lbEmail.setBounds(33, 57, 105, 14);
		contentPane.add(lbEmail);

		JLabel lbTipoRemera = new JLabel("Tipo De Remera");
		lbTipoRemera.setBounds(33, 97, 105, 14);
		contentPane.add(lbTipoRemera);

		JComboBox<String> comboBoxTipoRemera = new JComboBox<String>();
		comboBoxTipoRemera.addItem("Estampada");
		comboBoxTipoRemera.addItem("Lisa");
		this.idRemera.add(1);
		this.idRemera.add(2);

		comboBoxTipoRemera.setBounds(148, 93, 160, 22);
		contentPane.add(comboBoxTipoRemera);

		JButton btnConsultarMonto = new JButton("Consultar Monto A Pagar");
		btnConsultarMonto.addActionListener((e) -> {
			Integer id = null;
			if (comboBoxTipoRemera.getSelectedItem().equals("Lisa")) {
				id = this.idRemera.get(0);
			}
			if (comboBoxTipoRemera.getSelectedItem().equals("Estampada")) {
				id = this.idRemera.get(1);
			}

			double montoAPagar = 0;
			try {
				montoAPagar = this.registroVenta.montoAPagar(this.tfCantidadDeRemeras.getText(), id);
				JOptionPane.showMessageDialog(null, ("monto a Pagar: " + montoAPagar), "Monto A Pagar", 3);
			} catch (ExcepcionPorNoIndicarCantidad | ExcepcionPorCantidadIncorrecta
					| ExcepcionPorCantidadDeRemeras e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
			}
		});

		btnConsultarMonto.setBounds(33, 157, 211, 23);
		contentPane.add(btnConsultarMonto);

		JButton btnConfirmarPago = new JButton("Confirmar Pago");
		btnConfirmarPago.addActionListener((e) -> {
			Integer id = null;
			if (comboBoxTipoRemera.getSelectedItem().equals("Lisa")) {
				id = this.idRemera.get(0);
			}
			if (comboBoxTipoRemera.getSelectedItem().equals("Estampada")) {
				id = this.idRemera.get(1);
			}

			try {
				this.registroVenta.agregarVenta(this.tfCantidadDeRemeras.getText(), id, this.tfEmail.getText());
				JOptionPane.showMessageDialog(null, "compra generada con exito");
			} catch (IOException | ExcepcionPorNoIndicarCantidad | ExcepcionPorNoIndicarEmail
					| ExcepcionPorEmailInvalido | ExcepcionPorCantidadIncorrecta | ExcepcionPorCantidadDeRemeras e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
			}

		});
		btnConfirmarPago.setBounds(284, 157, 144, 23);
		contentPane.add(btnConfirmarPago);

	}
}
