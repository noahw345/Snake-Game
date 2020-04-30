package snakeGame;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class snakeGame extends JFrame {
public int score = 5;
public snakeGame() {
    add(new Board());
    setResizable(false);
    pack();

    setTitle("Snake");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    /*JOptionPane.showMessageDialog(null, "Your score : " + score);
    JLabel scoreLabel = new JLabel("Score: 0");
    scoreLabel.setBounds(10, 10, 100, 50);
    scoreLabel.setText("Score: " + score);
    */
 
}

public static void main(String[] args) {

    // Creates a new thread so our GUI can process itself
    EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            JFrame frame = new snakeGame();
            frame.setVisible(true);
        }
    });
}
}