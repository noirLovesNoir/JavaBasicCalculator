import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {
    int num1= -7;
    int num2= -7;
    int op= 0;

    JFrame jFrame = new JFrame();
    JTextField ip = new JTextField();
    JButton one = new JButton();
    JButton two = new JButton();
    JButton three = new JButton();
    JButton four = new JButton();
    JButton five = new JButton();
    JButton six = new JButton();
    JButton seven = new JButton();
    JButton eight = new JButton();
    JButton nine = new JButton();
    JButton zero = new JButton();
    JButton addition = new JButton();
    JButton subtraction = new JButton();
    JButton multiplication = new JButton();
    JButton division = new JButton();
    JButton equal = new JButton();
    JButton clear = new JButton();

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==one){
            String currentText = ip.getText();
            String newText = currentText + "1";
            ip.setText(newText);
        } else if (e.getSource()==two){
            String currentText = ip.getText();
            String newText = currentText + "2";
            ip.setText(newText);
        } else if (e.getSource()==three){
            String currentText = ip.getText();
            String newText = currentText + "3";
            ip.setText(newText);
        } else if (e.getSource()==four){
            String currentText = ip.getText();
            String newText = currentText + "4";
            ip.setText(newText);
        } else if (e.getSource()==five){
            String currentText = ip.getText();
            String newText = currentText + "5";
            ip.setText(newText);
        } else if (e.getSource()==six){
            String currentText = ip.getText();
            String newText = currentText + "6";
            ip.setText(newText);
        } else if (e.getSource()==seven){
            String currentText = ip.getText();
            String newText = currentText + "7";
            ip.setText(newText);
        } else if (e.getSource()==eight){
            String currentText = ip.getText();
            String newText = currentText + "8";
            ip.setText(newText);
        } else if (e.getSource()==nine){
            String currentText = ip.getText();
            String newText = currentText + "9";
            ip.setText(newText);
        } else if (e.getSource()==zero){
            String currentText = ip.getText();
            String newText = currentText + "0";
            ip.setText(newText);
        }


        else if (e.getSource()==addition){
            String currentText = ip.getText();
            if (num1==-7){
                num1= Integer.parseInt(currentText);
            } else {
                num2= Integer.parseInt(currentText);
            }
            String newText = currentText + "+";
            ip.setText(newText);
            op=1;
            ip.setText("");
        } else if (e.getSource()==subtraction){
            String currentText = ip.getText();
            if (num1==-7){
                num1= Integer.parseInt(currentText);
            } else {
                num2= Integer.parseInt(currentText);
            }
            String newText = currentText + "-";
            ip.setText(newText);
            op=2;
            ip.setText("");
        } else if (e.getSource()==multiplication){
            String currentText = ip.getText();
            if (num1==-7){
                num1= Integer.parseInt(currentText);
            } else {
                num2= Integer.parseInt(currentText);
            }
            String newText = currentText + "*";
            ip.setText(newText);
            op=3;
            ip.setText("");
        } else if (e.getSource()==division){
            String currentText = ip.getText();
            if (num1==-7){
                num1= Integer.parseInt(currentText);
            } else {
                num2= Integer.parseInt(currentText);
            }
            String newText = currentText + "/";
            ip.setText(newText);
            op=4;
            ip.setText("");
        } else if (e.getSource()==equal){
            String currentText = ip.getText();
            if (num1==-7){
                num1= Integer.parseInt(currentText);
            } else {
                num2= Integer.parseInt(currentText);
            }

            if(op==1){
                ip.setText(String.valueOf(num1+num2));
            } else if (op==2) {
                ip.setText(String.valueOf(num1-num2));
            } else if (op==3) {
                ip.setText(String.valueOf(num1*num2));
            } else if (op==4) {
                if(num2==0){
                    ip.setText(":(");
                } else {
                    ip.setText(String.valueOf(num1/num2));
                }
            }

        }


        if (e.getSource()==clear){
            ip.setText("");
            num1=-7;
            num2=-7;
            op=0;
        }
    }

    public Calculator(){
        ip.setBounds(0,0,400,100);
        one.setBounds(0,100,100,100);
        two.setBounds(100,100,100,100);
        three.setBounds(200,100,100,100);
        four.setBounds(300,100,100,100);
        five.setBounds(0,200,100,100);
        six.setBounds(100,200,100,100);
        seven.setBounds(200,200,100,100);
        eight.setBounds(300,200,100,100);

        nine.setBounds(0,300,100,100);
        zero.setBounds(100,300,100,100);
        addition.setBounds(200,300,100,100);
        subtraction.setBounds(300,300,100,100);

        multiplication.setBounds(0,400,100,100);
        division.setBounds(100,400,100,100);
        equal.setBounds(200,400,100,100);
        clear.setBounds(300,400,100,100);

        jFrame.add(ip);
        jFrame.add(one);
        jFrame.add(two);
        jFrame.add(three);
        jFrame.add(four);
        jFrame.add(five);
        jFrame.add(six);
        jFrame.add(seven);
        jFrame.add(eight);
        jFrame.add(nine);
        jFrame.add(zero);
        jFrame.add(addition);
        jFrame.add(subtraction);
        jFrame.add(multiplication);
        jFrame.add(division);
        jFrame.add(equal);
        jFrame.add(clear);

        jFrame.setTitle("Calculator");
        jFrame.setLocation(700,400);
        jFrame.setSize(415,540);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");
        zero.setText("0");
        addition.setText("+");
        subtraction.setText("-");
        multiplication.setText("*");
        division.setText("/");
        equal.setText("=");
        clear.setText("C");

        ip.setFont(new Font("Arial", Font.PLAIN, 40));
        one.setFont(new Font("Arial", Font.PLAIN, 40));
        two.setFont(new Font("Arial", Font.PLAIN, 40));
        three.setFont(new Font("Arial", Font.PLAIN, 40));
        four.setFont(new Font("Arial", Font.PLAIN, 40));
        five.setFont(new Font("Arial", Font.PLAIN, 40));
        six.setFont(new Font("Arial", Font.PLAIN, 40));
        seven.setFont(new Font("Arial", Font.PLAIN, 40));
        eight.setFont(new Font("Arial", Font.PLAIN, 40));
        nine.setFont(new Font("Arial", Font.PLAIN, 40));
        zero.setFont(new Font("Arial", Font.PLAIN, 40));
        addition.setFont(new Font("Arial", Font.PLAIN, 40));
        subtraction.setFont(new Font("Arial", Font.PLAIN, 40));
        multiplication.setFont(new Font("Arial", Font.PLAIN, 40));
        division.setFont(new Font("Arial", Font.PLAIN, 40));
        equal.setFont(new Font("Arial", Font.PLAIN, 40));
        clear.setFont(new Font("Arial", Font.ITALIC, 40));
        
        ip.setForeground(Color.yellow);
        ip.setBackground(Color.black);
        ip.setOpaque(true);

        clear.setForeground(Color.CYAN);
        clear.setBackground(Color.darkGray);
        clear.setOpaque(true);

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        addition.addActionListener(this);
        subtraction.addActionListener(this);
        multiplication.addActionListener(this);
        division.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);


    }
}

class TestFC{
    public static void main(String[] args) {
        new Calculator();
    }
}
