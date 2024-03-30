import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AdvanceCalc implements ActionListener {
    int num1=0;
    int num2=0;
    int op = 0;
    JFrame jFrame = new JFrame();
    JButton one = new JButton();
    JButton two = new JButton();
    JButton three = new JButton();
    JButton four = new JButton();
    JButton addition = new JButton();
    JButton subtraction = new JButton();
    JButton equal = new JButton();
    JTextField ip = new JTextField();

    public void actionPerformed(ActionEvent e){


        if(e.getSource()==one){
            String currentText = ip.getText();
            String newText = currentText + "1";
            ip.setText(newText);
        } else if (e.getSource()==two) {
            String currentText = ip.getText();
            String newText = currentText + "2";
            ip.setText(newText);
        } else if (e.getSource()==three) {
            String currentText = ip.getText();
            String newText = currentText + "3";
            ip.setText(newText);
        } else if (e.getSource()==four) {
            String currentText = ip.getText();
            String newText = currentText + "4";
            ip.setText(newText);
        }

        if (e.getSource()==addition) {
            String currentText = ip.getText();
            if(num1==0){
                num1 = Integer.parseInt(currentText);
            } else {
                num2 = Integer.parseInt(currentText);
            }
            op=1;
            ip.setText("");

        } else if (e.getSource()==subtraction) {
            String currentText = ip.getText();
            if(num1==0){
                num1 = Integer.parseInt(currentText);
            } else {
                num2 = Integer.parseInt(currentText);
            }
            op=2;
            ip.setText("");
        }

        if (e.getSource()==equal) {
            String currentText = ip.getText();
            if(num1==0){
                num1 = Integer.parseInt(currentText);
            } else {
                num2 = Integer.parseInt(currentText);
            }
            if(op==1){
                ip.setText(String.valueOf(num1+num2));
            } else if (op==2) {
                ip.setText(String.valueOf(num1-num2));
            }
        }
    }

    public AdvanceCalc(){
        ip.setBounds(0,0,500,50);
        one.setBounds(0,51,249,30);
        two.setBounds(251,51,249,30);
        three.setBounds(0,82,249,30);
        four.setBounds(251,82,249,30);
        addition.setBounds(0,114,249,30);
        subtraction.setBounds(251,114,249,30);
        equal.setBounds(0,146,500,30);

        jFrame.add(ip);
        jFrame.add(one);
        jFrame.add(two);
        jFrame.add(three);
        jFrame.add(four);
        jFrame.add(addition);
        jFrame.add(subtraction);
        jFrame.add(equal);

        jFrame.setTitle("BOSS APP { by HOSAIN MESBA B) }");
        jFrame.setLocation(700,400);
        jFrame.setSize(500,225);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        addition.setText("+");
        subtraction.setText("-");
        equal.setText("=");

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        addition.addActionListener(this);
        subtraction.addActionListener(this);
        equal.addActionListener(this);
    }
}

class TestCalc{
    public static void main(String[] args) {
        new AdvanceCalc();
    }
}
