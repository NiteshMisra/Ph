package physics.wallah.adapter

import assignment.chatapp.adapter.BaseRecyclerViewAdapter
import physics.wallah.R
import physics.wallah.databinding.ElementTeacherDetailBinding

class TeacherDetailAdapter : BaseRecyclerViewAdapter<Int,ElementTeacherDetailBinding>() {

    override fun getLayout() = R.layout.element_teacher_detail

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ElementTeacherDetailBinding>,
        position: Int
    ) {
        val current = items[position]
        holder.binding.detail.text = ("Maths Expert")
    }
}