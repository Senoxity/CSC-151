import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class the_pane_game {

    public static void main(String[] args) {
        System.out.println("test");
        //dialog
        JOptionPane.showMessageDialog(null, "you have opened the pane","welcome to the pane",
            JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "you will play the pane game","the pane game",
            JOptionPane.WARNING_MESSAGE);

        // input diag with loop
        String name = null;
        while (name == null) {
            name = JOptionPane.showInputDialog(null, "Type in your name:", "data broker sim", JOptionPane.QUESTION_MESSAGE);
            if (name == null) {
                JOptionPane.showMessageDialog(null, "the choice isn't yours to make", "", JOptionPane.QUESTION_MESSAGE);
            }
        }
        System.out.println("Name was " + name);
        // display result
        JOptionPane.showMessageDialog(null, name + " is playing the pane game", "the pane", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showOptionDialog(null, "are you having fun?", "answer me", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"yes", "yes"}, "yes");
        JOptionPane.showMessageDialog(null, "thanks pal", "your welcome", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "some unfortunate news", "the pane", JOptionPane.INFORMATION_MESSAGE);
        
        // Create dialog for the escaping pane near top left
        JDialog dialog = new JDialog();
        dialog.setTitle("the pane");
        dialog.setLocation(50, 50);
        dialog.setSize(300, 150);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
        JOptionPane.showOptionDialog(dialog, "the pane is escaping", "help", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"don't worry i got it"}, "don't worry i got it");
        JOptionPane.showMessageDialog(dialog, "hey thanks man", "the pane", JOptionPane.INFORMATION_MESSAGE);
        dialog.dispose();

    }
}