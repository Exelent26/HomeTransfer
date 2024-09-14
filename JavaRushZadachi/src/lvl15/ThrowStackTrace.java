package lvl15;

public class ThrowStackTrace {

        public static void main(String[] args) {
            try {
                dangerousMethod();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        static void dangerousMethod() throws Exception {
            throw new Exception("Mu-ha-ha!");
        }
    }


