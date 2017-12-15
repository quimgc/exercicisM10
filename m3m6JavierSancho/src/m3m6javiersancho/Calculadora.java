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
        JLabel firstNum = new JLabel("0", SwingConstants.CENTER);
        JLabel TextNum1 = new JLabel("Num1", SwingConstants.CENTER);
        JLabel secondNum = new JLabel("0", SwingConstants.CENTER);
        JLabel TextNum2 = new JLabel("Num2", SwingConstants.CENTER);
        JLabel operador = new JLabel("signe");
        JLabel signeOperand = new JLabel("", SwingConstants.CENTER);
        
        jb.setBounds(0, 0, 200, 50);
        jb.setOpaque(true);
        jb.setBackground(Color.GREEN);
        jb.setForeground(Color.black);
        jb.setBorder(BorderFactory.createLineBorder(Color.black));

        calc.add(jb);

        firstNum.setOpaque(true);
        firstNum.setBounds(300, 50, 20, 20);
        firstNum.setBackground(Color.LIGHT_GRAY);
        firstNum.setBorder(BorderFactory.createLineBorder(Color.black));

        calc.add(firstNum);
        
        secondNum.setOpaque(true);
        secondNum.setBounds(300, 100, 20, 20);
        secondNum.setBackground(Color.LIGHT_GRAY);
        secondNum.setBorder(BorderFactory.createLineBorder(Color.black));

        calc.add(secondNum);
        
        TextNum1.setOpaque(true);
        TextNum1.setBounds(230, 50, 50, 20);
        TextNum1.setBackground(Color.LIGHT_GRAY);
        TextNum1.setBorder(BorderFactory.createLineBorder(Color.black));

        calc.add(TextNum1);


        operador.setOpaque(true);
        operador.setBounds(230, 75, 50, 20);
        operador.setBackground(Color.LIGHT_GRAY);
        operador.setBorder(BorderFactory.createLineBorder(Color.black));

        calc.add(operador);

        
        signeOperand.setOpaque(true);
        signeOperand.setBounds(300, 75, 20, 20);
        signeOperand.setBackground(Color.LIGHT_GRAY);
        signeOperand.setBorder(BorderFactory.createLineBorder(Color.black));

        calc.add(signeOperand);

        TextNum2.setOpaque(true);
        TextNum2.setBounds(230, 100, 50, 20);
        TextNum2.setBackground(Color.LIGHT_GRAY);
        TextNum2.setBorder(BorderFactory.createLineBorder(Color.black));

        calc.add(TextNum2);
        
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
                                signeOperand.setText(""+operand);
                                if (!op) {
                                    num1 = Double.parseDouble(jb.getText());
                                    firstNum.setText(jb.getText());
                                    op = true;
                                    punt = false;
                                }
                                jb.setText("0");
                                break;
                            case "-":
                                operand = '-';
                                signeOperand.setText(""+operand);
                               if (!op) {
                                    num1 = Double.parseDouble(jb.getText());
                                    firstNum.setText(jb.getText());

                                    op = true;
                                    punt = false;
                                }
                                jb.setText("0");

                                break;

                            case "x":
                                operand = 'x';
                                signeOperand.setText(""+operand);
                                if (!op) {
                                    num1 = Double.parseDouble(jb.getText());
                                    firstNum.setText(jb.getText());

                                    op = true;
                                    punt = false;
                                }
                                jb.setText("0");

                                break;

                            case "/":
                                operand = '/';
                                signeOperand.setText(""+operand);

                                if (!op) {
                                    num1 = Double.parseDouble(jb.getText());
                                    firstNum.setText(jb.getText());

                                    op = true;
                                    punt = false;
                                }
                                jb.setText("0");

                                break;

                            case "=":
                                num2 = Double.parseDouble(jb.getText());
                                secondNum.setText(jb.getText());
                                op = false;
                                signeOperand.setText("=");


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
        calc.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

}
