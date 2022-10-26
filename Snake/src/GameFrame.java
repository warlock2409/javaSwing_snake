import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){ // constructor
      this.add( new GamePannel());
      this.setSize(500,500);
      ImageIcon imageIcon=new ImageIcon("src/450-4507696_600-x-600-1-snake-mascot-logo-png.png");
      this.setIconImage(imageIcon.getImage());
      this.setTitle("Snake");
      this.pack();
      this.setResizable(false);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.setLocationRelativeTo(null);

    }
}
