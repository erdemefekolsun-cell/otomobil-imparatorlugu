# Otomobil İmparatorluğu — Android kaynak projesi (v1.2.0)

1930'dan başlayan, Türkçe, 2D otomobil şirketi ve motor mühendisliği yönetim oyunu. Oyun; Android WebView içinde çevrimdışı çalışacak şekilde hazırlanmıştır. Oyun motoru `app/src/main/assets/index.html` dosyasındadır.

## Bu sürümde

- 1930 yılında başlar; takvim günleriyle 1930'lardan günümüze ilerler.
- Kolay / Orta / Zor / Gerçekçi başlangıç ekonomisi.
- Zaman kontrolü: durdur, 1x, 5x, 10x ve manuel +1 gün.
- Başlangıç üretim lokasyonu için Türkiye şematik haritası: Ankara, Nevşehir, İzmir.
- Ek üretim bölgeleri seviye ile açılır: Bursa (5), Kocaeli (7), Eskişehir (9), Sakarya (11), Adana (13).
- Başlangıç motor hacmi 1.0 L; her şirket seviyesi yaklaşık 0.4 L ilave tasarım üst sınırı açar; 6.0 L'de tavan oluşur.
- Motor mühendisliği: silindir sayısı, bore, stroke, sıkıştırma oranı, hedef devir, benzin/dizel, oktan/setan, atmosferik/kompresör/turbo/çift turbo, basınç, yakıt sistemi, supap, eksantrik, blok malzemesi, soğutma ve motor hedefi.
- Hacim geometrik olarak bore/stroke/silindir sayısından hesaplanır. BMEP tabanlı tork, güç, ortalama piston hızı, özgül güç, tüketim kestirimi, vuruntu ve dayanıklılık puanı hesapları gösterilir.
- Motor tasarımından ayrı **Motor Prototipini Üret** aşaması; dinamometre, ısıl dayanım ve uzun ömür testleri.
- Araç prototipi, yol/fren/dayanıklılık/emisyon testleri, basın lansmanı, seri üretim ve stoktan satış.
- Gerçek tarihlerine göre pazara giren Türk otomotiv şirketleri/markaları: Türk Willys Overland, Otokar, BMC, Otosan/Anadol, Karsan, TOFAŞ, OYAK Renault, TEMSA ve TOGG. Oyundaki satış/rekabet katsayıları kurgu simülasyonudur.
- Ticari kredi, faiz, vade, aylık taksit, kredi limiti, kredi notu, gecikme, eksi hesap ve erken ödeme.
- Fabrika seviyesi, iş gücü, tedarik, Ar-Ge ve pazarlama yükseltmeleri.
- Otomatik yerel kayıt, JSON dışa/içe aktarma.

## Android uygulaması / APK üretimi

Bu klasör bir **Android Studio kaynak projesidir; içinde derlenmiş APK bulunmaz**. Bu çalışma ortamında Android SDK/Gradle kurulu olmadığı için APK burada derlenemedi.

APK oluşturmak için:

1. Android Studio'yu ve JDK 17'yi kur.
2. Android Studio SDK Manager'dan Android SDK Platform 35'i kur.
3. Bu klasörü Android Studio ile aç.
4. Gradle senkronizasyonunu yap (Android Gradle Plugin 8.7.3 / Gradle 8.9).
5. **Build → Build Bundle(s) / APK(s) → Build APK(s)** seç.
6. Debug APK normalde `app/build/outputs/apk/debug/app-debug.apk` konumunda oluşur.

Uygulamanın internet iznine ihtiyacı yoktur. Onay, uyarı ve kredi pencereleri Android yerel diyaloglarıyla gösterilir. Oyun WebView'in yerel depolamasını kullanır.

## Simülasyon doğruluğu notu

Bore/stroke hacmi ve ortalama piston hızı fiziksel geometrik formüllerle hesaplanır. BMEP, güç, tork, tüketim, vuruntu, dayanıklılık, üretim maliyeti, talep, rakip satışları ve finansman davranışı oyun amacıyla basitleştirilmiş tahmin modelleridir; gerçek motor geliştirme, emisyon onayı, finansal teklif veya homologasyon verisi değildir.

## Tarihsel not

Oyuncunun 1930'da kurduğu şirket kurgusaldır. Gerçek Türk otomotiv üreticileri oyunda tarihsel kuruluş/üretim dönemlerine göre görünür. Şirket adları ilgili hak sahiplerine aittir; oyun resmî veya lisanslı bir ürün değildir.


## APK oluşturma
Ayrıntılı, GitHub Actions ile bulutta APK alma adımları için `APK_OLUSTURMA_TR.md` dosyasına bakın.
