package com.umut.onka

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class test3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_test3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
       }
        val btn_GonderHome = findViewById<Button>(R.id.AnaBtn)
        btn_GonderHome.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }
        //**********************************************************************************//
        val btnAlert = findViewById<Button>(R.id.hayvan1)
        btnAlert.setOnClickListener {
            val artDialogBuilder = AlertDialog.Builder(this@test3)

            artDialogBuilder.setMessage(
        " Bir duvar örerek kendini dış dünyadan koruma altına aldığın bir gerçek. İnsanlar seni biraz mesafeli ve soğuk olarak algılasa da, aslında senin içinde bir sevgi kelebeği uçuşuyor. Ancak bu sevgi kelebeğini sadece hak ettiğini düşündüğün kişilere gösteriyorsun. Son zamanlarda tek ihtiyacın olan şey, hayatının renkli ve eğlenceli bir aşkla dolup taşması. Sevmek ve sevilmek, senin yaralarını saracak en güzel ilaç. Bu yüzden, belki de şu anda en çok ihtiyaç duyduğun şey, kalbinin derinliklerinde sakladığın bu sevgi kelebeğini serbest bırakmak ve hayatını paylaşabileceğin bir aşkla hayatına yeni bir renk katmak."
            )
            artDialogBuilder.setTitle(" Köpek :")

            artDialogBuilder.setCancelable(false)
            artDialogBuilder.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder.create()
            alertDialogBox.show()}
        //*****************************************************************************//
        val btnAlert2 = findViewById<Button>(R.id.hayvan2)
        btnAlert2.setOnClickListener {
            val artDialogBuilder2 = AlertDialog.Builder(this@test3)

            artDialogBuilder2.setMessage(
                "Hayatının her anında sevdiklerine olan sadakatin ve bağlılığınla ön plana çıkıyorsun. Adeta bu özelliğinle etrafındakilere ışık saçıyorsun. Seninle birlikte olan herkes, bu eşsiz bağlılığını ve sadakatini hissedebiliyor. Bir diğer dikkat çekici özelliğin ise hızlı ve tutkulu yapın. Seninle aynı hızda ilerlemek herkesin harcı değil! Bu hızınla birlikte tutkunu da yanında taşıyor, her ne yapıyorsan ona tüm kalbinle sarılıyorsun. İnsanlarla kişisel bağ kurmak konusunda ise adeta bir usta olduğunu söyleyebiliriz. Kimi insanlar için bu durum zorlu bir süreç olsa da, senin için bu durum çocuk oyuncağı. Bu yeteneğinle etrafındakileri kolaylıkla etkileyebiliyorsun. Ancak, her ne kadar dışarıdan güçlü bir duruş sergileyen biri gibi görünsen de, zaaflarını saklamayı çok iyi biliyorsun. Bu, senin en büyük sırlarından biri. Dışarıdan bakıldığında her zaman güçlü ve kararlı biri olarak görünmek, senin için son derece önemli. Bu duruşunla etrafındakilere güven veriyor, onların da senin gibi güçlü olmaları için ilham kaynağı oluyorsun."
            )
            artDialogBuilder2.setTitle(" Kurt :")

            artDialogBuilder2.setCancelable(false)
            artDialogBuilder2.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder2.create()
            alertDialogBox.show()}
        //*****************************************************************************//
        val btnAlert3 = findViewById<Button>(R.id.hayvan3)
        btnAlert3.setOnClickListener {
            val artDialogBuilder3 = AlertDialog.Builder(this@test3)

            artDialogBuilder3.setMessage(
                " Hayatının her döneminde karşılaştığın zorluklarla cesurca yüzleşen, her türlü engeli aşmak için çabalayan bir insansın. Her adımında ayaklarını yere sağlam basmaya çalışsan da, seni yakından tanıyanlar, senin bu hayatta ne tür yaralar aldığını çok iyi biliyorlar. Ancak, bu yaraların seni daha da güçlü bir birey haline getirdiğini çoğu kişi gözden kaçırıyor. Belki de sen bile henüz tam olarak farkında değilsin, ama senin içinde inanılmaz bir güç yatıyor. Bu güç, belki de hayatının zorlu dönemlerinde karşılaştığın engellerle sınanmış ve bu süreçte daha da güçlenmiş. Bu güç, belki de her düştüğünde yeniden ayağa kalkmanı sağlayan, her zorlukla baş etmende seni yönlendiren bir güç. Her ne kadar hayatın zorlukları seni yıpratmış gibi görünse de, aslında her biri senin içindeki bu gücü daha da ortaya çıkarıyor. Belki de bu yüzden, hayatın zorluklarına rağmen, her zaman dimdik ayakta durmayı başarıyorsun. Ve belki de bu yüzden, seni tanıyanlar, senin bu hayatta ne kadar güçlü bir insan olduğunu anlamaya başlıyorlar. Sonuçta, hayatın zorluklarına rağmen, senin içindeki bu gücü keşfetmek ve onu kullanmak senin elinde. Ve unutma, senin bu gücün farkına varman, hayatının geri kalanını daha da güçlü ve kararlı bir şekilde yaşaman için belki de en önemli adım olacak."
            )
            artDialogBuilder3.setTitle(" Kaplan:")

            artDialogBuilder3.setCancelable(false)
            artDialogBuilder3.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder3.create()
            alertDialogBox.show()}
        //*****************************************************************************//
        val btnAlert4 = findViewById<Button>(R.id.hayvan4)
        btnAlert4.setOnClickListener {
            val artDialogBuilder4 = AlertDialog.Builder(this@test3)

            artDialogBuilder4.setMessage(
                " Eski Mısırlıların gizemli dünyasında yılanlar, bilgeliğin ve krallığın koruyucusu olarak kabul edilmiştir. Belki de pek çoğumuzun korkulu rüyası olan bu sürüngenler, Mısırlılar için oldukça değerli ve kutsaldı. Yılanlar, sevilmeyen, hatta korkulan varlıklar olabilirler. Ancak onların gizemli güçleri ve eşsiz derileri, onları paha biçilemez kılar.  Son zamanlarda belki de kendinizi biraz düşkün hissediyorsunuz. Belki de kendi gücünüzden şüphe eder oldunuz. Ancak unutmayın, her zorlukla başa çıkmak, her engeli aşmak, aslında içimizdeki o muazzam gücü keşfetmek için bir fırsattır. İçinizdeki o korkusuz kobra, sizi bekliyor. Kendinizi keşfedin, kendinizin muhafızı olun. Kendi krallığınızın koruyucusu olun. Unutmayın, her birimiz aslında kendi hayatının kralı veya kraliçesiyiz. İçinizdeki bilgeliği keşfedin. İçinizdeki o korkusuz kobra, sizi bekliyor!"
            )
            artDialogBuilder4.setTitle(" Kobra:")

            artDialogBuilder4.setCancelable(false)
            artDialogBuilder4.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder4.create()
            alertDialogBox.show()}
        //*****************************************************************************//
        val btnAlert5 = findViewById<Button>(R.id.hayvan5)
        btnAlert5.setOnClickListener {
            val artDialogBuilder5 = AlertDialog.Builder(this@test3)

            artDialogBuilder5.setMessage(
                " Hayatın her anında, girdiğin her mekanda, senin gözlerin her zaman bir adım önde. İçten içe gözlemliyorsun, detayları yakalıyorsun ve her bir detaydan yeni bir bilgi ediniyorsun. Bir baykuş misali, sessizce izliyor ve öğreniyorsun. Baykuşlar, geleneksel olarak bilgelikle ilişkilendirilirler, ancak onların bu özelliği sadece bilgi toplamaktan ibaret değildir. Aynı zamanda, baykuşlar iç benliğimizi, ruhumuzun derinliklerini temsil ederler. Dışarıdan bakıldığında, seni görenler genellikle enerjik, partilemeyi seven ve hayatı dolu dolu yaşayan biri olarak algılarlar. Ancak bu, senin dış yüzün. İçinde bulunduğun kalabalığın içinde bile, senin asıl odak noktan, içindeki sakin ve bilge kişi. Bu kişi, her ne kadar dışarıdan görünmese de, senin hareketlerini, kararlarını ve yaşam tarzını belirleyen asıl güç. İşte bu yüzden, seni tanıyanlar seni hovarda bir tip olarak değil, aslında oldukça dingin ve bilge bir insan olarak tanımlarlar."
            )
            artDialogBuilder5.setTitle("Baykuş:")

            artDialogBuilder5.setCancelable(false)
            artDialogBuilder5.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder5.create()
            alertDialogBox.show()}
        //*****************************************************************************//
        val btnAlert6 = findViewById<Button>(R.id.hayvan6)
        btnAlert6.setOnClickListener {
            val artDialogBuilder6 = AlertDialog.Builder(this@test3)

            artDialogBuilder6.setMessage(
                "İçinde, kontrol etmeye çalıştığın öfkeli bir aslanın varlığını hissediyor musun? Aslanlar, güçlerinin ve tehlikeli doğalarının yanı sıra, düşmanlarına korku salan gürleyen kükremeleriyle tanınırlar. Bu kükreme, içindeki öfkenin sesi olabilir. Ancak unutma, aslanlar aynı zamanda asaletin ve kontrollü gücün sembolüdürler. Öfke, elimizde sıkıca tuttuğumuz kızgın bir taşa benzer. Onu ne kadar uzun süre taşırsak, kendimize o kadar fazla zarar veririz.  Aslanlar, doğaları gereği öfkeli ve saldırgan olabilirler, ancak aynı zamanda sakinlik ve asaletle de bilinirler. İçindeki aslanı sakinleştirmek, öfkenin getireceği zararları en aza indirirken, aynı zamanda asil ve kontrollü bir güç oluşturmanı sağlar. Bu, öfkenin kontrol altına alınması ve olumlu bir şekilde yönlendirilmesi anlamına gelir. Sonuç olarak, içindeki aslanı sakinleştirmek, öfkeni kontrol altına almanın ve onu olumlu bir güce dönüştürmenin anahtarıdır. Bu, sadece kendine değil, çevrene de fayda sağlar"
            )
            artDialogBuilder6.setTitle("Aslan:")

            artDialogBuilder6.setCancelable(false)
            artDialogBuilder6.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder6.create()
            alertDialogBox.show()}
        //*****************************************************************************//
        val btnAlert7 = findViewById<Button>(R.id.hayvan7)
        btnAlert7.setOnClickListener {
            val artDialogBuilder7= AlertDialog.Builder(this@test3)

            artDialogBuilder7.setMessage(
                "Her zaman etrafında dönen olayların tamamen farkındasın, ancak bunu hiçbir zaman dışa vurmayı seçmiyorsun. Gecenin en koyu anında bile, yarasaların kusursuz bir şekilde uçabildiğini biliyoruz, değil mi? İşte senin de durumun tam olarak bu. Sen, etrafında olup biten her şeyi gözlemliyorsun, her detayı kaçırmadan, her hareketi dikkatle izliyorsun. Ancak bu bilgileri saklı tutmayı, kendi içinde muhafaza etmeyi tercih ediyorsun. Bazıları belki de bu durumu anlamakta zorlanabilir. Ancak senin bu tutumunun altında yatan sebep oldukça açık: İnsanlara hep bir şans daha vermeyi seviyorsun. Evet, belki hatalar yapıyorlar, belki de senin gözlerinin gördüğü detayları göz ardı ediyorlar. Ancak sen, herkesin hata yapabileceğini, herkesin bir şansı hak ettiğini düşünüyorsun. Bu yüzden, her şeyi gözlemlemene rağmen, insanları hatalarıyla kabul ediyor ve onlara bir şans daha vermeyi tercih ediyorsun. İşte bu yüzden sen, yarasalar gibi karanlıkta bile uçabilen biri olarak karşımızda duruyorsun."
            )
            artDialogBuilder7.setTitle("Yarasa:")

            artDialogBuilder7.setCancelable(false)
            artDialogBuilder7.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder7.create()
            alertDialogBox.show()}
    }
}