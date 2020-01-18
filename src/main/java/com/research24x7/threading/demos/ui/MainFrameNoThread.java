
package com.research24x7.threading.demos.ui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameNoThread extends JFrame {

    private JLabel countLabel1 = new JLabel("0");
    private JLabel statusLabel = new JLabel("Task not completed.");
    private JButton startButton = new JButton("Start");

    public MainFrameNoThread(String title) {
        super(title);

        setLayout(new GridBagLayout());

        countLabel1.setFont(new Font("serif", Font.BOLD, 28));

        GridBagConstraints gc = new GridBagConstraints();

        gc.fill = GridBagConstraints.NONE;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        add(countLabel1, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 1;
        add(statusLabel, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 1;
        add(startButton, gc);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                start();
            }
        });

        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void start() {

        for(int i=0; i<=10; i++) {

              countLabel1.setText(Integer.toString(i));

              try {

                  Thread.sleep(1000);

              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
        }

        statusLabel.setText("Completed.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainFrameNoThread("SwingWorker App");
            }
        });
    }
}