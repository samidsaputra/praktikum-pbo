package org.Main;
import org.Mobil.*;
import org.Motor.*;
import org.Truk.*;

public class MKendaraan {
    public static void main(String[] args) {
        org.kendaraan.Kendaraan kendaraan = new org.kendaraan.Kendaraan("Kendaraan Nathan");
        Mobil mobil = new Mobil("Bugatti Chiron", 2);
        Motor motor = new Motor("Ducati Panigale V4 R", 998);
        Truk truk = new Truk("Mercedes-Benz Actros", 20);

        kendaraan.klakson();
        mobil.klakson();
        motor.klakson();
        truk.klakson();
    }
}
