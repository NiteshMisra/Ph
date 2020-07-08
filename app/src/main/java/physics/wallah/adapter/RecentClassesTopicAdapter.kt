package physics.wallah.adapter

import assignment.chatapp.adapter.BaseRecyclerViewAdapter
import physics.wallah.R
import physics.wallah.databinding.ElementClassesTopicsBinding

class RecentClassesTopicAdapter : BaseRecyclerViewAdapter<Int,ElementClassesTopicsBinding>() {

    override fun getLayout() = R.layout.element_classes_topics

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ElementClassesTopicsBinding>,
        position: Int
    ) {
        val current = items[position]
        holder.binding.title.text = ("Fundamental Notes")
    }
}