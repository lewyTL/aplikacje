package finanse;

public class Kwota {
    private Integer wartosc;

    public Kwota(int zlote, int grosze) throws IllegalArgumentException {
        if (zlote >= 0 && grosze >= 0) {
            wartosc = zlote * 100 + grosze;
        } else {
            throw new IllegalArgumentException("Podano niepoprawne (ujemne) dane!");
        }
    }

    public Kwota() {
        wartosc = 0;
    }

    public String toString() {
        Integer reszta = wartosc % 100;
        if (reszta > 9) {
            return wartosc / 100 + "," + wartosc % 100;
        } else {
            return wartosc / 100 + ",0" + wartosc % 100;
        }

    }

    public Kwota dodaj(Kwota kwota) {
        Kwota nowy = new Kwota();
        nowy.wartosc = this.wartosc + kwota.wartosc;
        return nowy;
    }

}