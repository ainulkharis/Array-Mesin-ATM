public class KartuATM {

    public String nomer;
    public String norek;
    public String nama;
    public String nama_bank;
    private int saldo;

    public KartuATM() {

    }

    public KartuATM(String no, String nor, String nm) {
        this.nomer = no;
        this.norek = nor;
        this.nama = nm;
        this.saldo = 0;
    }

    public int Deposit (int jumlah) {
        saldo = saldo + jumlah;
        return saldo;
    }

    public int Withdraw(int jumlah) {
        saldo = saldo + jumlah;
        return saldo;
    }
    
}
