package raw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Voen[] vn = new Voen[2];
        vn[0]=new Voen();
        vn[0].Input();
        vn[0].Print();
        vn[1]=new Voen();
        vn[1].Print();

        System.out.println("Категория: "+vn[0].Getkategor());
        int HoursComp = Counter.convert(vn[0].Getotsroch());
        System.out.println("Отсрочка: "+HoursComp);

        System.out.println("Количество Солдат: "+ Voen.getVoenCounter());
    }
}
