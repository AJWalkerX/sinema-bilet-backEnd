package com.ajwalker.utility.generateData;


import com.ajwalker.entity.Movie;
import com.ajwalker.entity.MovieGenres;
import com.ajwalker.entity.Seat;
import com.ajwalker.repository.MovieGenreRepository;
import com.ajwalker.repository.MovieRepository;
import com.ajwalker.repository.SeatRepository;
import com.ajwalker.service.SeatService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor

public class DataGenerator {

    private final SeatRepository seatRepository;
    private final MovieRepository movieRepository;
    private final MovieGenreRepository movieGenreRepository;

    @PostConstruct
    public void dataGenerator(){
        //seat
        if(seatRepository.findAll().isEmpty()){
            for(char i = 'a';i<'g';i++){
                for(int j=1;j<=14;j++){
                    Seat seat = Seat.builder()
                            .no(j)
                            .letter(String.valueOf(i))
                            .isFull(false)
                            .build();
                    seatRepository.save(seat);
                }
            }
        }
        //movie
        if (movieRepository.count() == 0) {
            Movie gladyator2 = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/46052/Kapak-69d3d502dcb8458ab65bd34396c455fd.jpg")
                    .description("Gladyatör 2, Lucilla'nın oğlu ve Commodus'un yeğeni Lucius'ın hayatına odaklanıyor. Gladiator 2, Ridley Scott tarafından yönetilen, yakında çıkacak epik bir tarihi dramadır. Gladyatör (2000) filminin devamı niteliğindeki filmin senaryosu David Scarpa tarafından yazılmıştır ve başrollerde Paul Mescal, Denzel Washington, Joseph Quinn, Fred Hechinger, Pedro Pascal, Connie Nielsen, Djimon Hounsou ve Derek Jacobi yer almaktadır. ")
                    .title("Gladyatör 2")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/gladyator-2-20241113144046c09c0a34acc34dbba257e687e2e14339.jpg")
                    .duration("160 dakika")
                    .releaseDate("15 Kasım 2024 Cuma")
                    .trailer("https://youtu.be/hl0mTNtItHU")
                    .rating("4,2")
                    .build();
            movieRepository.save(gladyator2);
            Movie vahsiRobot = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/48200/Kapak-cbbf7011f3cb4cd099b9cc6f47414f87.jpg")
                    .description("Animasyon film, ıssız bir adaya düşen ve zorlu çevre koşullarına uyum sağlamayı öğrenmesi gereken bir robotun -ROZZUM ünite 7134'ün, kısaca \"Roz\"un- yavaş yavaş adadaki hayvanlarla ilişki kurmasını ve yetim bir kaz yavrusunun evlat edinmesini konu alıyor.")
                    .title("Vahşi Robot")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/vahsi-robot-2024103142921a0ffea8bfcb342e0b193955e255132ec.png")
                    .duration("101 dakika")
                    .releaseDate("08 Kasım 2024 Cuma")
                    .rating("4,9")
                    .trailer("https://youtu.be/jKVCGMYpIpo")
                    .build();
            movieRepository.save(vahsiRobot);
            Movie cumhuriyetSarkisi = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/48651/Kapak-3270ba3742ac43c0b03f2e248ee6e7bd.jpg")
                    .description("Bir Cumhuriyet Şarkısı, 1930'lu yıllarda genç bir cumhuriyet olan Türkiye'nin girdiği modernleşme sürecini konu ediniyor.")
                    .title("Bir Cumhuriyet Şarkısı")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/bir-cumhuriyet-sarkisi-2024101512243900d7bc2545c24fff90a7b149a4d4515c.jpg")
                    .duration(" 127 dakika")
                    .releaseDate("25 Ekim 2024 Cuma")
                    .trailer("https://youtu.be/TQS2ewTGR34")
                    .rating("4,9")
                    .build();
            movieRepository.save(cumhuriyetSarkisi);
            Movie meclis = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/50064/Kapak-bceff7dacacb489aa9249d306533ad9c.jpg")
                    .description("Mahsun, Şahin ve Mehmet, kurdukları LMKP adlı siyasi partinin yanlışlıkla meclise girmesi sonucu kendilerini yepyeni ve fırsatlarla dolu bir dünyanın içinde bulurlar. Kaçak kumarhane işletmeciliği ile başlayan hikaye, meclise taşınır.\n")
                    .title("İllegal Hayatlar: Meclis")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/illegal-hayatlar-meclis-20241023152858df83c1bb7b1444d5807b348eab5878bf.jpg")
                    .duration("115 dakika")
                    .releaseDate("01 Kasım 2024 Cuma")
                    .trailer("https://youtu.be/LcD3albt0Bk")
                    .rating("4")
                    .build();
            movieRepository.save(meclis);
            Movie siyahKanarya = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/50956/Kapak-fa1317d3859a4f529c6ca5db279918b2.jpg")
                    .description("Siyah Kanarya, ölümcül bir komploya kurban gitmiş ve kocasını kurtarmak zorunda kalan bir CIA ajanı olan Avery Graves’in hikâyesini anlatıyor.\n" +
                            "\n" +
                            "CIA'in en yetenekli ajanlarından Avery Graves, teröristler tarafından kaçırılan kocasını kurtarmak için kendi ülkesine ihanet etmek zorunda kalır. Takımından koparıldıktan sonra, hayatta kalmak ve kocasını kaçıranların istediği değerli istihbaratı bulmak için yeraltı dünyasındaki bağlantılarından yardım alır. Her adımda ihanet edilirken, küresel bir krize yol açabilecek bir fidye teslim etmek için ölümcül bir yarışta keskin eğitim ve vahşi dövüş becerilerine güvenmek zorundadır.")
                    .title("Siyah Kanarya")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/siyah-kanarya-2024111414245316947b81fe20494c8f01dd26cb2c7514.jpg")
                    .duration("101 dakika")
                    .releaseDate("22 Kasım 2024 Cuma")
                    .trailer("https://youtu.be/aNFjcrKhT0s")
                    .rating("4,7")
                    .build();
            movieRepository.save(siyahKanarya);
            Movie genisAile = Movie.builder()
                    .imageUrl("")
                    .description("Yolları ayrılan Ulvi ve Cevahir'i yine Ulvi'nin başına gelen bir olay bir araya getirecektir. Kasaplık mesleğine atılan ama büyükbaş yerine köyün ileri gelenlerini doğrayan Ulvi’nin karıştığı cinayeti Cevahir çözmeye çalışır.")
                    .title("Geniş Aile 4: Cevahir & Ulvi")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/genis-aile-4-cevahir-ulvi-20241114148345053ee2daa4544fa91bfff81a2bad35d.jpg")
                    .duration("90 dakika")
                    .releaseDate("22 Kasım 2024 Cuma")
                    .trailer("https://youtu.be/8ikatmvuDe0")
                    .rating("4,5")
                    .build();
            movieRepository.save(genisAile);
            Movie venom = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/47129/Kapak-0c52d2895b584004913fec3b348ef21a.jpg")
                    .description("Eddie Brock/Venom üçlemesinin final filmi Venom: Son Dans'ta, artık tek vücutta yaşamaya alışmış Eddie Brock ile Venom'u bu kez kendi dünyaları tarafından aranan birer kaçak olarak izleyeceğiz.")
                    .title("Venom: Son Dans")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/venom-son-dans-20249416241257c2bd4dd2543118e6ddef78df59cac.jpg")
                    .duration("112 dakika")
                    .releaseDate("12 Kasım 2024 Salı")
                    .trailer("https://youtu.be/73rkDFXBIZA")
                    .rating("4,2")
                    .build();
            movieRepository.save(venom);
            Movie kurt = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/12495/Kapak-9b620a429db4492391d4df9be639faf0.jpg")
                    .description("Kurt sürüsü tarafından dışlanan Freddy, gerçek bir kurt olduğunu kanıtlamak için kayıp Moonstone'u bulmaya karar verir. Sokak köpeği Batty ile beklenmedik bir dostluk kuran Freddy, sürüsünü kurtarmak için elinden geleni yapar. %100 kurt olmasa da, her zaman %100 kahramandır.")
                    .title("%100 Kurt")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/100-kurt-202411141334544b1af1c97efa48ffb19793f21a3bbbe1.jpg")
                    .duration("96 dakika")
                    .releaseDate("22 Kasım 2024 Cuma")
                    .trailer("https://youtu.be/wSESQeofX9I")
                    .rating("3")
                    .build();
            movieRepository.save(kurt);
            Movie cille2069 = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/47190/Kapak-9ff8d9420f164fbdb1040c9d552b5d41.jpg")
                    .description("Cille 2069 çizgi dizisinin son bölümünde Kayra; Rehzen'e tacı devrettikten 15 sene sonra denizlerden gelen bir kavim İnsanların ve Ezakilerin Dünyasına teknoloji getirmiştir. İnsanları ve Ezakileri teknolojiye bağımlı kıldıktan sonra karşılığını almak isteyen kavim, tüm Cilleleri teslim alacağı son bir şölen tertip eder. Nükleer savaştan sonra enerji kaynakları tükenmiş Dünya'nın son umudu olan Cilleleri kaybetmemek için Kayra ve arkadaşları, 2069 yılında bu kavme karşı büyük bir savaş vermek zorundadır.")
                    .title("Cille 2069")
                    .thumbnail("11 Ekim 2024 Cuma")
                    .duration("77 dakika")
                    .releaseDate("")
                    .trailer("https://youtu.be/8EEAA8SwSrc")
                    .rating("4,4")
                    .build();
            movieRepository.save(cille2069);
            Movie terrifier3 = Movie.builder()
                    .imageUrl("https://b6s54eznn8xq.merlincdn.net/Uploads/ImageEntries/Event/46910/Kapak-9c61b4561f964ccb8a43e4e2383de4c0.jpg")
                    .description("Terrifier 3, Noel arifesinde huzur içinde uykuya dalan Miles County'nin hiçbir şeyden haberi olmayan sakinlerinin başına gelenleri konu ediyor. Miles Kasabası sakinleri Noel ruhuyla yılın en huzurlu gecesini kutlamaya hazırlanırken, Art the Clown geri dönüyor. Sessiz ve karanlık bir Noel Arifesi, Art’ın kana susamışlığıyla kabusa dönüşüyor. Yeni hedefler ve daha acımasız planlarla geri dönen Art, kasabayı cehenneme çevirmek için yemin ediyor.")
                    .title("Terrifier 3")
                    .thumbnail("https://b6s54eznn8xq.merlincdn.net/Uploads/Films/terrifier-3-2024111414132272a34d8d2e29406b8c6ffc23a344587a.jpg")
                    .duration("128 dakika")
                    .releaseDate("22 Kasım 2024 Cuma")
                    .trailer("https://youtu.be/Ez01aT7HWws")
                    .rating("3")
                    .build();
            movieRepository.save(terrifier3);
        }
        //movieGenres
        if (movieGenreRepository.count() == 0) {
            MovieGenres gladyetor2genre1 = MovieGenres.builder()
                    .movieId(1L)
                    .genre("Aksiyon")
                    .build();
            MovieGenres gladyetor2genre2 = MovieGenres.builder()
                    .movieId(1L)
                    .genre("Dram")
                    .build();
            MovieGenres gladyetor2genre3 = MovieGenres.builder()
                    .movieId(1L)
                    .genre("Macera")
                    .build();
//
            MovieGenres robotGenre1 = MovieGenres.builder()
                    .movieId(2L)
                    .genre("Animasyon")
                    .build();
            MovieGenres robotGenre2 = MovieGenres.builder()
                    .movieId(2L)
                    .genre("Bilim Kurgu")
                    .build();
            MovieGenres robotGenre3 = MovieGenres.builder()
                    .movieId(2L)
                    .genre("Aile")
                    .build();
//
            MovieGenres cumhuriyetSarkisiGenre1 = MovieGenres.builder()
                    .movieId(3L)
                    .genre("Dram")
                    .build();
            MovieGenres cumhuriyetSarkisiGenre2 = MovieGenres.builder()
                    .movieId(3L)
                    .genre("Tarih")
                    .build();
//
            MovieGenres meclisGenre1 = MovieGenres.builder()
                    .movieId(4L)
                    .genre("Komedi")
                    .build();
//
            MovieGenres siyahKanaryaGenre1 = MovieGenres.builder()
                    .movieId(5L)
                    .genre("Aksiyon")
                    .build();
            MovieGenres siyahKanaryaGenre2 = MovieGenres.builder()
                    .movieId(5L)
                    .genre("Dram")
                    .build();
//
            MovieGenres genisAlie4Genre1 = MovieGenres.builder()
                    .movieId(6L)
                    .genre("Aksiyon")
                    .build();
            MovieGenres genisAlie4Genre2 = MovieGenres.builder()
                    .movieId(6L)
                    .genre("Komedi")
                    .build();
//
            MovieGenres venomGenre1 = MovieGenres.builder()
                    .movieId(7L)
                    .genre("Aksiyon")
                    .build();
            MovieGenres venomGenre2 = MovieGenres.builder()
                    .movieId(7L)
                    .genre("Macera")
                    .build();
            MovieGenres venomGenre3 = MovieGenres.builder()
                    .movieId(7L)
                    .genre("Bilim Kurgu")
                    .build();
//
            MovieGenres kurtGenre1 = MovieGenres.builder()
                    .movieId(8L)
                    .genre("Animasyon")
                    .build();
//
            MovieGenres cille2069Genre1 = MovieGenres.builder()
                    .movieId(9L)
                    .genre("Animasyon")
                    .build();
//
            MovieGenres terrifier3genre1 = MovieGenres.builder()
                    .movieId(10L)
                    .genre("Korku")
                    .build();

            movieGenreRepository.saveAll(List.of(gladyetor2genre1,gladyetor2genre2,gladyetor2genre3,robotGenre1,robotGenre2,robotGenre3,
                    cumhuriyetSarkisiGenre1,cumhuriyetSarkisiGenre2,meclisGenre1,siyahKanaryaGenre1,siyahKanaryaGenre2
                    ,genisAlie4Genre1,genisAlie4Genre2,venomGenre1,venomGenre2,venomGenre3,kurtGenre1,cille2069Genre1, terrifier3genre1));
        }
    }

}
