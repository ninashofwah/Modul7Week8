package soal2;

class Kendaraan { 
    Kendaraan() {
        System.out.println("constructor kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan { 
    Mobil() {
        super();
        System.out.println("constructor mobil dipanggil");
    }
}

public class Main {
    Mobil mobil = new Mobil();
}
