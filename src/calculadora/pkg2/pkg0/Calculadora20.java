package calculadora.pkg2.pkg0;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculadora20 extends JFrame implements ActionListener {

    JTextField pantalla;
    double resultado;
    String operacion = "0";
    JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, punto, sum, res, mul, div, igual, ac;
    boolean bandera = false, nueva = true;
    double aux1, aux2;

    public static void main(String[] args) {
        Calculadora20 obj = new Calculadora20();
        obj.setVisible(true);
    }

    public Calculadora20() {
        super();

        setTitle("Calculadora 2.0");
        setLayout(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        setSize(300, 330);

        Container contenedor = getContentPane();
        contenedor.setBackground(new Color(63, 63, 63));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        n1 = new JButton();
        n2 = new JButton();
        n3 = new JButton();
        n4 = new JButton();
        n5 = new JButton();
        n6 = new JButton();
        n7 = new JButton();
        n8 = new JButton();
        n9 = new JButton();
        n0 = new JButton();
        punto = new JButton();

        div = new JButton();
        sum = new JButton();
        res = new JButton();
        mul = new JButton();

        igual = new JButton();
        ac = new JButton();

        pantalla = new JTextField("0", 20);
        pantalla.setBounds(20, 20, 250, 40);
        pantalla.setFont(new Font("MS UI Gothic", Font.BOLD, 25));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setBackground(new Color(235, 252, 226));

        n1.setBackground(new Color(181, 230, 29));
        n2.setBackground(new Color(181, 230, 29));
        n3.setBackground(new Color(181, 230, 29));
        n4.setBackground(new Color(181, 230, 29));
        n5.setBackground(new Color(181, 230, 29));
        n6.setBackground(new Color(181, 230, 29));
        n7.setBackground(new Color(181, 230, 29));
        n8.setBackground(new Color(181, 230, 29));
        n9.setBackground(new Color(181, 230, 29));
        n0.setBackground(new Color(181, 230, 29));
        punto.setBackground(new Color(181, 230, 29));

        div.setBackground(new Color(112, 111, 105));
        mul.setBackground(new Color(112, 111, 105));
        sum.setBackground(new Color(25, 127, 105));
        res.setBackground(new Color(112, 111, 105));
        igual.setBackground(new Color(112, 111, 105));
        ac.setBackground(new Color(25, 127, 105));

        n1.setText("1");
        n2.setText("2");
        n3.setText("3");
        n4.setText("4");
        n5.setText("5");
        n6.setText("6");
        n7.setText("7");
        n8.setText("8");
        n9.setText("9");
        n0.setText("0");
        punto.setText(".");
        div.setText("÷");
        mul.setText("x");
        sum.setText("+");
        res.setText("-");
        igual.setText("=");
        ac.setText("AC");

        n0.setBounds(20, 230, 95, 45);
        n1.setBounds(20, 180, 45, 45);
        n2.setBounds(70, 180, 45, 45);
        n3.setBounds(120, 180, 45, 45);

        n4.setBounds(20, 130, 45, 45);
        n5.setBounds(70, 130, 45, 45);
        n6.setBounds(120, 130, 45, 45);

        n7.setBounds(20, 80, 45, 45);
        n8.setBounds(70, 80, 45, 45);
        n9.setBounds(120, 80, 45, 45);

        punto.setBounds(120, 230, 45, 45);
        mul.setBounds(225, 130, 45, 45);
        div.setBounds(175, 130, 45, 45);
        res.setBounds(225, 180, 45, 45);
        sum.setBounds(175, 180, 45, 95);

        igual.setBounds(225, 230, 45, 45);
        ac.setBounds(175, 80, 95, 45);

        n1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "1");
            }
        });

        n2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "2");
            }
        });

        n3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "3");
            }
        });

        n4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "4");
            }
        });

        n5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "5");
            }
        });

        n6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "6");
            }
        });

        n7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "7");
            }
        });

        n8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "8");
            }
        });

        n9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "9");
            }
        });

        n0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                pantalla.setText(pantalla.getText() + "0");
            }
        });

        punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (nueva) {
                    pantalla.setText("");
                    nueva = false;
                }
                if (bandera == false) {
                    pantalla.setText(pantalla.getText() + ".");
                    bandera = true;
                } else {
                    pantalla.setText(pantalla.getText());

                }
            }
        });

        ac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                pantalla.setText("");
                aux1 = aux2 = 0;
                operacion = "";
                bandera = false;
            }
        });

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (aux1 != 0) {
                        aux1 = aux1 + Double.parseDouble(pantalla.getText());
                    } else {
                        aux1 = Double.parseDouble(pantalla.getText());
                    }
                    operacion = "suma";
                    pantalla.setText("");
                    bandera = false;
                } catch (Exception err) {
                }
            }
        });
        res.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (aux1 != 0) {
                        aux1 = aux1 - Double.parseDouble(pantalla.getText());
                    } else {
                        aux1 = Double.parseDouble(pantalla.getText());
                    }
                    operacion = "resta";
                    pantalla.setText("");
                    bandera = false;
                } catch (Exception err) {
                }
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (aux1 != 0) {
                        aux1 = aux1 * Double.parseDouble(pantalla.getText());
                    } else {
                        aux1 = Double.parseDouble(pantalla.getText());
                    }
                    operacion = "multiplicacion";
                    pantalla.setText("");
                    bandera = false;
                } catch (Exception err) {
                }
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    if (aux1 != 0) {
                        aux1 = aux1 / Double.parseDouble(pantalla.getText());
                    } else {
                        aux1 = Double.parseDouble(pantalla.getText());
                    }
                    operacion = "division";
                    pantalla.setText("");
                    bandera = false;
                } catch (Exception err) {
                }
            }
        });

        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    aux2 = Double.parseDouble(pantalla.getText());
                } catch (Exception err) {
                }
                switch (operacion) {
                    case "suma":
                        {
                            double res = aux1 + aux2;
                            pantalla.setText(String.valueOf(res));
                            aux1 = aux2 = 0;
                            operacion = "";
                            break;
                        }
                    case "resta":
                        {
                            double res = aux1 - aux2;
                            pantalla.setText(String.valueOf(res));
                            aux1 = aux2 = 0;
                            operacion = "";
                            break;
                        }
                    case "multiplicacion":
                        {
                            double res = aux1 * aux2;
                            pantalla.setText(String.valueOf(res));
                            aux1 = aux2 = 0;
                            operacion = "";
                            break;
                        }
                    case "division":
                        {
                            double res = aux1 / aux2;
                            pantalla.setText(String.valueOf(res));
                            aux1 = aux2 = 0;
                            operacion = "";
                            break;
                        }
                    default:
                        break;
                }
                nueva = true;
            }
        });

        add(pantalla);
        add(n0);
        add(n1);
        add(n2);
        add(n3);
        add(n4);
        add(n5);
        add(n6);
        add(n7);
        add(n8);
        add(n9);
        add(punto);
        add(div);
        add(mul);
        add(sum);
        add(res);
        add(igual);
        add(ac);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

}
