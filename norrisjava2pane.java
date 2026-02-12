import javax.swing.JOptionPane;
public class norrisjava2pane {

    public static void main(String[] args) {
        System.out.println("test");
        //dialog
        JOptionPane.showMessageDialog(null, "You Are An Idiot!","norrisjava2pane",
            JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "You Are Still An Idiot!","norrisjava2pane",
            JOptionPane.ERROR_MESSAGE);

        // input diag
        String name = JOptionPane.showInputDialog("Type in your name:");
        System.out.println("Name was " + name);
        // display result
        JOptionPane.showMessageDialog(null, name + " is An Idiot!");
    }
}