package com.umut.onka


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class  TestActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.test)

        val btn_GonderTest2=findViewById<Button>(R.id.test2)
        btn_GonderTest2.setOnClickListener{
            val intent = Intent(this,test2::class.java)
            startActivity(intent)
        }

        val btn_GonderHome = findViewById<Button>(R.id.HomeBtn1)
        btn_GonderHome.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }
        //--------------------------------------------------------------------------//
        val btnAlert = findViewById<Button>(R.id.bir)
        btnAlert.setOnClickListener {
            val artDialogBuilder = AlertDialog.Builder(this@TestActivity)

            artDialogBuilder.setMessage(
                "* Bastırılmış : Baskıcı öğretmen portresi seçtiniz, Bilinçaltınızda bastırılmış saldırganlık ve alçaltıcı davranış eğilimi olabilir. Çocuklukta davranışlarınızda otoriterlik, yönetme ihtiyacı gibi eğilimleri tecrübe etmiş olabilirsiniz.\n" +
                        "\n" +
                        "* İnkar : Tamamen zararsız ve başkalarına yardım etmek için her zaman hazır olan barışçıl bir bireysiniz. İş hayatınızda amirleriniz sizi idare etmekte zorluk çekiyor olabilirler. Eğer bir şey yapmak istemiyorsanız, kendinize bariyerler inşa ediyorsunuz(örneğin işe geç gidiyorsunuz veya bütün gün asık suratla dolaşıyorsunuz). Sıklıkla, tartışmalarda veya ilişkilerde kendinizi savunurken pasif bir şekilde direniyor ve karşı koymaya devam ediyorsunuz.\n"
            )
            artDialogBuilder.setTitle("1)Sadist")
            artDialogBuilder.setCancelable(false)
            artDialogBuilder.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder.create()
            alertDialogBox.show()
        }
        //--------------------------------------------------------------------------//
        val btnAlert2 = findViewById<Button>(R.id.iki)
        btnAlert2.setOnClickListener {
            val artDialogBuilder2 = AlertDialog.Builder(this@TestActivity)

            artDialogBuilder2.setMessage(
                "* Bastırılmış : Yuvarlak kafaya sahip bu iri adam sizde tiksinti ve korkuya sebep olduysa, çocukluğunuzun erken aşamalarında bazı duygularınızı bastırmış olabilirsiniz. Asabiyet, düşünmeden hareket etme, sinir patlamaları gibi belirtilere aşina olma ihtimaliniz yüksek.\n" +
                        "\n" +
                        "* İnkar : Uysal ve dost canlısı olarak, sorumlu ve kendine hakim olabilen biri görünümü veriyorsunuz. Hislerinizde sabitsiniz. İnsanlarla, fikirlerle ve nesnelerle kolayca bağ kurabiliyorsunuz."
            )
            artDialogBuilder2.setTitle("2) Epileptik")
            artDialogBuilder2.setCancelable(false)
            artDialogBuilder2.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder2.create()
            alertDialogBox.show()
        }
        //--------------------------------------------------------------------------//
        val btnAlert3 = findViewById<Button>(R.id.uc)
        btnAlert3.setOnClickListener {
            val artDialogBuilder3 = AlertDialog.Builder(this@TestActivity)

            artDialogBuilder3.setMessage(
                "* Bastırılmış : Bu tip kişilikler genellikle aşırı hayal gücüne karamsar bir yapıya sahip. Eğer bu kirli görünümlü ama mutlu adam sizde olumsuz bir etki bıraktıysa, zihninizin hiper-aktif kısmını bastırmış olma ihtimaliniz var.\n" +
                        "\n" +
                        "\n" +
                        "* İnkar : Basmakalıp davranışlar edinme eğilimindesiniz. Yenilikler ve değişikliklerden hoşlanmıyorsunuz. Farklı konumlara adapte olmakta zorlanan çekingen ve utangaç bir kişiliğe sahip olabilirsiniz. En büyük korkunuz, kontrolünüzü kaybetmeniz."
            )
            artDialogBuilder3.setTitle("3) Katatonik")
            artDialogBuilder3.setCancelable(false)
            artDialogBuilder3.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder3.create()
            alertDialogBox.show()
        }
        //--------------------------------------------------------------------------//
        val btnAlert4 = findViewById<Button>(R.id.dort)
        btnAlert4.setOnClickListener {
            val artDialogBuilder4 = AlertDialog.Builder(this@TestActivity)

            artDialogBuilder4.setMessage(
                "* Bastırılmış : Şizofrenik kişilik yoğun umursamazlık, düşünce bozukluğu ve uyumsuz duygular olarak karakterize edilir. Eğer bu ruhsuz ve ifadesiz kadın portresi tüylerinizi ürperttiyse, çocukluğunuzda insanlara ilgisizlik, koşullardan ve olaylardan çabuk vazgeçme gibi duyguları bastırmış olmanız muhtemel.\n" +
                        "\n" +
                        "* İnkar : Oldukça sosyal bir insansınız. Hayattan sosyalleşerek, arkadaşlarınızla vakit geçirerek zevk alıyorsunuz. Sosyallik, toplumdan izole olmuş ve her zaman yalnızlık hissiyle yaşayan sizin için bir kılık. İlişkileriniz biraz yapay görünüyor olabilir. Bilincinizin derinliklerinde başkalarına ihtiyaç duymadığınızı ve onlarsız da yaşayabileceğinizi hissediyorsunuz."
            )
            artDialogBuilder4.setTitle("4) Şizofrenik:")
            artDialogBuilder4.setCancelable(false)
            artDialogBuilder4.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder4.create()
            alertDialogBox.show()
        }
        //--------------------------------------------------------------------------//
        val btnAlert5 = findViewById<Button>(R.id.bes)
        btnAlert5.setOnClickListener {
            val artDialogBuilder5 = AlertDialog.Builder(this@TestActivity)

            artDialogBuilder5.setMessage(
                "* Bastırılmış : Histerik insanların bazı özellikleri yapay, duygularında kararsız ve narsist olmalarıdır. Bu resmin sizi korkutma sebebi, dikkat çekme arzusunu ve beğenilmeye susamış olmayı bastırmış olmanızdan kaynaklanabilir.\n" +
                        "\n" +
                        "* İnkar : İçe kapanık, alçak gönüllü bir insan görüntüsü veriyorsunuz. Ancak, aslında insanları etkileme arzusu besliyor olabilirsiniz. Görünüşünüze ve davranışlarınıza özen gösteriyorsunuz. Örneğin sürekli şık giyinmeye çalışıyorsunuz, kıyafetlerinizi aksesuarlarla tamamlayarak insanların ilgisini çekmeye çalışıyorsunuz. *Bu tarz insanlar genellikle nadir veya abartılı bir uğraşı hobi olarak seçer."
            )
            artDialogBuilder5.setTitle("5) Histerik :")
            artDialogBuilder5.setCancelable(false)
            artDialogBuilder5.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder5.create()
            alertDialogBox.show()
        }
        //--------------------------------------------------------------------------//
        val btnAlert6 = findViewById<Button>(R.id.six)
        btnAlert6.setOnClickListener {
            val artDialogBuilder6 = AlertDialog.Builder(this@TestActivity)

            artDialogBuilder6.setMessage(
                "* Bastırılmış : Öz-saygı eksikliği, aşağılık ve suçluluk duygusu depresyonun ana semptomlarıdır. Bu zararsız görünümlü kadın sizde hoşnutsuzluk yarattıysa, zararsızlık sizin için nefretin ta kendisi ve bu öz-saygı eksikliği, aşağılık ve suçluluk duygusu gibi semptomları bastırdığınız görülüyor.\n" +
                        "\n" +
                        "* İnkar : İçi dışı bir ve kaygısız biri olabilirsiniz. Her zaman dinamiklik, özgüven, ve iyimserlik gösteriyorsunuz. Tabi bazen de keyfiniz kaçıyor, kronik depresyon ve melankoliye kapılabiliyorsunuz. Bu tür durumlarda şüpheci ve suratsız birine dönüşüyorsunuz. *Bu tarz kişilikler depresif eğilimlerini bastırmak için insanların derdini dinleyip çözümler üretmeyi kendine rol edinir."
            )
            artDialogBuilder6.setTitle("6) Depresif :")
            artDialogBuilder6.setCancelable(false)
            artDialogBuilder6.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder6.create()
            alertDialogBox.show()
        }

        //--------------------------------------------------------------------------//
        val btnAlert7 = findViewById<Button>(R.id.yedı)
        btnAlert7.setOnClickListener {
            val artDialogBuilder7 = AlertDialog.Builder(this@TestActivity)

            artDialogBuilder7.setMessage(
                "* Bastırılmış : Dışadönüklük, abartılı tepki ve duygu sergileme gibi özelliklere sahiptir. Eğer bu portredeki lütufkar yüz sizi tiksindiriyorsa, eğer kontrol edilmezse sizi çıldırtacak düzeye getirecek bastırılmış bir coşkuya sahipsiniz.\n" +
                        "\n" +
                        "* İnkar : Davranışlarıyla insanları sinirlendirmeyi sevmeyen birisiniz. Ayrıca gürültü ve aşırılıktan hoşlanmıyorsunuz. Dikkat, tedbir ve ölçü örneğisiniz. Mantıklı ve tutumlu olarak davranışlarınızı tamamen kontrol edebiliyorsunuz."
            )
            artDialogBuilder7.setTitle("7) Manyak :")
            artDialogBuilder7.setCancelable(false)
            artDialogBuilder7.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder7.create()
            alertDialogBox.show()
        }
        //--------------------------------------------------------------------------//
        val btnAlert8 = findViewById<Button>(R.id.sekiz)
        btnAlert8.setOnClickListener {
            val artDialogBuilder8 = AlertDialog.Builder(this@TestActivity)

            artDialogBuilder8.setMessage(
                "* Bastırılmış : Bu tür kişilik tipi \"kişinin başkası olarak yaşamak ve öyle kabul edilmek istemesi\" olarak açıklanır. Eğer bu genç adamı tehlikeli ve uygunsuz olarak algıladıysanız, çocukluğunuzun erken dönemlerinde kimlik sorunu yaşamış ve bunu bastırmış olabilirsiniz.\n\n" +
                        "* İnkar : Eğer inkar mekanizması çalışırsa, kendi kimliğinizi kabullenirsiniz. Bu durumda davranışlarınız ve görünümünüz kabullendiğiniz kimliğinizi abartacak dereceye gelir. Eğer erkekseniz sert ve maço bir tarz takınırken, eğer kadınsanız çekici görünmeye çalışıp sürekli karşı cinsle flört eden birine dönüşürsünüz."
            )
            artDialogBuilder8.setTitle("8) Kimlik Karmaşası :")
            artDialogBuilder8.setCancelable(false)
            artDialogBuilder8.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder8.create()
            alertDialogBox.show()
        }
            //--------------------------------------------------------------------------//




        }
    }



