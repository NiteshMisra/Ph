package physics.wallah.extras

import androidx.recyclerview.widget.DiffUtil

class LiveDiffUtilCallBack : DiffUtil.ItemCallback<Int>() {

    override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean {
        return true
    }

    override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean {
        return true
    }


}