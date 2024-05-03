package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguageSwitchApp extends JFrame {

    private JLabel label;
    private JButton button;
    private JMenuBar menuBar;
    private JMenu languageMenu;
    private JMenuItem englishItem;
    private JMenuItem russianItem;

    public LanguageSwitchApp() {
        setTitle("Простое приложение с переключением языка");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Hello!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        button = new JButton("Click me!");

        menuBar = new JMenuBar();
        languageMenu = new JMenu("Language");
        englishItem = new JMenuItem("English");
        russianItem = new JMenuItem("Русский");

        englishItem.addActionListener(e -> setLanguage("English"));

        russianItem.addActionListener(e -> setLanguage("Russian"));
        button.addActionListener(e -> switchLanguage());

        languageMenu.add(englishItem);
        languageMenu.add(russianItem);
        menuBar.add(languageMenu);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(label, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.SOUTH);

        setJMenuBar(menuBar);
    }
    private void setLanguage(String language) {
        if (language.equals("English")) {
            label.setText("Hello!");
            button.setText("Click me!");
        } else if (language.equals("Russian")) {
            label.setText("Привет!");
            button.setText("Нажми меня!");
        }
    }

    private void switchLanguage() {
        String currentLanguage = label.getText().equals("Hello!") ? "Russian" : "English";
        setLanguage(currentLanguage);
    }
}