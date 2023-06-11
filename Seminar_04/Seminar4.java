package Seminar_04;

public class Seminar4 {
    public static void main(String[] args) {
        Mapa<String, String> mapa = new Mapa<>();
        for (int i = 0; i < 15; i++) {
            mapa.put(Integer.toString(i + 10), Integer.toString(i));
        }
        System.out.println("size = " + mapa.size());
        System.out.println("containsKey 2 = " + mapa.containsKey("2"));
        System.out.println("containsValue fsdfd = " + mapa.containsValue("fsdfd"));
    }
}