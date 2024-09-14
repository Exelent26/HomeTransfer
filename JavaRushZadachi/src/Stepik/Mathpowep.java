package Stepik;

public class Mathpowep {
    public static void main(String[] args) {
        double e = Math.E;
        double p = Math.PI;
        double pe = Math.pow(e, p);
        double ep = Math.pow(p, e);
        if (pe > ep) {
            System.out.println(">");
        } else if (pe < ep) {
            System.out.println("<");
        } else {
            System.out.println("=");

        }
    }
}

