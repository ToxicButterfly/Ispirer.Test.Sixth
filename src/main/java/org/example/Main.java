package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LanguageSwitchApp app = new LanguageSwitchApp();
            app.setVisible(true);
        });
    }
}