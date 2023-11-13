public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo (6.0, 9.0);
        Forma triangolo = new Triangolo (7.0, 9.0);

        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
    }
}

