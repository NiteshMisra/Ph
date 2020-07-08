package physics.wallah.adapter

import assignment.chatapp.adapter.BaseRecyclerViewAdapter
import physics.wallah.R
import physics.wallah.databinding.ElementBatchTimingBinding

class BatchTimingAdapter : BaseRecyclerViewAdapter<Int,ElementBatchTimingBinding>() {

    override fun getLayout() = R.layout.element_batch_timing

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ElementBatchTimingBinding>,
        position: Int
    ) {
        val current = items[position]
        holder.binding.timing.text = ("MON :5.00 PM - 10.00 PM")
    }
}