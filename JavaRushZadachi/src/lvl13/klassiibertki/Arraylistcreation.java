package lvl13.klassiibertki;


public class Arraylistcreation {
    public static void main(String[] args) {

        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }
}
