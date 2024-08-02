package lvl10;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenizator {

        public static void main(String[] args) {
            String packagePath = "java.util.stream";
            String[] tokens = getTokens(packagePath, "\\.");
            System.out.println(Arrays.toString(tokens));
        }

        public static String[] getTokens(String query, String delimiter) {
            StringTokenizer x = new StringTokenizer(query,delimiter);
            String[] e = new String[x.countTokens ()];
            int i = 0;
            while (x.hasMoreTokens()){

                e[i] = x.nextToken();
                i++;
            }

            return e;
        }
}
