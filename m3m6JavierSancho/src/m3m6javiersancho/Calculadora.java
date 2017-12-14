/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author quim
 */
public class Calculadora {

    static boolean punt = false;
    static double num1 = 0;
    static double num2 = 0;
    static boolean op = false;
    static char operand;

//    public static void signeOperacio(String op){
//        operand = op.charAt(0);
//        System.out.println(operand);
//        
//
//    }
    public static void main(String[] args) {
        JFrame calc = new JFrame("Calculadora");
        String[] chars = {"7", "8", "9", "/", "4", "5", "6", "-", "1", "2", "3", "+", ".", "0", "=", "x"};
        JButton[][] botons = new JButton[4][4];
        int cont = 0;
        JLabel jb = new JLabel("0", SwingConstants.RIGHT);
        jb.setBounds(0, 0, 200, 50);
        jb.setOpaque(true);
        jb.setBackground(Color.GREEN);
        jb.setForeground(Color.black);
        calc.add(jb);

        for (int i = 0; i < botons.length; i++) {
            for (int j = 0; j < botons[i].length; j++) {
                botons[i][j] = new JButton(chars[i + j * 4]);
                botons[i][j].setBounds(i * 50, j * 50 + 50, 50, 50);

                botons[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        // display/center the jdialog when the button is pressed
                        if (jb.getText() == "0") {
                            jb.setText("");
                        }
//                        jb.setText(jb.getText() + e.getActionCommand());

                        switch (e.getActionCommand()) {
                            case ".":
                                if (!punt) {
                                    punt = true;
                                    jb.setText(jb.getText() + e.getActionCommand());
                                }
                                break;

                            case "+":
                                operand = '+';

                                if (!op) {
                                    num1 = Double.parseDouble(jb.getText());
                                    op = true;
                                }
                                jb.setText("0");
                                break;
                            case "-":
                                operand = '-';
                                if (!op) {
                                    num1 = Double.parseDouble(jb.getText());
                                    op = true;
                                }
                                jb.setText("0");

                                break;

                            case "x":

                                operand = 'x';
                                if (!op) {
                                    num1 = Double.parseDouble(jb.getText());
                                    op = true;
                                }
                                jb.setText("0");

                                break;

                            case "/":
                                operand = '/';
                                if (!op) {
                                    num1 = Double.parseDouble(jb.getText());
                                    op = true;
                                }
                                jb.setText("0");

                                break;

                            case "=":
                                num2 = Double.parseDouble(jb.getText());
                                op = false;

                                switch (operand) {
                                    case '+':

                                        jb.setText("" + (num1 + num2));
                                        num1 = Double.parseDouble(jb.getText());
                                        break;
                                    case '-':
                                        jb.setText("" + (num1 - num2));
                                        num1 = Double.parseDouble(jb.getText());
                                        break;
                                    case 'x':
                                        jb.setText("" + num1 * num2);
                                        num1 = Double.parseDouble(jb.getText());
                                        break;
                                    case '/':
                                        jb.setText("" + num1 / num2);
                                        num1 = Double.parseDouble(jb.getText());
                                        break;
                                }

                                num2 = 0;
                                break;

                            default:
                                jb.setText(jb.getText() + e.getActionCommand());

                        }

                    }
                });
                calc.add(botons[i][j]);
            }
        }

        calc.setSize(1000, 1000);
        calc.setLayout(null);
        calc.setVisible(true);
        jb.setBorder(BorderFactory.createLineBorder(Color.black));
        calc.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

}
