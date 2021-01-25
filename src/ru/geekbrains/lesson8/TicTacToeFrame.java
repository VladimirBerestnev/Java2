package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeFrame {

    static class TicFrame extends JFrame {

        private static final String DOT_EMPTY = "DOT_EMPTY";
        private static final String DOT_X = "DOT_X";
        private static final String DOT_O = "DOT_O";

        public TicFrame() {

            setTitle("TicTacToe");
            setSize(600, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new GridLayout(3,3));

            for (int i = 0; i < 9; i++){
                add(createButton());
            }
            setVisible(true);


        }

        private Component createButton() {
            return new JButton() {

                {
                    setActionCommand(DOT_EMPTY);
                    addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed (ActionEvent e) {
                            String action = getActionCommand().equals(DOT_EMPTY) ? DOT_X : DOT_O;
                            setActionCommand(action);

                        }

                    });

                }

                @Override
                public void paint (Graphics graphics) {
                    super.paint(graphics);

                    if (getActionCommand().equals(DOT_EMPTY)) {

                        graphics.drawOval(((getWidth() / 2) - getWidth() / 16), 70, getWidth() / 8, getWidth() / 8);
                        graphics.fillOval(((getWidth() / 2) - getWidth() / 16), 70, getWidth() / 8, getWidth() / 8);

                    } else  if (getActionCommand().equals(DOT_X)) {

                        Graphics2D g2d = (Graphics2D) graphics;
                        g2d.setStroke(new BasicStroke(10));
                        g2d.setColor(Color.GREEN);
                        g2d.drawLine(0,0,this.getWidth(),this.getHeight());
                        g2d.drawLine(this.getWidth(),0,0,this.getHeight());

                    } else {
                        graphics.drawOval(getWidth() / 2, this.getHeight() / 2, getWidth() / 4, getWidth() / 4);
                //        graphics.fillOval(((getWidth() / 2) - getWidth() / 16), 70, getWidth() / 8, getWidth() / 8);


                    }



                }
            };



        }

    }


    public static void main(String[] args) {
        new TicFrame();
    }

}
