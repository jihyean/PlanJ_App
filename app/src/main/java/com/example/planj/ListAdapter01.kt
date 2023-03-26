package com.example.planj

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.planj.databinding.ItemList01Binding

class ListAdapter01: RecyclerView.Adapter<ListAdapter01.MyView01>() {
    private val data = mapOf(
        "빵" to listOf("빵1", "빵2", "빵3"),
        "고양이" to listOf("고양이1", "고양이2", "고양이3", "고양이4"),
        "쿠키" to listOf("쿠키1", "쿠키2", "쿠키3", "쿠키4", "쿠키5"),
        "강아지" to listOf("강아지1", "강아지2", "강아지3", "강아지4", "강아지5")
    )

//    inner class MyView01(private val binding: ItemList01Binding): RecyclerView.ViewHolder(binding.root) {
//        fun bind(pos: Int) {
//            binding.textView01.text = data.keys.elementAt(pos)
//            binding.recycler02.apply {
//                adapter = ListAdapter02(data.values.elementAt(pos), pos)
//                layoutManager = LinearLayoutManager(binding.recycler02.context, LinearLayoutManager.VERTICAL, false)
//                setHasFixedSize(true)
//            }
//        }
//    }

    val keylist = listOf("빵", "고양이", "쿠키", "강아지")
    val value1 = listOf(listOf("빵1", "빵2", "빵3"), listOf("고양이1", "고양이2", "고양이3", "고양이4"), listOf("쿠키1", "쿠키2", "쿠키3", "쿠키4", "쿠키5"),listOf("강아지1", "강아지2", "강아지3", "강아지4", "강아지5"))
    val value2 = listOf(listOf("빵a", "빵b", "빵c"), listOf("고양이a", "고양이b", "고양이c", "고양이d"), listOf("쿠키a", "쿠키b", "쿠키c", "쿠키d", "쿠키e"),listOf("강아지a", "강아지b", "강아지c", "강아지d", "강아지5e"))

    inner class MyView01(private val binding: ItemList01Binding): RecyclerView.ViewHolder(binding.root) {
        fun bind(pos: Int) {
            binding.textView01.text = keylist.elementAt(pos)
            binding.recycler02.apply {
                adapter = ListAdapter02(value1.elementAt(pos), value2.elementAt(pos), pos)
                layoutManager = LinearLayoutManager(binding.recycler02.context, LinearLayoutManager.VERTICAL, false)
                setHasFixedSize(true)

                binding.btnplus.setOnClickListener{
                    //플러스 버튼 눌러서 데이터 추가
                    Intent(context, AddActivity::class.java).apply {
                        addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    }.run { context.startActivity(this) }

//                    val intent = Intent(this, AddActivity::class.java)
//                    startActivity(intent)
                }
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView01 {
        val view = ItemList01Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyView01(view)
    }

    override fun onBindViewHolder(holder: MyView01, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return keylist.size
    }
}