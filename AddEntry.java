public class AddEntry extends javax.swing.JFrame {
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;


	public AddEntry(){
		super("Add Entry");

		setDefaultCloseOperation(javax.swing.JFrame.HIDE_ON_CLOSE);

		setResizable(true);

		jLabel1 = new javax.swing.JLabel("First Name: ");
		jLabel2 = new javax.swing.JLabel("Last Name: ");
		jLabel3 = new javax.swing.JLabel("Street Address: ");
		jLabel4 = new javax.swing.JLabel("State: ");
		jLabel5 = new javax.swing.JLabel("Country: ");
		jLabel6 = new javax.swing.JLabel("Tel. No.: ");
		jLabel7 = new javax.swing.JLabel("Email: ");

		jTextField1 = new javax.swing.JTextField(15);
		jTextField2 = new javax.swing.JTextField(15);
		jTextField3 = new javax.swing.JTextField(40);
		jTextField4 = new javax.swing.JTextField(20);
		jTextField5 = new javax.swing.JTextField(20);
		jTextField6 = new javax.swing.JTextField(20);
		jTextField7 = new javax.swing.JTextField(35);

		jButton1 = new javax.swing.JButton("Add");
		jButton2 = new javax.swing.JButton("Cancel");

		jPanel1 = new javax.swing.JPanel(new java.awt.GridLayout(7, 1, 1, 5));

		jPanel1.add(jLabel1);
		jPanel1.add(jLabel2);
		jPanel1.add(jLabel3);
		jPanel1.add(jLabel4);
		jPanel1.add(jLabel5);
		jPanel1.add(jLabel6);
		jPanel1.add(jLabel7);

		jPanel2 = new javax.swing.JPanel(new java.awt.GridLayout(7, 1));

		jPanel2.add(jTextField1);
		jPanel2.add(jTextField2);
		jPanel2.add(jTextField3);
		jPanel2.add(jTextField4);
		jPanel2.add(jTextField5);
		jPanel2.add(jTextField6);
		jPanel2.add(jTextField7);

		jPanel3 = new javax.swing.JPanel(new java.awt.FlowLayout());

		jPanel3.add(jPanel1);
		jPanel3.add(jPanel2);

		jPanel4 = new javax.swing.JPanel(new java.awt.FlowLayout());

		jPanel4.add(jButton1);
		jPanel4.add(jButton2);

		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				AddressBookMain.addEntry(new AddressBook(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText(), jTextField5.getText(), jTextField6.getText(), jTextField7.getText()));
			}
		});

		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				setVisible(true);
				dispose();
			}
		});

		jPanel5 = new javax.swing.JPanel(new java.awt.BorderLayout());

		jPanel5.add(jPanel3, java.awt.BorderLayout.CENTER);
		jPanel5.add(jPanel4, java.awt.BorderLayout.SOUTH);

		getContentPane().add(jPanel5);

		pack();
		setVisible(true);
	}

	public static void main(String args[]) {
		javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

		new AddEntry().setVisible(true);
	}
}