package aula04;

import java.awt.*;

public class ResoluçãoDaTela {
    public static void main(String[] args) {
        Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("--------------");
        System.out.println("Largura: " + d.width);
        System.out.println("Altura: " + d.height);
        System.out.println("--------------");

    }
}
