package app.client.components.principal;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;


public class PrincipalComponent implements ActionListener, MouseListener{
    private PrincipalTemplate principalTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    

    public PrincipalComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.principalTemplate = new PrincipalTemplate(this);        
    }

    public PrincipalTemplate getPrincipalTemplate() {
        return principalTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
