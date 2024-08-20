package lvl11.objects;
import java.util.Calendar;

public class CorrectYeat {

        private int currentYear;

        public  CorrectYeat() {
            this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
        }

        public int getCurrentYear() {
            return currentYear;
        }

        public static void main(String[] args) {
            CorrectYeat CorrectYeat = new CorrectYeat();
            System.out.println(CorrectYeat.getCurrentYear());
        }


}
