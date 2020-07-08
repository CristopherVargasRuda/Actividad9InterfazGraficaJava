package app.client.components.principal;

import app.client.components.accion.AccionComponent;
import app.client.components.accion.AccionTemplate;
import javax.swing.JPanel;
import app.services.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PrincipalTemplate extends JPanel {

    private PrincipalComponent principalComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;
    private JPanel pSuperior, pIzquierda, pDerecha;
    private ImageIcon iSuperior, iTetaneitor, iDimAux;
    private JLabel lSuperior, lTetaneitor;

    public PrincipalTemplate(PrincipalComponent principalComponent) {
        this.principalComponent = principalComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearObjetosDecoradores();
        crearJPanels();
        crearJLabels();
        crearContenidoPAcciones();

        this.setSize(910, 540);
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearObjetosDecoradores() {
        iSuperior = new ImageIcon("resources/img/superior.png");
        iTetaneitor = new ImageIcon("resources/img/tetaneitor.jpg");
    }

    private void crearJPanels() {
        pSuperior = sObjGraficos.construirJPanel(
                0, 0, 910, 230, sRecursos.getColorFondo2(), null
        );
        this.add(pSuperior);

        pIzquierda = sObjGraficos.construirJPanel(
                0, 230, 660, 310, sRecursos.getColorFondo2(), null
        );
        this.add(pIzquierda);

        pDerecha = sObjGraficos.construirJPanel(
                660, 230, 270, 310, sRecursos.getColorFondo2(), null
        );
        this.add(pDerecha);
    }

    private void crearJLabels() {
        // LABEL IMAGEN ENCABEZADO ----------------------------------------------------
        iDimAux = new ImageIcon(iSuperior.getImage().getScaledInstance(910, 230, Image.SCALE_AREA_AVERAGING));
        lSuperior = sObjGraficos.construirJLabel(
                null, 0, 0, 910, 230, iDimAux, null, null, null, "c"
        );
        pSuperior.add(lSuperior);

        // LABEL IMAGEN TETANEITOR ----------------------------------------------------
        iDimAux = new ImageIcon(iTetaneitor.getImage().getScaledInstance(250, 200, Image.SCALE_AREA_AVERAGING));
        lTetaneitor = sObjGraficos.construirJLabel(
                null, 0, 55, 250, 200, iDimAux, null, null, null, "c"
        );
        lTetaneitor.setBorder(sRecursos.getBordeVerde());
        pDerecha.add(lTetaneitor);
    }

    public void crearContenidoPAcciones() {
        // COMPONENTE ACCIÓN 1 -------------------------------------------------
        AccionTemplate p1 = new AccionComponent(
                1, "Ironside", 1, "Amon Amarth", "4:31",
                "resources/img/albums/amonAmarth.jpg"
        ).getAccionTemplate();
        p1.setLocation(2, 0);
        this.pIzquierda.add(p1);

        // COMPONENTE ACCIÓN 2 -------------------------------------------------
        AccionTemplate p2 = new AccionComponent(
                2, "Justicia Divina", 2, "Tears Of Misery", "3:28",
                "resources/img/albums/tearsOfMisery.jpg"
        ).getAccionTemplate();
        p2.setLocation(2, 55);
        this.pIzquierda.add(p2);

        // COMPONENTE ACCIÓN 3 -------------------------------------------------
        AccionTemplate p3 = new AccionComponent(
                1, "Heartwork", 3, "Carcass", "4:33",
                "resources/img/albums/carcass.jpg"
        ).getAccionTemplate();
        p3.setLocation(2, 110);
        this.pIzquierda.add(p3);

        // COMPONENTE ACCIÓN 4 -------------------------------------------------
        AccionTemplate p4 = new AccionComponent(
                2, "Entwined By Vengeance", 4, "Vital Remains", "9:58",
                "resources/img/albums/vitalRemains.jpg"
        ).getAccionTemplate();
        p4.setLocation(2, 165);
        this.pIzquierda.add(p4);

        // COMPONENTE ACCIÓN 5 -------------------------------------------------
        AccionTemplate p5 = new AccionComponent(
                1, "Amarok - Zorn des Lammes III", 5, "Nargaroth", "9:33",
                "resources/img/albums/nargaroth.jpg"
        ).getAccionTemplate();
        p5.setLocation(2, 220);
        this.pIzquierda.add(p5);
    }
}
