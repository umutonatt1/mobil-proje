package com.umut.onka

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class test2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_test2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_GonderTest2=findViewById<Button>(R.id.test3)
        btn_GonderTest2.setOnClickListener{
            val intent = Intent(this,test3::class.java)
            startActivity(intent)
        }

        val btn_GonderHome = findViewById<Button>(R.id.HomeButton)
        btn_GonderHome.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent) }



        val btnAlert = findViewById<Button>(R.id.kapi1)
        btnAlert.setOnClickListener {
            val artDialogBuilder = AlertDialog.Builder(this@test2)

            artDialogBuilder.setMessage(
               "Seçim numarası 1:\n" +
                       "Özgürlük yolu\n" +
                       "Eğer bu yolu seçtiysen, sen geniş alana ihtiyaç duyan bir kişisin. İşleri kendi yöntemlerine göre yapma imkânına sahip olmayı seversin. Kendi açtığın bir yolu tercih edersin, belirlenmiş bir yolu değil. İdeal yolun: çok sayıda yolu olan, sonsuz olasılıklarla dolu, deniz gibi bir yol çünkü kendini kapana kısılmış veya sınırlı hissetmeyi sevmezsin. Bağımsızsın, biraz isyankarsın, ancak çatışmadan hoşlanmazsın. Acele etmeyi sevmezsin çünkü hayatın tadını çıkarmak istersin. Hayata o kadar dalmışsındır ki bazen kendini ihmal edersin."
            )
            artDialogBuilder.setTitle(" Özgürlük yolu")

            artDialogBuilder.setCancelable(false)
            artDialogBuilder.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder.create()
            alertDialogBox.show()
        }
        //************************************************************************// //************************************************************************//
        val btnAlert2 = findViewById<Button>(R.id.kapi2)
        btnAlert2.setOnClickListener {
            val artDialogBuilder2 = AlertDialog.Builder(this@test2)

            artDialogBuilder2.setMessage("Seçim numarası 2:\n" +
                    "Özel yol\n" +
                    "Eğer bu yolu seçtiysen, muhtemelen yalnız seyahat etmeyi seven bir kişisin. Gözlem yapmayı, düşünmeyi ve karşına çıkan küçük gizemleri çözmeyi çok seversin. İdeal yolun dar ve tek bir kişi için mükemmeldir. Varış noktasına ulaştığında diğer insanlarla buluşmaktan mutluluk duyarsın, çünkü aslında tam anlamıyla yalnız biri değilsin, ama bazı maceraların tadını tek başına çıkarmayı seversin. Orijinal ve ilham verici bir kişisin, dünyaya başka hiç kimsenin bakmadığı şekilde bakarsın ve bu yüzden insanlar tavsiyelerini sever. Ayrıca çok anlayışlısın!"
            )
            artDialogBuilder2.setTitle(" Özel Yol")
            artDialogBuilder2.setCancelable(false)
            artDialogBuilder2.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder2.create()
            alertDialogBox.show()
        }
//***********************************************************************************************************************************//

        val btnAlert3 = findViewById<Button>(R.id.kapi3)
        btnAlert3.setOnClickListener {
            val artDialogBuilder3 = AlertDialog.Builder(this@test2)

            artDialogBuilder3.setMessage( "Seçim numarası 3:\n" +
                    "Renkli yol\n" +
                    "Eğer bu yolu seçtiysen, insanlarla kaynaşmayı, herkesle sohbet etmeyi ve büyük tartışmalara girmeyi seven bir kişisin. Dünyanın bir parçası olduğunu hissetmeyi ve her gün insanlarla tanışarak, gürültülü ve hareketli ortamlarda bulunarak bunu deneyimlemeyi seversin. İdeal yolun güzel, renkli ve heyecan vericidir. Senin için yolculuk varış noktasından daha önemlidir. İnsanlarla olmayı seversin ve diğerleri seninle birlikte olmayı çok sever çünkü hem entelektüel hem de esprili bir kişiliğin var. Seninle asla sıkılmazlar!"

            )
            artDialogBuilder3.setTitle(" Renkli Yol")
            artDialogBuilder3.setCancelable(false)
            artDialogBuilder3.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder3.create()
            alertDialogBox.show()
        }
        //***************************************************************************************//
        val btnAlert4 = findViewById<Button>(R.id.kapi4)
        btnAlert4.setOnClickListener {
            val artDialogBuilder4 = AlertDialog.Builder(this@test2)

            artDialogBuilder4.setMessage( "Seçim numarası 4:\n" +
                    "Heyecan yolu\n" +
                    "Eğer bu yolu seçtiysen, takip edilmesi çok zor bir kişisin. Rutinlere katlanamazsın ve hayatında her zaman ileriye doğru gidersin. Bilinmezlikten korkmazsın, aksine onu kucaklarsın. Sonuçları daha sonra düşünmek üzere, hemen harekete geçersin. İdeal yolun tahmin edilemez ve bazen biraz ürkütücüdür. Her zaman kurallara uymayabilirsin, hatta bazen dikkatsiz olabilirsin. İnsanlar senin düşünmeden hareket ettiğini söyler ama bu senin için sorun değil, çünkü bu şekilde hep başarılı oldun. Spontane ve gerçek bir maceraperestsin ve insanlar bunu takdir eder. Onlar bilir ki seninle birlikteyken macera her zaman kapıda!"
            )
            artDialogBuilder4.setTitle(" Heyecan Yolu")
            artDialogBuilder4.setCancelable(false)
            artDialogBuilder4.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder4.create()
            alertDialogBox.show()

    }
        //***************************************************************************************************//
        val btnAlert5 = findViewById<Button>(R.id.kapi5)
        btnAlert5.setOnClickListener {
            val artDialogBuilder5 = AlertDialog.Builder(this@test2)

            artDialogBuilder5.setMessage( "Seçim numarası 5:\n" +
                    "Güvenlik yolu\n" +
                    "Eğer bu yolu seçtiysen, öncelikle sakinliği ve huzuru arayan, sıcak ve rahatlatıcı bir kişisin. Sahip olduğunla yetinirsin ve önemsiz şeyler için rahatsız edilmeyi sevmezsin. İdeal yolun açık, ferah ve oldukça keyiflidir. Yolculuğun tadını sonuna kadar çıkarmayı sevdiğin için, yolculuğunun ne getireceğini bilmek istersin. Bir seçimle karşılaştığında her zaman en kolay ve güvenli yolu seçersin, çünkü hayatın zaten yeterince karmaşık olduğunu düşünürsün ve daha fazla karmaşa eklemek istemezsin. Etrafındaki insanları motive etmeyi bilen çok istikrarlı bir kişisin. Çok gerçekçi ve ayakları yere basan birisin ve insanlar sana güvenmeyi sever çünkü senin tavsiyelerin genellikle çok iyidir."
            )
            artDialogBuilder5.setTitle("Güvenlik yolu ")
            artDialogBuilder5.setCancelable(false)
            artDialogBuilder5.setPositiveButton("kapat") { dialog, _ ->
                dialog.dismiss()
            }
            val alertDialogBox = artDialogBuilder5.create()
            alertDialogBox.show()
        }
            //***************************************************************************************************//
            val btnAlert6 = findViewById<Button>(R.id.kapi6)
            btnAlert6.setOnClickListener {
                val artDialogBuilder6 = AlertDialog.Builder(this@test2)

                artDialogBuilder6.setMessage("Seçim numarası 6:\n" +
                        "Huzur yolunu seçtiysen, gerçek bir yalnızsın. Yalnızlığı çok önemli ve değerli bir şey olarak görürsün ve uzun zamanlar boyunca yalnız olmaktan rahatsızlık duymazsın. İdeal yolun çok sakin ve durgun olur. Etrafında olup bitenleri izlemeyi seversin ve olayların seni sarmasını istemezsin. Bu yüzden sakin ortamları takdir edersin. Hayatın her yönünde derin bir anlam ararsın ve düşüncelerin ve eylemlerinle çok yoğun bir insansın. Kalabalıklardan hoşlanmazsın ama insanları takdir edersin. Genellikle onlarla bire bir görüşmeyi tercih edersin, onlardan tam anlamıyla faydalanmak için. İlişkilerinde samimi ve çok derin bir insansın."

                )
                artDialogBuilder6.setTitle("Huzur Yolu")
                artDialogBuilder6.setCancelable(false)
                artDialogBuilder6.setPositiveButton("kapat") { dialog, _ ->
                    dialog.dismiss()
                }
                val alertDialogBox = artDialogBuilder6.create()
                alertDialogBox.show()
            }
    }
}



