package finanse;

public class Kwota implements Comparable{
    private int zlote;
    private int grosze;

    public Kwota(int zlote, int grosze) {
        if(zlote < 0 || grosze < 0){
            throw new IllegalArgumentException();
        } else {
            if(grosze > 99){
                int ile = grosze/100;
                grosze = grosze - 100 * ile;
                zlote = zlote + 1 * ile;
            }
            this.zlote = zlote;
            this.grosze = grosze;
        }

    }

    public int getZlote(){
        return zlote;
    }

    public int getGrosze(){
        return grosze;
    }

    public Kwota() {
        grosze = 0;
        zlote = 0;
    }

    public String toString() {
        return zlote + " zł" + " " + grosze + " gr";

    }

    public Kwota dodaj(Kwota druga) {
        int zl = this.zlote + druga.zlote;
        int gr = this.grosze + druga.grosze;
        if(gr>99){
            zl++;
            gr = gr - 100;
        }
        return new Kwota(zl,gr);
    }

//    public boolean equals(Object obj){
//        Kwota k = (Kwota)obj;
//        return (this.grosze == k.grosze && this.zlote ==k.zlote);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kwota kwota = (Kwota) o;

        if (zlote != kwota.zlote) return false;
        return grosze == kwota.grosze;
    }

    public int compareTo(Object o) {
        Kwota k = (Kwota) o;
        int wartosc = zlote*100+grosze;
        int kwartosc = k.grosze+k.zlote*100;
        if(wartosc < kwartosc) return -1;
        if(wartosc == kwartosc) return 0;
        return 1;
    }
}