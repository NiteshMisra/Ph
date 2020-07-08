package physics.wallah.adapter

import android.graphics.Color
import android.view.View
import assignment.chatapp.adapter.BaseRecyclerViewAdapter
import physics.wallah.R
import physics.wallah.databinding.ElementDateBinding

class RecentClassDateAdapter(
    var selectedPosition: Int
) : BaseRecyclerViewAdapter<Int, ElementDateBinding>() {

    override fun getLayout() = R.layout.element_date

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ElementDateBinding>,
        position: Int
    ) {
        val current = items[position]
        if (position != selectedPosition){
            holder.binding.arrow.visibility = View.GONE
            holder.binding.layout.setBackgroundResource(R.drawable.date_not_selected_background)
            holder.binding.month.setTextColor(Color.parseColor("#87868B"))
            holder.binding.date.setTextColor(Color.parseColor("#87868B"))
        }else{
            holder.binding.arrow.visibility = View.VISIBLE
            holder.binding.layout.setBackgroundResource(R.drawable.date_selected_background)
            holder.binding.month.setTextColor(Color.parseColor("#FFFFFF"))
            holder.binding.date.setTextColor(Color.parseColor("#FFFFFF"))
        }

        holder.binding.month.text = ("JAN")
        holder.binding.date.text = position.toString()

        holder.binding.layout.setOnClickListener {
            selectedPosition = position
            notifyItemChanged(selectedPosition)
            listener?.invoke(it,current,position)
        }
    }
}