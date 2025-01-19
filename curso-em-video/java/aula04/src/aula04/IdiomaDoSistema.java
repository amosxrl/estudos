package aula04;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("Linguagem: " + locale.getDisplayLanguage());
    }
}
