package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import backend.Calculator;

public class CalculatorGui extends JFrame {

	private JPanel contentPane;
	private JTextField inputField;
	
	private Calculator _calculator;
	private StringBuilder _inputString;
	private StringBuilder _guiInputString;
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGui frame = new CalculatorGui();
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
	public CalculatorGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		inputField = new JTextField();
		inputField.setEditable(false);
		inputField.setBounds(5, 5, 424, 61);
		contentPane.add(inputField);
		inputField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 77, 419, 426);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		_calculator = new Calculator();
		_inputString = new StringBuilder();
		_guiInputString = new StringBuilder();
		
		JButton oneButton = new JButton("C");
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString = new StringBuilder();
				_guiInputString = new StringBuilder();
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(oneButton);
		
		JButton ceButton = new JButton("CE");
		ceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString = new StringBuilder();
				_guiInputString = new StringBuilder();
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(ceButton);
		
		JButton deleteButton = new JButton("<-");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.deleteCharAt(_inputString.length() - 1);
				_guiInputString.deleteCharAt(_guiInputString.length() - 1);;
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(deleteButton);
		
		JButton divisionButton = new JButton("\u00F7");
		divisionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("/");
				_guiInputString.append("\u00F7");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(divisionButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("7");
				_guiInputString.append("7");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("8");
				_guiInputString.append("8");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("9");
				_guiInputString.append("9");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(nineButton);
		
		JButton multiplicationButton = new JButton("\u00D7");
		multiplicationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("*");
				_guiInputString.append("\u00D7");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(multiplicationButton);
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("4");
				_guiInputString.append("4");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("5");
				_guiInputString.append("5");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("6");
				_guiInputString.append("6");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(sixButton);
		
		JButton subtractionButton = new JButton("-");
		subtractionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("-");
				_guiInputString.append("-");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(subtractionButton);
		
		JButton twoButton = new JButton("1");
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("1");
				_guiInputString.append("1");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(twoButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("2");
				_guiInputString.append("2");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(btnNewButton_1);
		
		JButton threeButton = new JButton("3");
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("3");
				_guiInputString.append("3");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(threeButton);
		
		JButton additionButton = new JButton("+");
		additionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("+");
				_guiInputString.append("+");
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(additionButton);
		
		JButton posNegButton = new JButton("+/-");
		posNegButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!_inputString.isEmpty() && _inputString.charAt(_inputString.length() - 1) == 'n') {
					_inputString.deleteCharAt(_inputString.length() - 1);
					_guiInputString.deleteCharAt(_guiInputString.length() - 1);
				}
				else {
					_inputString.append("n");
					_guiInputString.append("-"); 
				}
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(posNegButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append("0");
				_guiInputString.append("0"); 
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(zeroButton);
		
		JButton pointButton = new JButton(".");
		pointButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_inputString.append(".");
				_guiInputString.append("."); 
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(pointButton);
		
		JButton equalButton = new JButton("=");
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float ans = _calculator.solve(_inputString.toString());
				_inputString = new StringBuilder(Float.toString(ans));
				_guiInputString = new StringBuilder(Float.toString(ans));
				inputField.setText(_guiInputString.toString());
			}
		});
		panel.add(equalButton);
	}
}
