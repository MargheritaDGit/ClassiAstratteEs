// Scrivere un programma che contenga una classe astratta chiamata Forma
// ed un metodo astratto chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed
// implementano il metodo per il calcolo dell'area in maniera specifica.


public class Rettangolo extends Forma {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        double area = base * altezza;
        return area;

        }
    }


