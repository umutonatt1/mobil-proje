package com.umut.onka

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Article1Activity : AppCompatActivity(),Adapter.MyClickListener{
  private lateinit var recyclerView: RecyclerView
  private lateinit var ArticleList:ArrayList<DataClass>
  private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.article1)




        recyclerView=findViewById(R.id.mRecylerView)
        ArticleList= ArrayList()
        ArticleList.add(DataClass(R.drawable.sadisadi,"Sadizm ve Sadistik Kişilik"))
        ArticleList.add(DataClass(R.drawable.depresyon,"Depresyon\n(Ruhsal Çöküntü)"))
        ArticleList.add(DataClass(R.drawable.ale,"Ailede Mutluluk"))
        ArticleList.add(DataClass(R.drawable.bamllk,"Bağımlılık"))
        ArticleList.add(DataClass(R.drawable.saplant,"Saplantılı Aşk"))
        ArticleList.add(DataClass(R.drawable.i,"İş Bağımlılığı"))
        ArticleList.add(DataClass(R.drawable.kayg,"Kaygı Bozuklukları"))
        ArticleList.add(DataClass(R.drawable.okb,"Obsesif Kompülsif Kişilik Bozukluğu"))
        ArticleList.add(DataClass(R.drawable.fobi,"Sosyal Fobi"))
        ArticleList.add(DataClass(R.drawable.durtu,"Dürtü Kontrol Bozukluğu"))
        ArticleList.add(DataClass(R.drawable.travma,"Travmalar"))
        ArticleList.add(DataClass(R.drawable.stres,"Stres Nedir ?"))
        ArticleList.add(DataClass(R.drawable.yemel,"Anoreksiya\n Nervoza"))
        ArticleList.add(DataClass(R.drawable.uyku,"Uyku Bozukluğu"))
        ArticleList.add(DataClass(R.drawable.unutma,"Alzheimer Hastalığı"))






        adapter= Adapter(ArticleList,this@Article1Activity)
        recyclerView.adapter=adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)
    }

    override fun onClick(position: Int) {
when(position){
    0->startActivity(Intent(this,makale1::class.java))
    1->startActivity(Intent(this,makale2::class.java))
    2->startActivity(Intent(this,makale3::class.java))
    3->startActivity(Intent(this,makale4::class.java))
    4->startActivity(Intent(this,makale5::class.java))
    5->startActivity(Intent(this,makale6::class.java))
    6->startActivity(Intent(this,makale7::class.java))
    7->startActivity(Intent(this,makale8::class.java))
    8->startActivity(Intent(this,makale9::class.java))
    9->startActivity(Intent(this,makale10::class.java))
    10->startActivity(Intent(this,makale11::class.java))
    11->startActivity(Intent(this,makale12::class.java))
    12->startActivity(Intent(this,makale13::class.java))
    13->startActivity(Intent(this,makale14::class.java))
    14->startActivity(Intent(this,makale15::class.java))


}
    }
}