package tda551;

import javax.swing.*;

public class PolygonViewer extends JFrame implements AnimateListener {

    public PolygonViewer(PolygonModel model) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(30, 30, 300, 300);
        setVisible(true);
        add(model);
<<<<<<< HEAD

        model.addListener(this);

    }

=======
        
        model.addListener(this);
    }

>>>>>>> 9186a56aec9b21e0cca5fce47aadd625be4ef115
    @Override
    public void actOnUpdate() {
        repaint();
        validate();
    }
}
