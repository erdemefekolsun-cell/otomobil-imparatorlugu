# Telefona kurulabilir APK oluşturma

Bu proje Android WebView kabuğu içinde oyunun çevrimdışı HTML sürümünü çalıştırır.
Bu çalışma ortamında Android SDK/Gradle bulunmadığı için APK burada derlenemedi.
Projeye GitHub Actions üzerinden APK üreten bir iş akışı eklendi.

## APK alma (bilgisayar gerektirmeyen bulut derlemesi)

1. GitHub'da ücretsiz bir hesap açın veya hesabınıza giriş yapın: https://github.com
2. `New repository` ile yeni bir depo oluşturun. Public veya Private olabilir.
3. Bu ZIP'i açın ve içindeki `oto_tycoon_android` klasörünün **içeriğini** depoya yükleyin.
   `.github/workflows/build-apk.yml` dosyası da yüklenmiş olmalı.
4. GitHub deposunda **Actions** sekmesine girin.
5. `Build Android APK` iş akışını seçin ve **Run workflow** düğmesine basın.
6. İşlem yeşil tik ile tamamlanınca çalışmanın sayfasının altındaki **Artifacts** bölümünden
   `otomobil-imparatorlugu-debug-apk` dosyasını indirin.
7. İnen ZIP'i Android telefonda açın; içindeki `app-debug.apk` dosyasına dokunun.
8. Android izin isterse yalnızca kullandığınız dosya yöneticisi/tarayıcı için
   "Bu kaynaktan uygulama yükle" iznini açın. APK'yı kurduktan sonra bu izni kapatabilirsiniz.

## Önemli

- Bu, telefona kurulabilir **debug APK** üretir. Play Store'a yüklemek için uygun imzalı
  release/AAB paketi ve ayrı yayın hazırlığı gerekir.
- Debug APK Play Store uygulaması değildir; doğrudan telefona kurulur.
- APK'yı yalnızca kendi oluşturduğunuz ve güvendiğiniz derleme çıktısından yükleyin.
- Uygulama kimliği: `com.ankamotors.tycoon`
- Sürüm: `1.2.0`
