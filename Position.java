public class Position {
    public static int position(int wiersz, int kolumna) {
        if (wiersz == 1 && kolumna == 1) {
            return 1;
        }
        if (wiersz == 1 && kolumna == 2) {
            return 2;
        }
        if (wiersz == 1 && kolumna == 3) {
            return 3;
        }
        if (wiersz == 2 && kolumna == 1) {
            return 4;
        }
        if (wiersz == 2 && kolumna == 2) {
            return 5;
        }
        if (wiersz == 2 && kolumna == 3) {
            return 6;
        }
        if (wiersz == 3 && kolumna == 1) {
            return 7;
        }
        if (wiersz == 3 && kolumna == 2) {
            return 8;
        }
        if (wiersz == 3 && kolumna == 3) {
            return 9;
        }
        return 0;
    }
}
