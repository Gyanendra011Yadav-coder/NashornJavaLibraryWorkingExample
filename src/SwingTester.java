import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-29,Nov,2022
 * in Project: NashornTestingProject
 */
public class SwingTester {

    public static void main(String[] args) {
        createWindow();
    }

    static void createWindow() {
        JFrame frame = new JFrame("HTML Render Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(1500, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame){
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

        JEditorPane jEditorPane = new JEditorPane();
        jEditorPane.setEditable(false);
        URL url= SwingTester.class.getResource("test.html");

        try {
            jEditorPane.setPage(url);
        } catch (IOException e) {
            jEditorPane.setContentType("text/html");
            jEditorPane.setText("<html>Page not found.</html>");
        }

        JScrollPane jScrollPane = new JScrollPane(jEditorPane);
        jScrollPane.setPreferredSize(new Dimension(1000,1500));

        panel.add(jScrollPane);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
}
