package raw;

import java.util.Scanner;


public class Docs {
    private SNILS snils;
    private Pasport pasport;

    public Docs() {
        snils = new SNILS();
        pasport = new Pasport();
    }

    public Docs(SNILS snils, Pasport pasport) {
        this.snils = snils;
        this.pasport = pasport;
    }

    public SNILS getSNILS() {
        return snils;
    }

    public Pasport getPasport() {
        return pasport;
    }

    public void Input() {
        SNILS snils = new SNILS();
        Pasport pasport = new Pasport();
        System.out.println("\tВвод документов");
        System.out.println("\tВвод СНИЛСА");
        snils.input();
        System.out.println("\tВвод паспорта");
        pasport.input();
        this.snils = snils;
        this.pasport = pasport;
    }
}