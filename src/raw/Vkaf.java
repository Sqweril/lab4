package raw;

import java.util.Scanner;

// Framework: N/A
// Technology stack: N/A


public class Vkaf {
    private final Vus vus;
    private final PersData persdata;
    private int exp;

    public Vkaf() {
        vus = new Vus();
        persdata = new PersData();
        exp = 0;
    }

    public Vkaf(Vus vus, PersData persdata, int exp) {
        this.vus = vus;
        this.persdata = persdata;
        this.exp = exp;
    }

    public Vus Getvus() {
        return vus;
    }

    public PersData Getpersdata() {
        return persdata;
    }

    public int Getexp() {
        return exp;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВвод данных от воен. уч. стола");
        vus.Input();
        persdata.input();
        System.out.println("Введите сколько отслужил на военной кафедре: ");
        exp = scanner.nextInt();
        if (!CheckArguments(vus, persdata, exp)) {
            throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }

    private boolean CheckArguments(Vus vus, PersData persdata, int exp) {
        return exp > 0;
    }
}