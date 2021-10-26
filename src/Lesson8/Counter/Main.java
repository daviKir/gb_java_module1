package Lesson8.Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
  private static final String WINDOW_TITLE = "Counter";
  private static final String DEC_BUTTON_TEXT = "-";
  private static final String INC_BUTTON_TEXT = "+";
  private static final String RESET_BUTTON_TEXT = "Reset";
  private static final String SET_BUTTON_TEXT = "SET";

  private static final int SQUAD_BUTTON_SIZE = 40;
  private static final int RESET_BUTTON_WIDTH = 70;
  private static final int RESET_BUTTON_HEIGHT = 40;
  private static final int FIELD_WIDTH = 120;
  private static final int FIELD_HEIGHT = 40;
  private static final int SET_BUTTON_WIDTH = 40;
  private static final int SET_BUTTON_HEIGHT = 40;
  private static final int INIT_COUNT = 0;

  private static int count = INIT_COUNT;

  public static void main(String[] args) {
    JFrame counterWindow = new JFrame();
    counterWindow.setTitle(WINDOW_TITLE);
    counterWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    counterWindow.setBounds(800, 300, 200, 200);

    JLabel countLabel = addCountLabel(counterWindow);
    addHeader(counterWindow, countLabel);
    addControlButtons(counterWindow, countLabel);

    counterWindow.setVisible(true);
  }

  private static JLabel addCountLabel(JFrame counterWindow) {
    JLabel countLabel = new JLabel(String.valueOf(count));
    countLabel.setHorizontalAlignment(SwingConstants.CENTER);
    counterWindow.add(countLabel, BorderLayout.CENTER);

    return countLabel;
  }

  private static void addHeader(JFrame counterWindow, JLabel countLabel) {
    JPanel headerPanel = new JPanel();

    JTextField initialCountField = new JTextField();
    initialCountField.setPreferredSize(new Dimension(FIELD_WIDTH, FIELD_HEIGHT));
    initialCountField.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setInitialValue(initialCountField, countLabel);
      }
    });

    JButton setInitValueButton = new JButton(SET_BUTTON_TEXT);
    setInitValueButton.setPreferredSize(new Dimension(SET_BUTTON_WIDTH, SET_BUTTON_HEIGHT));
    setInitValueButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setInitialValue(initialCountField, countLabel);
      }
    });

    headerPanel.add(initialCountField);
    headerPanel.add(setInitValueButton);

    counterWindow.add(headerPanel, BorderLayout.NORTH);
  }

  private static void setInitialValue(JTextField initialCountField, JLabel countLabel) {
    count = Integer.parseInt(initialCountField.getText());
    countLabel.setText(initialCountField.getText());
  }

  private static void addControlButtons(JFrame counterWindow, JLabel countLabel) {
    JPanel buttonsPanel = new JPanel();

    JButton decButton = new JButton(DEC_BUTTON_TEXT);
    decButton.setPreferredSize(new Dimension(SQUAD_BUTTON_SIZE, SQUAD_BUTTON_SIZE));
    decButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        countLabel.setText(String.valueOf(--count));
      }
    });

    JButton incButton = new JButton(INC_BUTTON_TEXT);
    incButton.setPreferredSize(new Dimension(SQUAD_BUTTON_SIZE, SQUAD_BUTTON_SIZE));
    incButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        countLabel.setText(String.valueOf(++count));
      }
    });

    JButton resetButton = new JButton(RESET_BUTTON_TEXT);
    resetButton.setPreferredSize(new Dimension(RESET_BUTTON_WIDTH, RESET_BUTTON_HEIGHT));
    resetButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        countLabel.setText(String.valueOf(count = INIT_COUNT));
      }
    });

    buttonsPanel.add(decButton, BorderLayout.EAST);
    buttonsPanel.add(resetButton, BorderLayout.CENTER);
    buttonsPanel.add(incButton, BorderLayout.WEST);

    counterWindow.add(buttonsPanel, BorderLayout.SOUTH);
  }
}
