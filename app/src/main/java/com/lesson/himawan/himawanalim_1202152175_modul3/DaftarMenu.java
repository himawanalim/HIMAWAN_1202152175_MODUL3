package com.lesson.himawan.himawanalim_1202152175_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;

    public static ArrayList<MinumanItem> DATAS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        DATAS = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new MinumanAdapter(DATAS);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    public ArrayList<MinumanItem> isi(){
        ArrayList<MinumanItem> data = new ArrayList<>();
        data.add(new MinumanItem("Aqua","Ini adalah AMDK merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new MinumanItem("Amidis","Ini adalah AMDK merk AMIDIS"," berdiri pada tanggal 17 Juni 1997, berlokasi di Padalarang - Bandung, Jawa Barat, Indonesia. Pabrik AMIDIS berdiri diatas tanah seluas 15 hektar, dan mempunyai sekitar 100 karyawan.AMIDIS telah melebarkan pasarnya meliputi Jawa Barat, Jabotabek, Kalimantan Tengah, Semarang dan Surabaya; untuk mendukung layanan servis AMIDIS, kami telah menunjuk ",R.drawable.amidis));
        data.add(new MinumanItem("Cleo","Ini adalah AMDK merk CLEAO","Sariguna Primatirta Tbk (CLEO) didirikan tanggal 10 Maret 1988 dengan nama PT Sari Guna dan mulai beroperasi secara komersial pada tahun 2003. Kantor pusat CLEO berlokasi di Jln. Raya A. Yani 41-43, Kompleks Central Square Blok C-1 Gedangan, Sidoarjo 61254 – Indonesia.",R.drawable.cleo));
        data.add(new MinumanItem("Club","Ini adalah AMDK merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new MinumanItem("Equil","Ini adalah AMDK merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new MinumanItem("Evian","Ini adalah AMDK merk EVIAN","Air mineral kemasan memang banyak di pasaran, tapi yang mengambil pasar premium masih bisa dihitung dengan tangan. Beberapa air kemasan yang mengambil pasar premium diantaranya adalah Equil, Evian, dan beberapa waktu terakhir brand local Aqua juga meluncurkan versi kemasan premiumnya. Diantara brand tersebut, Evian adalah salah satu air kemasan tertua yang mungkin pernah ada, sejarahnya bermula dari tahun 1789 di Prancis.",R.drawable.evian));
        data.add(new MinumanItem("Le Minerale","Ini adalah AMDK merk LE MINERALE","Air mineral kemasan memang banyak di pasaran, tapi yang mengambil pasar premium masih bisa dihitung dengan tangan. Beberapa air kemasan yang mengambil pasar premium diantaranya adalah Equil, Evian, dan beberapa waktu terakhir brand local Aqua juga meluncurkan versi kemasan premiumnya. Diantara brand tersebut, Evian adalah salah satu air kemasan tertua yang mungkin pernah ada, sejarahnya bermula dari tahun 1789 di Prancis.",R.drawable.leminerale));
        data.add(new MinumanItem("Nestle","Ini adalah AMDK merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new MinumanItem("Pristine","Ini adalah AMDK merk PRISTINE"," didirikan di bulan Maret tahun 2000, dibawah PT. Sinar Mas Multiartha, salah satu grup investasi terbesar di Indonesia. Di tahun 2005, PT SUPER WAHANA TEHNO mulai melayani di industri yang berhubungan dengan kesehatan.\n",R.drawable.pristine));
        data.add(new MinumanItem("Vit","Ini adalah AMDK merk VIT","VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.",R.drawable.vit));
        return data;
    }
}
