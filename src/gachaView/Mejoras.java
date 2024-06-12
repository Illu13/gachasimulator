package gachaView;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Mejoras extends JPanel {

	public Mejoras(Gacha g) {
		GridBagLayout gridBagLayout = new GridBagLayout();
//		gridBagLayout.columnWidths = new int[]{0};
//		gridBagLayout.rowHeights = new int[]{0};
//		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("Descuento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		JLabel dineroFarmeo = new JLabel("500");
		dineroFarmeo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		GridBagConstraints gbc_dineroFarmeo = new GridBagConstraints();
		gbc_dineroFarmeo.insets = new Insets(0, 0, 0, 5);
		gbc_dineroFarmeo.gridx = 0;
		gbc_dineroFarmeo.gridy = 3;
		add(dineroFarmeo, gbc_dineroFarmeo);

		JLabel dineroDescuento = new JLabel("200");
		dineroDescuento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_dineroDescuento = new GridBagConstraints();
		gbc_dineroDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_dineroDescuento.gridx = 0;
		gbc_dineroDescuento.gridy = 1;
		add(dineroDescuento, gbc_dineroDescuento);

		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (g.moneda >= g.precioDescuento) {
					g.precio--;
					g.labelDollar.setText("" + g.precio);
					g.moneda = g.moneda - g.precioDescuento;
					g.dinreos.setText("" + g.moneda);
					g.precioDescuento = g.precioDescuento * 2;

					dineroDescuento.setText("" + g.precioDescuento);

				} else {
					JOptionPane.showOptionDialog(null, "Broder", "SOS POBRE", JOptionPane.DEFAULT_OPTION,
							JOptionPane.WARNING_MESSAGE, null, g.posiblesRespuestas, g.posiblesRespuestas[0]);
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		add(btnNewButton, gbc_btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Farmeo faston");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("Comprar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (g.moneda >= g.precioFarmeo) {
					g.dineroClicks++;
					g.moneda = g.moneda - g.precioFarmeo;
					g.dinreos.setText("" + g.moneda);
					g.precioFarmeo = g.precioFarmeo * 2;
					dineroFarmeo.setText("" + g.precioFarmeo);
				} else {
					JOptionPane.showOptionDialog(null, "Broder", "SOS POBRE", JOptionPane.DEFAULT_OPTION,
							JOptionPane.WARNING_MESSAGE, null, g.posiblesRespuestas, g.posiblesRespuestas[0]);
				}

			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 2;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		dineroDescuento.setText("" + g.precioDescuento);
		dineroFarmeo.setText("" + g.precioFarmeo);

	}

}
