package com.github.spocot.mythra.mapEditor;

import com.github.spocot.mythra.*;

/**
 *
 * @author spocot
 */
public class MapMakerUI extends javax.swing.JFrame {

	/**
	 * Creates new form MapMakerUI
	 */
	public MapMakerUI() {
		initComponents();
	}
	
	private void initComponents() {

		materialButtonGroup = new javax.swing.ButtonGroup();
		editorPanel = new EditorPanel();
		airRadioButton = new javax.swing.JRadioButton();
		jLabel1 = new javax.swing.JLabel();
		fillButton = new javax.swing.JButton();
		grassRadioButton = new javax.swing.JRadioButton();
		wallRadioButton = new javax.swing.JRadioButton();
		roadRadioButton = new javax.swing.JRadioButton();
		saveButton = new javax.swing.JButton();
		loadButton = new javax.swing.JButton();
		newCustomButton = new javax.swing.JButton();
		jComboBox1 = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		editorPanel.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout editorPanelLayout = new javax.swing.GroupLayout(editorPanel);
		editorPanel.setLayout(editorPanelLayout);
		editorPanelLayout.setHorizontalGroup(
				editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 500, Short.MAX_VALUE)
				);
		editorPanelLayout.setVerticalGroup(
				editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 500, Short.MAX_VALUE)
				);

		materialButtonGroup.add(airRadioButton);
		airRadioButton.setText("Air");
		airRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				airRadioButtonActionPerformed(evt);
			}
		});

		jLabel1.setText("Material");

		fillButton.setText("Fill");
		fillButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				fillButtonActionPerformed(evt);
			}
		});

		materialButtonGroup.add(grassRadioButton);
		grassRadioButton.setSelected(true);
		grassRadioButton.setText("Grass");
		grassRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				grassRadioButtonActionPerformed(evt);
			}
		});

		materialButtonGroup.add(wallRadioButton);
		wallRadioButton.setText("Wall");
		wallRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				wallRadioButtonActionPerformed(evt);
			}
		});

		materialButtonGroup.add(roadRadioButton);
		roadRadioButton.setText("Road");
		roadRadioButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				roadRadioButtonActionPerformed(evt);
			}
		});

		saveButton.setText("Save");

		loadButton.setText("Load");

		newCustomButton.setText("New Custom Block");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(editorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(fillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(newCustomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel1)
												.addComponent(airRadioButton)
												.addComponent(grassRadioButton)
												.addComponent(wallRadioButton)
												.addComponent(roadRadioButton))
												.addGap(0, 0, Short.MAX_VALUE))
												.addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(editorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(airRadioButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(grassRadioButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(wallRadioButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(roadRadioButton)
								.addGap(18, 18, 18)
								.addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(newCustomButton)
								.addGap(102, 102, 102)
								.addComponent(fillButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(saveButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(loadButton)
								.addContainerGap())
				);

		pack();
	}// </editor-fold>

	private void airRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
		editorPanel.changeBlock(new BlockAir(0,0));
	}
	private void grassRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
		editorPanel.changeBlock(new BlockGrass(0,0));
	}
	private void wallRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
		editorPanel.changeBlock(new BlockWall(0,0));
	}
	private void roadRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
		editorPanel.changeBlock(new BlockRoad(0,0));
	}                                                 

	private void fillButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
		editorPanel.fillMap();
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MapMakerUI().setVisible(true);
			}
		});
	}
	// Variables declaration - do not modify
	private javax.swing.JRadioButton airRadioButton;
	private javax.swing.JButton fillButton;
	private javax.swing.JRadioButton grassRadioButton;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JLabel jLabel1;
	private EditorPanel editorPanel;
	private javax.swing.JButton loadButton;
	private javax.swing.ButtonGroup materialButtonGroup;
	private javax.swing.JButton newCustomButton;
	private javax.swing.JRadioButton roadRadioButton;
	private javax.swing.JButton saveButton;
	private javax.swing.JRadioButton wallRadioButton;
	// End of variables declaration
}
