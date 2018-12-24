package com.example.richard.oichina.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.richard.oichina.R
import com.example.richard.oichina.adapter.LessonAdapter
import com.example.richard.oichina.model.LessonModel
import kotlinx.android.synthetic.main.basic_fragment.*

/**
 * Created by Richard on 9/23/2018.
 */

class IntermediateLessonFragment : Fragment(), LessonAdapter.ItemClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.intermediate_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val lessonsList = setData()
        setRecyclerView(lessonsList)
    }

    private fun setData(): ArrayList<LessonModel> {
        val paises = arrayOf("Brazil", "Brazil", "China", "China", "USA", "USA")
        val cidades = arrayOf("Sao Paulo", "Rio de Janeiro", "Beijing", "Shanghai", "New York City", "Maimi")
        val lessonNumebers = arrayOf("一", "二", "三", "四", "五", "六")

        val lessons = arrayListOf<LessonModel>()
        for (i in paises.indices) {
            val lesson = LessonModel(paises[i], cidades[i], lessonNumebers[i])
            lessons.add(lesson)
        }

        return lessons
    }

    private fun setRecyclerView(lesson: ArrayList<LessonModel>) {
        val recyclerView = rv_basic_lessons
        val layout = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layout
        recyclerView.adapter = LessonAdapter(lesson, this.context!!, this)
    }

    override fun onItemClick(item: View, position: Int) {
        Toast.makeText(context, "Item Clicked:" + position.toString(), Toast.LENGTH_LONG).show()
    }
}