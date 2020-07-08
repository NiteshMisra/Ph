package physics.wallah.adapter

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import assignment.chatapp.adapter.BaseRecyclerViewAdapter
import physics.wallah.R
import physics.wallah.databinding.ElementClassesBinding

class RecentClassesAdapter(var context : Context) : BaseRecyclerViewAdapter<Int,ElementClassesBinding>() {

    override fun getLayout() = R.layout.element_classes

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ElementClassesBinding>,
        position: Int
    ) {
        val current = items[position]

        holder.binding.classesTopicRcv.layoutManager = LinearLayoutManager(context)
        val list : ArrayList<Int> = ArrayList()
        for (i in 0..2){
            list.add(i)
        }

        val adapter = RecentClassesTopicAdapter()
        adapter.addItems(list)
        holder.binding.classesTopicRcv.adapter = adapter
    }
}