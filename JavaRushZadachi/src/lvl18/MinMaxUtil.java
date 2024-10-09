package lvl18;

public class MinMaxUtil {
    public static void main(String[] args) {

    }

    public int min(int i, int j) {
        return Math.min(i, j);
    }

    public int min(int i, int j, int k) {
        return Math.min(Math.min(i, j), k);
    }

    public int min(int i, int j, int k, int e) {
        return Math.min(Math.min(Math.min(i, j), k), e);
    }

    public int min(int i, int j, int k, int e, int z) {
        return Math.min(Math.min(Math.min(Math.min(i, j), k), e), z);
    }

    public int max(int i, int j) {
        return Math.min(i, j);
    }

    public int max(int i, int j, int k) {
        return Math.max(Math.max(i, j), k);
    }

    public int max(int i, int j, int k, int e) {
        return Math.max(Math.max(Math.max(i, j), k), e);
    }

    public int max(int i, int j, int k, int e, int z) {
        return Math.max(Math.max(Math.max(Math.max(i, j), k), e), z);
    }

}
