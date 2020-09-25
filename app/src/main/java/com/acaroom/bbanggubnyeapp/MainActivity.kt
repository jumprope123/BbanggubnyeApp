package com.acaroom.bbanggubnyeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acaroom.bbanggubnyeapp.adpaters.BakingAdapter
import com.acaroom.bbanggubnyeapp.datas.Baking
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    val mBakings = ArrayList<Baking>()
    lateinit var mBakingAdapter : BakingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }


    override fun setupEvents() {

    }

    override fun setValues() {

        mBakings.add(Baking("얼그레이 큐브 파운드",3500,"빵굽녀 제작"))
        mBakings.add(Baking("커스터드크림마들렌",3500,"빵굽녀 제작"))
        mBakings.add(Baking("소세지빵",4000,"빵굽녀 제작"))
        mBakings.add(Baking("크렌베리 호두 스콘",3500,"빵굽녀 제작"))
        mBakings.add(Baking("초코 롤 케익",6000,"빵굽녀 제작"))
        mBakings.add(Baking("바스크 치즈 케익",3500,"빵굽녀 제작"))
        mBakings.add(Baking("쑥 인절미 파운드",3500,"빵굽녀 제작"))
        mBakings.add(Baking("레몬 큐브 파운드",3500,"빵굽녀 제작"))
        mBakings.add(Baking("점보스콘",3000,"빵굽녀 제작"))
        mBakings.add(Baking("바나나 큐브 파운드",3500,"빵굽녀 제작"))
        mBakings.add(Baking("르뱅 쿠키",2500,"빵굽녀 제작"))
        mBakings.add(Baking("무화과 크림치즈 빵",3000,"빵굽녀 제작"))
        mBakings.add(Baking("구름 빵",2000,"빵굽녀 제작"))
        mBakings.add(Baking("오트밀 머핀",2500,"빵굽녀 제작"))
        mBakings.add(Baking("점보 쑥콘",3000,"빵굽녀 제작"))
        mBakings.add(Baking("초코 마들렌",1500,"빵굽녀 제작"))
        mBakings.add(Baking("고구마 크림치즈 케익",7000,"빵굽녀 제작"))

        mBakingAdapter = BakingAdapter(this,R.layout.baking_list_item,mBakings)
        bakingListView.adapter = mBakingAdapter
    }
}