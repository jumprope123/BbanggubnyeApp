package com.acaroom.bbanggubnyeapp.adpaters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.acaroom.bbanggubnyeapp.R
import com.acaroom.bbanggubnyeapp.datas.Baking
import kotlinx.android.synthetic.main.activity_main.view.*

class BakingAdapter(
    val mContext:Context,
    val resId:Int,
    val mList:ArrayList<Baking>) : ArrayAdapter<Baking>(mContext,resId,mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow==null){
            tempRow = inf.inflate(R.layout.baking_list_item,null)
        }
        val row = tempRow!!

        val imagePic = row.findViewById<TextView>(R.id.bakingImage)

        return row
    }
}
