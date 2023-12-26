public class Faktur extends Barang{
    private String kodeBarang;
    private String namaPelanggan;
    private String nomorHpPelanggan;
    private String alamatPelanggan;

    public Faktur(String kodeBarang, String namaPelanggan, String nomorHpPelanggan, String alamatPelanggan ,String namaBarang, double hargaBarang, int jumlahBeli ){
        super(kodeBarang,namaBarang,  hargaBarang,jumlahBeli); //memanggil method barang dari kelas barang
        this.kodeBarang= kodeBarang;
        this.namaPelanggan =namaPelanggan;
        this.nomorHpPelanggan = nomorHpPelanggan;
        this.alamatPelanggan= alamatPelanggan;
    }

    @Override
    public double hitungTotalBayar(){
        return super.hitungTotalBayar();//memanggil method hitungTotalBayar dari kelas barang
    }

    @Override
    public String toString(){
        return "\nNama Pelanggan\t: " + namaPelanggan + "\n" + 
                "Nomor HP\t: " + nomorHpPelanggan + "\n"+ 
                "Alamat\t\t: " + alamatPelanggan + "\n"+
                "++++++++++++++++++++++++++++++++++++++++++++++"+"\n"+
                "DATA PEMBELIAN BARANG"+"\n"+
                "----------------------------------------------"+
                "\nKode Barang\t: "+kodeBarang+"\n"+
                super.toString();
    }

}
