public class denenme {

    public static void main(String[] args) {



        int[] sayilar = {1, 2, 3, 44, 33, 2, 33, 55, 66, 55,77,77,88,88};

        System.out.println("Tekrarlanan Elemanlar:");

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = i+1; j < sayilar.length; j++) {
                if (sayilar[i] == sayilar[j]) {
                    System.out.println(sayilar[i]);
                    break; // Sadece bir kere yazdırmak için
                }
            }
        }






    }}






































