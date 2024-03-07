public class Primitive {
    public static void main(String[] arg) {
        int i = 259;
        byte b = (byte) i;

        System.out.println("Hasil = " + b);
    }
}

//Ketika nilai i = 259 dicasting ke byte,  nilai tersebut akan di-truncate (dipotong) ke dalam rentang yang valid untuk byte.
//Ketika mengkonversi 259 ke tipe data byte, nilainya lebih besar dari 127, sehingga hanya 8 bit terendah yang akan dipertahankan,
//dan sisanya akan diabaikan. Angka biner 259 adalah 00000001 00000011 dalam representasi biner 8-bit. Ketika memotongnya menjadi 8-bit,
//kita hanya menyisakan 00000011, yang dalam desimal adalah 3.