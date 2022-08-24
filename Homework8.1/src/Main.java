public class Main {
    public static void main(String[] args) {
        int a = 3, b = 4;
        int tulos = 0;
        int aikaisempi = 1;

        for (int i = 0; i < a; i = i + 1)
        {
            tulos = aikaisempi * b;
            aikaisempi = tulos;
        }
        System.out.println(tulos);
    }
}
