package physics.wallah.adapter

import assignment.chatapp.adapter.BaseRecyclerViewAdapter
import physics.wallah.R
import physics.wallah.databinding.ElementClassesTopicsBinding
import physics.wallah.databinding.ElementClassroomTopicsBinding

class ClassroomContentAdapter : BaseRecyclerViewAdapter<Int,ElementClassroomTopicsBinding>() {

    override fun getLayout() = R.layout.element_classroom_topics

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ElementClassroomTopicsBinding>,
        position: Int
    ) {
        val items = items[position]
    }
}