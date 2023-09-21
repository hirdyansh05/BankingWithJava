package BankingAppWithJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BankingSystemGUI {
    
    private JFrame frame;
    private BankAccount account;
    private JTextField amountField;
    private JLabel balanceLabel;

    public BankingSystemGUI() {
        frame = new JFrame("Banking System Application");
        account = new BankAccount(12345, "Hirdyansh Sharma");

        // Create and configure Swing components
        JLabel accountLabel = new JLabel("Account Holder: " + account.getAccountHolder());
        JLabel accountNumberLabel = new JLabel("Account Number: " + account.getAccountNumber());
        JLabel currentBalanceLabel = new JLabel("Current Balance:");

        balanceLabel = new JLabel(Double.toString(account.getBalance()));
        JButton creditButton = new JButton("Credit");
        JButton debitButton = new JButton("Debit");

        amountField = new JTextField(10);

        // Add action listeners to buttons
        creditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                account.credit(amount);
                updateBalanceLabel();
            }
        });
        
        debitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                boolean success = account.debit(amount);
                if (success) {
                    updateBalanceLabel();
                } else {
                    JOptionPane.showMessageDialog(frame, "Insufficient funds!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Create a panel for buttons and text fields
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Amount: "));
        inputPanel.add(amountField);
        inputPanel.add(creditButton);
        inputPanel.add(debitButton);

        // Create the main content panel
        JPanel contentPanel = new JPanel(new GridLayout(5, 1));
        contentPanel.add(accountLabel);
        contentPanel.add(accountNumberLabel);
        contentPanel.add(currentBalanceLabel);
        contentPanel.add(balanceLabel);
        contentPanel.add(inputPanel);

        // Add the content panel to the frame
        frame.add(contentPanel);

        // Set frame properties and make it visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    private void updateBalanceLabel() {
        balanceLabel.setText(Double.toString(account.getBalance()));
    }

    public void launch() {
        // Leave this empty for now
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BankingSystemGUI app = new BankingSystemGUI();
            app.launch();
   });
}
}
