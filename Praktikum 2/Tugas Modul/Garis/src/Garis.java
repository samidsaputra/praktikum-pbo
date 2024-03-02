class Titik {
    double x;
    double y;

    Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Garis {
    Titik titikAwal;
    Titik titikAkhir;

    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    Titik getTitikAwal() {
        return this.titikAwal;
    }

    void setTitikAwal(Titik titik) {
        this.titikAwal = titik;
    }

    Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    void setTitikAkhir(Titik titik) {
        this.titikAkhir = titik;
    }

    double getPanjang() {
        double dx = this.titikAkhir.x - this.titikAwal.x;
        double dy = this.titikAkhir.y - this.titikAwal.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    double getGradien() {
        double dx = this.titikAkhir.x - this.titikAwal.x;
        double dy = this.titikAkhir.y - this.titikAwal.y;
        if (dx == 0) {
            return Double.POSITIVE_INFINITY; // Garis vertikal, gradien tak terdefinisi
        } else {
            return dy / dx;
        }
    }

    Garis getRefleksiY() {
        return new Garis(new Titik(-this.titikAwal.x, this.titikAwal.y),
                new Titik(-this.titikAkhir.x, this.titikAkhir.y));
    }

    boolean isTegakLurus(Garis G) {
        double m1 = this.getGradien();
        double m2 = G.getGradien();
        if (m1 == 0 && m2 == Double.POSITIVE_INFINITY) {
            return true;
        } else if (m1 == Double.POSITIVE_INFINITY && m2 == 0) {
            return true;
        } else {
            return m1 * m2 == -1;
        }
    }
}