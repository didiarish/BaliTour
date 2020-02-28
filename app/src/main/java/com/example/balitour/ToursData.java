package com.example.balitour;

import java.util.ArrayList;

public class ToursData {
    private static String[] tourNames = {
            "Bukit Campuhan",
            "Garuda Wisnu Kencana (GWK)",
            "Pantai Pandawa",
            "Pantai Kuta",
            "Pantai Uluwatu",
            "Monkey Forest Ubud",
            "Desa Penglipuran",
            "Tanah Lot",
            "Pura Lempuyang",
            "Nusa Penida",
            "Nusa Lembongan"
    };

    private static String[] tourDetails = {
            "Wisata alam di Bali ini memang cukup viral di instragram akhir-akhir ini karena menyuguhkan pemandangan alam yang begitu mempesona. Perbukitan yang hijau dipenuhi dengan pepohonan tropis yang lengkap dengan area persawahan dan lembah. Karena tempatnya yang begitu romantis dan eksotis, Bukit ini juga dijuluki sebagai Bukit Cinta Campuhan.",
            "Garuda wisnu kencana atau GWK merupakan salah satu taman wisata budaya yang berada di Bali Selatan. Wisata ini memang cukup populer, terlebih saat ini pembangunan patung raksasai Garuda Wisnu Kencana sudah berhasil diselesaikan. Anda bisa menikmati kemegahan patung karya I Nyoman Nuarta yang juga ditemani dengan keindahan bukit-bukit kapur di sekitarnya. Dan tak hanya itu saja, di GWK terdapat teater seni yang dimana anda bisa melihat berbagai jenis kesenian dan tarian bali setiap harinya.",
            "Pantai berpasir putih ini cukup populer akhir-akhir ini karena menawarkan pemandangan yang begitu eksotis dan mempesona. Berada di Desa Kutuh, Kec. Kuta Selatan, Kab. Badung,pantai ini memiliki hamparan garis pantainya yang landai, bersih, serta bibir pantai yang agak luas, sehingga sangat cocok untuk dijadikan wisata bersama keluarga.",
            "Siapa yang tidak mengenal Pantai Kuta? Wisata pantai ini rasanya menjadi salah satu ikon wisata Pulau Dewata. Pesona dan keeksotisan di Pantai Kuta benar-benar tak bisa diragukan lagi. Sehingga tak heran jika setiap harinya pantai Kuta dipenuhi dengan wisatawan lokal maupun asing. Karena itu lah jika anda ingin mengunjungi pantai Kuta, maka anda bisa mencoba menggunakan sepeda motor atau berjalan kaki dari spot-spot tertentu karena memang kawasan ini cukup ramai. Ada banyak aktivitas menarik yang bisa anda lakukan selama berada di Pantai Kuta, mulai dari berjemur, bermain sepak bola pantai atau voli, berselancar, berjemur, dan masih banyak lainnya. pantai Kuta terbuka untuk umum dan pengunjung sama sekali tidak dikenakan tiket masuk.",
            "Pantai Uluwatu menjadi wisata selanjutnya yang wajib anda kunjungi saat berada di Pulau Bali. Meskipun lokasi pantai ini cukup tersembunyi, namun keindahan alam yang ada di dalamnya bak surge yang tersembunyi. Pantai yang dikenal dengan nama lain Blue Point ini mengharuskan pengunjung untuk menuruni beberapa anak tangga yang sempit untuk bisa sampai ke Pantai Uluwatu.",
            "Salah satu daya tarik yang ada di Monkey Forest Ubud adalah disini anda bisa langsung berinteraksi dengan kera ekor panjang yang memang menghuni kawasan wisata ini. Di kawasan ini, kera-kera memang hidup bebas. Warga setempat menganggap jika kera-kera tersebut adalah keramat yang tidak boleh diganggu. Sehingga anda benar-benar bisa merasakan suasana seperti menyatu dengan alam. Ditambah lagi dengan suasana alamnya yang sangat sejuk tentu akan sangat cocok bagi anda yang mencari tempat terbaik untuk refreshing sejenak. Namun karena banyaknya kera-kera yang menghuni tempat ini, jangan membawa barang-barang yang terlihat mencolok. Hal ini karena dapat mengundang kejahilan para kera yang tiba-tiba dapat mengambil barang-barang bawaan anda. untuk wisatawsan domestik, dikenakan biaya masuk sekitar Rp 30.000. anda bisa berkunjung ke wisata alam ini mulai dari 08.30 – 18.00 WITA.",
            "Jika anda sering melihat sinetron-sinetron di salah satu stasiun televisi, mungkin anda usdah tidak asing lagi dengan tampakan Desa Penglipuran. Desa asat di Bali ini menjadi salah satu destinasi wisata yang tidak boleh terlewatkan saat berlibur di Pulau Bali. Berada di desa Kubu, Kab. Bangli, desa penglipuran ini bertempat di ketinggian 700 mdpl. Sehingga bisa dibayangkan sendiri bagaiaman sejuknya udara saat anda masuk ke kawasan Desan penglipuran. Di desa Pengliperan, anda masih bisa melihat suasana adat Bali yang begitu kental. Anda bisa melihat tampakan rumah-rumah penduduk yang bentuknya hampir sama. Bahkan kemiripannya tersebut dapat dilihat pada bagian atap, dinding, hingga pintu rumah. keunikan dari Desa penglipuran bisa menjadi wisata menarik yang dapat anda kunjungi saat liburan.",
            "Siapa yang tidak mengenal dengan wisata Pura Tanah Lot? Wisata yang satu ini terkenal dengan keindahan pemandangannya, terutama menjelang matahari terbenam. Keunikan utama yang ada di wisata tanah lot ini adalah adanya pura yang berada di sebuah batu karang besar yang ada di pinggiran laut. Saat laut sedang pasang, maka anda tidak dapat mendekati pura karena kawasan di sekitar batu karang akan digenangi dengan air laut. Saat air surut, anda dapat melihat beberapa ular laut yang jinak. Konon warga setempat meyakini jika ular-ular ini merupakan penjaga pura Tanah Lot. Selain itu, di kawasan Tanah Lot anda juga bisa mencoba memegang ular suci yang sama sekali tidak berbahaya.",
            "Salah satu pura di Bali yang terkenal dikalangan wisatawan. Sudut khas di Pura Lempuyang yang unik banget adalah gerbang dengan pemandangan lepas. Jika anda berlibur ke Bali, Pura Lempuyang jadi salah satu tempat yang direkomendasikan untuk mengenal lebih jauh budaya Bali.",
            "Mencari surga tersembunyi di Bali? kunjungi saja Nusa Penida. Pulau kecil ini menyimpan banyak keindahan alam yang masih relatif belum banyak terjamah. Tidak seperti di Bali, keindahan pantai disini masih bersih, jauh dari hingar bingar pendatang.",
            "Nusa Lembongan adalah salah satu area wisata di Bali yang keren. Sepertinya, Nusa Lembongan lebih populer di  mata turis asing, karena mayoritas yang datang lebih banyak wisatawan manca negara. Tempat ini direkomendasikan jika anda mencari suasana yang sedikit berbeda dengan tempat wisata di Bali yang lainnya."
    };

    private static int[] toursImages = {
            R.drawable.campuhan,
            R.drawable.gwk,
            R.drawable.pandawa,
            R.drawable.kuta,
            R.drawable.uluwatu,
            R.drawable.monkey,
            R.drawable.penglipuran,
            R.drawable.tanahlot,
            R.drawable.lempuyang,
            R.drawable.penida,
            R.drawable.lembongan
    };

    static ArrayList<Tour> getListData() {
        ArrayList<Tour> list = new ArrayList<>();
        for (int position = 0; position < tourNames.length; position++) {
            Tour tour = new Tour();
            tour.setName(tourNames[position]);
            tour.setDetail(tourDetails[position]);
            tour.setPhoto(toursImages[position]);
            list.add(tour);
        }
        return list;
    }
}
